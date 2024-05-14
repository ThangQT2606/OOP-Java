import java.util.Scanner;
public class ELAB2312
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) 
        {
            String line = sc.nextLine();
            int cnt = 0;
            for (char c : line.toCharArray()) 
            {
                if (Character.isDigit(c)) 
                {
                    ++cnt;
                }
            }
            System.out.println(cnt);
        }
    }
}