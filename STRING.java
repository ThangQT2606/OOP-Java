import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class STRING 
{
    public static String findLongestWord(String sentence) 
    {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        ArrayList<String> res = new ArrayList<>();
        String[] input = sentence.split(" ");
        for(String x : input)
        {
            if(map.containsKey(x))
            {
                map.remove(x);
                map.put(x, x.length());
            }
            else
            {
                map.put(x, x.length());
            }
        }
        int value = -1000;
        for(String x : map.keySet())
        {
            if(map.get(x) >= value)
            {
                value = map.get(x);
            }
        }
        for(String x : map.keySet())
        {
            if(map.get(x) == value)
            {
                res.add(x);
            }
        }
        return res.get(res.size()-1);
        // for(String i : map.keySet())
        // {
        //     System.out.print(i + " " + map.get(i) + " ");
        // }   
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- >0)
        {
            String s = sc.nextLine();
            if(s.isEmpty())
            {
                System.out.println("");
            }
            else
            {
                System.out.println(findLongestWord(s));
                // findLongestWord(s);
                // System.out.println();
            }
        }
    }
}
