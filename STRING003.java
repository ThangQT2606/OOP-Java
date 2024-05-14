import java.util.Scanner;

public class STRING003 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0)
        {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            s1 = s1.toLowerCase();
            s2 = s2.toLowerCase();
            if(s1.equals(s2))
            {
                System.out.println("true");
            }
            else
            {
                System.out.println("false");
            }
        }     
    }    
}
