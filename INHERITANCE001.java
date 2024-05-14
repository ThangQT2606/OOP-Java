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
        return this.name + " - " + this.address;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
class Student extends Person
{
    private static int credit = 0;
    public Student(String name, String address)
    {
        super(name, address);
    }
    public void study()
    {
        credit++;
    }
    public int getCredits()
    {
        return this.credit;
    }
}
public class INHERITANCE001 {
    public static void main(String[] args) {
        Student st = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
        System.out.println(st.toString());
        System.out.println("Study credits " + st.getCredits());
        st.study();
        System.out.println("Study credits " + st.getCredits());
    }
}
