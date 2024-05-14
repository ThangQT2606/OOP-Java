import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Item
{
    private String name;
    private double price;
    private double discount;
    public Item(String name, double price, double discount)
    {
        this.name = name;
        this.price = price;
        this.discount = discount;
    }
    public double getPrice()
    {
        return this.price;
    }
    public double getDiscount()
    {
        return this.discount;
    }
    @Override
    public String toString()
    {
        return String.format("%s $%.2f (-$%.2f)", this.name, this.price, this.discount);
    }
}

class Employee
{
    private String name;
    public Employee(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return this.name;
    }
}

class GroceryBill
{
    protected Employee clerk;
    protected ArrayList<Item> receipt;
    protected double total;
    public GroceryBill(Employee clerk)
    {
        this.clerk = clerk;
        this.receipt = new ArrayList<>();
        this.total = 0.0;
    }
    public void add(Item items)
    {
        this.receipt.add(items);
        this.total += items.getPrice();
    }
    public double getTotal()
    {
        return this.total;
    }
    public Employee getClerk()
    {
        return this.clerk;
    }
    @Override
    public String toString()
    {
        StringBuffer s = new StringBuffer();
        s.append("items:\n");
        for(Item x : receipt)
        {
            s.append("   ").append(x.toString()).append("\n");
        }
        s.append("total: $").append(String.format("%.2f", this.getTotal())).append("\n");
        s.append("Clerk: ").append(this.clerk.getName()).append("\n");
        // s.append("\n");
        return s.toString();
    }
}

class DiscountBill extends GroceryBill
{
    private double discountAmount;
    public DiscountBill(Employee clerk)
    {
        super(clerk);
        this.discountAmount = 0.0;
    }
    public void add(Item items)
    {
        super.add(items);
        this.discountAmount += items.getDiscount();
    }
    @Override
    public String toString()
    {
        StringBuffer s = new StringBuffer(super.toString());
        s.replace(s.indexOf("total:"), s.length(), "");
        s.append("sub-total: $").append(String.format("%.2f", super.getTotal())).append("\n");
        s.append("discount: $").append(String.format("%.2f", discountAmount)).append("\n");
        s.append("total: $").append(String.format("%.2f", super.getTotal() - discountAmount)).append("\n");
        s.append("Clerk: ").append(super.getClerk().getName());
        return s.toString();
    }
}
public class INHERITANCE003{
    
    public static void main(String[] agrs){
        Employee clerk1 = new Employee("Grocery Bill");
        GroceryBill bill1 = new GroceryBill(clerk1);
        bill1.add(new Item("item 1", 2.30, 0));
        bill1.add(new Item("item 2", 3.45, 0));
        System.out.println(bill1);

        // Clerk 2
        Employee clerk2 = new Employee("Discount Bill");
        DiscountBill bill2 = new DiscountBill(clerk2);
        bill2.add(new Item("item 3", 20, 15));
        bill2.add(new Item("item 4", 40, 35));
        bill2.add(new Item("item 5", 50, 35));
        System.out.println(bill2);
    }
}