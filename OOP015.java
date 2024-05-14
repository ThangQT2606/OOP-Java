import java.util.Scanner;

class Person
{
    private String name;
    private String address;
    public Person(String name, String address)
    {
        this.name = name;
        this.address = address;
    }
    public String toString()
    {
        return this.name + " " + this.address;
    }
}
public class OOP015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0)
        {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            Person P = new Person(s1, s2);
            System.out.println(P.toString());
        }
    }
}