import java.util.Scanner;

public class BASIC007 {
    public static boolean check_leapYear(int n)
    {
        if((n % 4 == 0 && n % 100 != 0) || n % 400 == 0)
        {
            return true;
        }
        else return false;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            if(check_leapYear(n))
            {
                System.out.println(n + " : Leap-year");
            }
            else
            {
                System.out.println(n + " : Non Leap-year");
            }
        }
    }
}
