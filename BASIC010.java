import java.util.Scanner;

public class BASIC010 {
    public static int count(int n)
    {
        if(n == 0) return 0;
        else
        {
            int cnt = 0;
            while (n != 0) 
            {
                cnt++;
                n/=10;
            }
            return cnt;
        }
    }
    public static void swap(int[] a, int i, int j)
    {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
    public static void swapDigitPairs(int[] a, int cnt)
    {
        if(cnt % 2 == 0)
        {
            for(int i = 0; i < cnt; i+=2)
            {
                swap(a, i, i+1);
            }     
        }
        else
        {
            for(int i = 0; i < cnt-1; i+=2)
            {
                swap(a, i, i+1);
            }
        }
        if(a[cnt-1] != 0)
        {
            System.out.print(a[cnt-1]);
        }
        for(int i = cnt-2; i >= 0; i--)
        {
            System.out.print(a[i]);   
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        // sc.nextLine();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int cnt = count(n);
            int index = 0;
            int[] a = new int[cnt+3];
            while (n != 0) 
            {
                a[index++] = n%10;
                n/= 10;
            }
            // System.out.println(cnt);
            // for (int x : a)
            // {
            //     System.out.println(x);
            // }
            swapDigitPairs(a, cnt);
        }
    }
}