
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
        public double slope(Point other)
        {
            if (this.x == other.x) 
            {
                return -1;
            }
            else
            {
                double result = (double) (other.y - this.y) / (other.x - this.x);
                if(result == -0.0)
                {
                    return 0.0;
                }
                else return result;
            }
                
        }
    }
public class OOP009 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            Point P1 = new Point(x1, y1);
            Point P2 = new Point(x2, y2);
            System.out.println(P1.slope(P2));
        }
    }
}
