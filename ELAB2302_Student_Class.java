import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student
{
    private String name;
    private int age;
    public static int numberOfStudent = 0;
    public Student(String name, int age)
    {
        this.name = name;
        this.age = age;
        numberOfStudent++;
    } 
    public void display()
    {
        if(this.age >= 18)
        {
            System.out.println(this.name);
        }
    }
    public static int getNumberOfStudent()
    {
        return numberOfStudent;
    }
}
public class ELAB2302_Student_Class
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        List<Student> list_std = new ArrayList<>();
        while(sc.hasNextLine())
        {
            String name = sc.nextLine();
            int age = Integer.parseInt(sc.nextLine());
            Student std = new Student(name, age);
            list_std.add(std);
        }
        for(Student x : list_std)
        {
            x.display();
        }
        System.out.println(list_std.size());
    }    
}
