import java.util.Scanner;
public class BASIC005
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t > 0)
        {
            t -= 1;
            int sum = 0;
            String s = sc.nextLine();
            String [] token = s.split(" ");
            for (String c : token)
            {
                int so_tmp = Integer.parseInt(c);
                sum += so_tmp;
            }
            System.out.println(sum);
        }
    }
}