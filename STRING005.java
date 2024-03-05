import java.util.HashSet;
import java.util.Scanner;

public class STRING005 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0)
        {
            String s = sc.nextLine();
            HashSet<Character> hs = new HashSet<>();
            for(char c : s.toCharArray())
            {
                hs.add(c);
            }
            if(hs.size() == 26)
            {
                System.out.println("true");
            }
            else System.out.println("false");
        }
    }
}
