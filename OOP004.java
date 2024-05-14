import java.util.Scanner;

class Point
{
    private int x;
    private int y;
    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    public int getX()
    {
        return this.x;
    }
    public int getY()
    {
        return this.y;
    }
    public void move(int dx, int dy)
    {
        this.x += dx;
        this.y += dy;
    }
    public double distanceTo(Point p)
    {
        double result = Math.sqrt(Math.pow(p.getX() - this.x, 2) + Math.pow(p.getY() - this.y, 2));
        return result;
    }
}
public class OOP004 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0)
        {
            String[] input = sc.nextLine().split(" ");
            Point a = new Point(Integer.parseInt(input[0]), Integer.parseInt(input[1]));
            Point b = new Point(Integer.parseInt(input[2]), Integer.parseInt(input[3]));
            a.move(1, 1);
            String ans = String.format("%.2f", a.distanceTo(b));
            System.out.println(ans);
        }
    }    
}
