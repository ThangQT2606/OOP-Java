import java.util.Scanner;

public class string004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0)
        {
            String s = sc.nextLine();
            StringBuffer sb = new StringBuffer(s);  
            System.out.println(sb.length());
        }
    }
}
