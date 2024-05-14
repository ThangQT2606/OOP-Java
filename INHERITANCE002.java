import java.util.ArrayList;

abstract class Box
{
    void add(Item item){

    };
    boolean isInBox(Item item){
        return true;
    };
}


class Item
{
    private String name;
    private int weight;
    public Item(String name, int weight)
    {
        this.name = name;
        this.weight = weight;
    }
    public Item(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return this.name;
    }
    public int getWeight()
    {
        return this.weight;
    }

}

class BoxWithMaxWeight extends Box
{
    private ArrayList<Item> list = new ArrayList<>();
    private int maxWeight;
    public BoxWithMaxWeight(int maxWeight)
    {
        this.maxWeight = maxWeight;
    }
    public void add(Item item)
    {
        if(item.getWeight() <= this.maxWeight)
        {
            list.add(item);
            maxWeight -= item.getWeight();
        }
    }
    public boolean isInBox(Item item)
    {
        for (Item i : list) 
        {
            if (i.getName().equals(item.getName())) 
            {
                return true;
            }
        }
        return false;
    }
}

public class INHERITANCE002 {
    public static void main(String[] args) {
        BoxWithMaxWeight boxmax = new BoxWithMaxWeight(10);
        boxmax.add(new Item("Saludo", 5));
        boxmax.add(new Item("Pirkka", 5));
        boxmax.add(new Item("Kopi Luwak", 5));
        System.out.println(boxmax.isInBox(new Item("Saludo")));
        System.out.println(boxmax.isInBox(new Item("Pirkka")));
        System.out.println(boxmax.isInBox(new Item("Kopi Luwak")));
    }
}