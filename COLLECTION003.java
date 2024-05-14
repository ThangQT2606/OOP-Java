import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Scanner;
import java.util.Map;

public class COLLECTION003 
{
    public static void intrarest(Map<String,Integer> map)
    {
        TreeMap<Integer, Integer> hs = new TreeMap<>();
        for(int x : map.values())
        {
            if(!hs.containsKey(x))
            {
                hs.put(x, 1);
            }
            else
            {
                hs.replace(x, hs.get(x)+1);
            }
        }
        int _min = 1000;
        for(int x : hs.keySet())
        {
            if(_min > hs.get(x))
            {
                _min = Math.min(_min, hs.get(x));
            }
        }
        // System.out.println(_min);
        for(Map.Entry<Integer, Integer> entry : hs.entrySet())
        {
            if(entry.getValue() == _min)
            {
                System.out.println(entry.getKey());
                break;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0)
        {
            String[] input = sc.nextLine().split(" ");
            int len = input.length;
            HashMap<String, Integer> map = new HashMap<>();
            for(int i = 0; i < len; i+=2)
            {
                map.put(input[i], Integer.parseInt(input[i+1]));
            }
            intrarest(map);
        }
    }
}
