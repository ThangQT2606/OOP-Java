import java.util.ArrayList;
import java.util.Scanner;

public class BASIC011 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) 
        {
            String s = sc.nextLine();
            String[] data = s.split(" ");
            ArrayList<Integer> ls = new ArrayList<>();
            for(String x : data)
            {
                ls.add(Integer.parseInt(x));
            }
            int _min = 1000;
            for(int i = 1; i < ls.size(); i++)
            {
                int tmp = ls.get(i) - ls.get(i-1);
                // System.out.println(tmp);
                _min = Math.min(_min, tmp); 
            }
            System.out.println(_min);
        }
    }    
}
