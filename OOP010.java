import java.util.Scanner;

class Product
{
    private String name;
    private String location;
    private int weight;
    public Product(String name)
    {
        this.name = name;
        this.location = "shelf";
        this.weight = 1;

    }
    public Product(String name, String location)
    {
        this.name = name;
        this.location = location;
        this.weight = 1;
    }
    public Product(String name, int weight)
    {
        this.name = name;
        this.location = "shelf";
        this.weight = weight;
    }
    public String toString()
    {
        return this.name + " (" + this.weight + "kg) can be found from the " + this.location;
    }
}
public class OOP010 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Product P1 = new Product("Tape measure");
        Product P2 = new Product("Plaster", "home improvement section");
        Product P3 = new Product("Tyre", 5);
        System.out.println(P1.toString());
        System.out.println(P2.toString());
        System.out.println(P3.toString());
    }
}
