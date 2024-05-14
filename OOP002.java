import java.util.Scanner;

class Rectangle
{
    private int x;
    private int y;
    private int width;
    private int height;
    public Rectangle (int x, int y, int width, int height)
    {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    @Override
    public String toString()
    {
        // return "Rectangle[x=1,y=2,width=3,height=4]"
        return "Rectangle[" + "x=" + this.x + ',' + "y=" + this.y + ',' + "width=" + this.width + ',' + "height=" + this.height + ']';
    }
}

public class OOP002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0)
        {
            String[] input = sc.nextLine().split(" ", 4);
            int x = Integer.parseInt(input[0]);
            int y = Integer.parseInt(input[1]);
            int w = Integer.parseInt(input[2]);
            int h = Integer.parseInt(input[3]);
            Rectangle HCN = new Rectangle(x, y, w, h);
            System.out.println(HCN.toString());

        }
    }
}