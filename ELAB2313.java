import java.util.ArrayList;
import java.util.Scanner;

class Point
{
    private double x;
    private double y;
    private double z;
    public Point(double x, double y, double z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public double getX()
    {
        return this.x;
    }
    public double getY()
    {
        return this.y;
    }
    public double getZ()
    {
        return this.z;
    }
}

class Line extends Point
{
    private String name;
    public Line(String name, double x, double y, double z)
    {
        super(x, y, z);
        this.name = name;
    }
    public String getName()
    {
        return this.name;
    }
    public double distance(Line that)
    {
        double ans = Math.sqrt(Math.pow(this.getX()-that.getX(), 2) + Math.pow(this.getY()-that.getY(), 2) + Math.pow(this.getZ()-that.getZ(), 2));
        return ans;
    }
}
public class ELAB2313 
{
    public static Line find(String name, ArrayList<Line> list)
    {
        for(Line x: list)
        {
            if(x.getName().equals(name))
                return x;
        }
        return new Line("Not Found", 0, 0, 0);
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Line> list = new ArrayList<>();
        while(sc.hasNextLine())
        {
            String name = sc.nextLine();
            try
            {
                String[] input = sc.nextLine().split(" ");
                Line line = new Line(name, Double.parseDouble(input[0]), Double.parseDouble(input[1]), Double.parseDouble(input[2]));
                list.add(line);
            }
            catch(Exception e)
            {
                // System.out.println(name);
                Line begin = find(name, list);
                if(begin.getName().equals("Not Found"))
                {
                    System.out.println("invalid input");
                }
                else
                {
                    // System.out.println("AAAA");
                    for(Line x : list)
                    {
                        if(x.getName() != begin.getName())
                        {
                            double ans = begin.distance(x);
                            String tmp = String.format("%.2f", ans);
                            String res = "Line " + begin.getName() + x.getName() + ": ";
                            if(ans > 0)
                            {
                                System.out.println(res + tmp);
                            }
                            else
                            {
                                System.out.println(res + "same point");
                            }
                        }
                    }
                }
            }
        }
    }
}
