import java.util.Scanner;

public class BASIC009 {
    public static int solve(int x, int y)
    {
        if(x == 0 || y == 0) return 0;
        else
        {
            if(x > 0 && y > 0)
            {
                return 1;
            }
            else if(x < 0 && y > 0)
            {
                return 2;
            }
            else if(x < 0 && y < 0)
            {
                return 3;
            }
            else return 4;
        }

    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println(solve(x, y));
        }
    }
}
