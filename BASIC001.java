import java.util.Scanner;
public class BASIC001
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t > 0)
        {
            t -= 1;
            String s = sc.nextLine();
            System.out.println(s);
        }
    }
}