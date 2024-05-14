import java.util.Scanner;

public class LAB01_ClassMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) 
        {
            String s = sc.nextLine();
            String[] res = s.split(" ");
            System.out.println(s.length() + " " + res.length);
        }
    }
}