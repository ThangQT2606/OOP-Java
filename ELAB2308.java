import java.util.Scanner;
import java.text.DecimalFormat;
abstract class Car
{
    protected double price;
    protected int year;
    public Car(double price, int year)
    {
        this.price = price;
        this.year = year;
    }

    public String toString() 
    {
        return "Not found Type of Car";
    }

    abstract double calculateSalePrice();
}
class SportCar extends Car
{
    public SportCar(double price, int year)
    {
        super(price, year);
    }
    public double calculateSalePrice()
    {
        double sale = 0;
        if (super.year > 2018)
        {
            sale = super.price*0.2;
        }
        else if (super.year > 2010) 
        {
            sale = super.price*0.5;    
        }
        else
        {
            sale = super.price*0.9;
        }
        return super.price-sale;
    }
    public String toString()
    {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        return "Price: " + df.format(calculateSalePrice())+ " VND | Year: " + super.year;
    }
}

class ClassicCar extends Car
{
    public ClassicCar(double price, int year)
    {
        super(price, year);
    }
    public double calculateSalePrice()
    {
        return super.price*1.12 + 2e7;
    }
    public String toString()
    {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        return "Price: " + df.format(calculateSalePrice())+ " VND | Year: " + super.year;
    }
}
public class ELAB2308 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        double maxSalePrice = 0;
        while(t-- > 0)
        {
            String[] input = sc.nextLine().split("\\s+");
            Car car;
            if (input[0].equals("SC")) 
            {
                car = new SportCar(Double.parseDouble(input[1]), Integer.parseInt(input[2]));
            }
            else
            {
                car = new ClassicCar(Double.parseDouble(input[1]), Integer.parseInt(input[2]));
            }
            double salePrice = car.calculateSalePrice();
            System.out.println(car.toString());
            
            // Cập nhật giá lăn bánh cao nhất nếu cần
            if (salePrice > maxSalePrice) 
            {
                maxSalePrice = salePrice;
            }
        }
        DecimalFormat df = new DecimalFormat("#,##0.00");
        System.out.println("Most Expensive: " + df.format(maxSalePrice) + " VND");
    }
}
