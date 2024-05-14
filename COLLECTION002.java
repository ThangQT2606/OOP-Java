import java.util.*;
public class COLLECTION002 
{
    public static String check(String a, String b)
    {
        if(a.length() < b.length())
        {
            return b;
        }
        else if(a.length() == b.length())
        {
            return b;
        }
        else
        {
            return a;
        }
    }

    public static void removeShorterStrings(ArrayList<String> s)
    {
        ArrayList<String> ans = new ArrayList<>();
        if(s.size() %2 == 0)
        {
            for(int i = 0; i < s.size(); i += 2)
            {
                ans.add(check(s.get(i), s.get(i+1)));
            }
            for(int i = 0; i < ans.size()-1; i++)
            {
                System.out.print(ans.get(i) + " ");
            }
            System.out.println(ans.get(ans.size()-1));
        }
        else
        {
            for(int i = 0; i < s.size()-1; i += 2)
            {
                ans.add(check(s.get(i), s.get(i+1)));
            }
            for(String x : ans)
            {
                System.out.print(x + " ");
            }
            System.out.println(s.get(s.size()-1));
        }
    }
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0)
        {
            String[] input = sc.nextLine().split(" ");
            ArrayList<String> s = new ArrayList<>();
            for(String x : input)
            {
                s.add(x);
            }
            removeShorterStrings(s);
        }
    }
}
