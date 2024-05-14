import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BASIC012 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < t; i++)
        {
            // ArrayList<Integer> arr = new ArrayList<>();
            String s = sc.nextLine();
            String [] token = s.split(" ");
            int size = token.length;
            int [] a = new int[size];
            int [] L = new int[size];
            for (int j = 0; j < size; j++) 
            {
                a[j] = Integer.parseInt(token[j]);
            }
            for(int k = 1; k < size; k++)
            {
                if(a[k-1] <= a[k])
                {
                    L[k] = L[k-1]+1;
                }
            }
            // for(int in = 0; in < size; in++)
            // {
            //     System.out.print(L[in] + " ");
            // }
            // System.out.println();
            System.out.println(Arrays.stream(L).max().getAsInt()+1);
        }
    }
}
