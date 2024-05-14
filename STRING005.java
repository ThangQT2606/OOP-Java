import java.util.HashSet;
import java.util.Scanner;

public class STRING005 {
    public static boolean isPangram(String sentence) 
    {
        HashSet<Character> hs = new HashSet<>();
        for(char c : sentence.toCharArray())
        {
            hs.add(c);
        }
        if(hs.size() == 26)
        {
            return true;
        }
        else
        {
            return false;
        }    
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0)
        {
            String s = sc.nextLine();
            System.out.println(isPangram(s));
        }
    }
}
