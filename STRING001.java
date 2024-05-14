import java.util.Scanner;

public class STRING001 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0)
        {
            String[] input = sc.nextLine().split(" ");
            StringBuffer tmp = new StringBuffer();
            int cnt = 0;
            for(char x : input[0].toCharArray())
            {
                if(cnt == Integer.parseInt(input[1]))
                {
                    tmp.append(x);
                }
                cnt += 1;
            }
            // System.out.println(tmp);
            System.out.println("The character at position " + input[1] + " is " + tmp);
        }
    }
}
