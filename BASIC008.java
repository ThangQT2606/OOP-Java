public class BASIC008 {
    public static void solve()
    {
        int sum = 0;
        for(int i = 101; i <= 200; i++)
        {
            if(i % 9 == 0)
            {
                sum += i;
                System.out.println(i);
            }
        }
        System.out.println(sum);
    }
    public static void main(String[] args)
    {
        System.out.println("Numbers between 100 and 200, divisible by 9:");
        solve();
    }
}
