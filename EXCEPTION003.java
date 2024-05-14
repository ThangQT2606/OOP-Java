import java.util.Scanner;

public class EXCEPTION003 
{
    public static boolean hasVowels(String str)
    {
        str = str.toUpperCase();
        if (str.contains("A") || str.contains("E") || str.contains("U") || str.contains("O") || str.contains("I"))
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0)
        {
            String s = sc.nextLine();
            if(hasVowels(s))
            {
                System.out.println("String has vowels");
            }
            else
            {
                try
                {
                    throw new Exception("String not contain vowels");
                }
                catch(Exception e)
                {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
