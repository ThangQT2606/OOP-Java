import java.util.Scanner;

class Distance
{
    private int x;
    private int y;
    public Distance(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    public int add()
    {
        int sum = this.x + this.y;
        return sum;
    }
    public int substract()
    {
        int sub = this.x - this.y;
        return sub;
    }
    public int divide()
    {
        if(this.y == 0)
        {
            return -1;
        }
        else
        {
            return this.x / this.y;
        }
    }
    public void output()
    {
        System.out.println(add() + " " + substract() + " " + divide());
    }
}
public class _24 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0)
        {
            String[] input = sc.nextLine().split(" ");
            Distance d = new Distance(Integer.parseInt(input[0]), Integer.parseInt(input[1]));
            d.output();
        }
    }    
}