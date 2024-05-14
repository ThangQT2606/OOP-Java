import java.util.Scanner;
abstract class Shape
{
    private String name;
    public Shape(String name)
    {
        this.name = name;
    }
    abstract double calculateArea();
    public void displayInfo()
    {

    }
}

class Rectangle extends Shape
{
    private double width;
    private double length;
    public Rectangle(String name, double width, double length)
    {
        super(name);
        this.width = width;
        this.length = length;
    }
    public double calculateArea()
    {
        return this.width*this.length;
    }
    public void displayInfo()
    {
        String res = String.format("%.2f", calculateArea());
        System.out.println("Shape:Rectangle" + "|Area:" + res);
    }
}
class Circle extends Shape
{
    double radius;
    public Circle(String name, double radius)
    {
        super(name);
        this.radius = radius;
    }
    public double calculateArea()
    {
        return Math.PI*this.radius*this.radius;
    }
    public void displayInfo()
    {
        String res = String.format("%.2f", calculateArea());
        System.out.println("Shape:Circle" + "|Area:" + res);
    }
}
public class OOP005 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) 
        {
            String[] input = sc.nextLine().split(" ");
            // System.out.println(input[0]);
            switch (input[0]) {
                case "Rectangle":
                    Rectangle r = new Rectangle(input[0], Integer.parseInt(input[1]), Integer.parseInt(input[2]));
                    r.calculateArea();
                    r.displayInfo();
                    break;
                
                case "Circle":
                    Circle c = new Circle(input[0], Double.parseDouble(input[1]));
                    c.calculateArea();
                    c.displayInfo();
                    break;
                default:
                    break;
            }

        }
    }
}