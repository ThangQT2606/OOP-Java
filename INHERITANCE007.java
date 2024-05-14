import java.util.ArrayList;
import java.util.Scanner;

abstract class TestQuestion
{
    protected String question;
    protected abstract void readQuestion(Scanner sc);
}

class Essay extends TestQuestion
{
    private int line;
    public Essay()
    {
    }
    @Override
    public void readQuestion(Scanner sc)
    {
        this.line = sc.nextInt();
        sc.nextLine();
        super.question = sc.nextLine();
    }
    public String toString()
    {
        return this.line + "\n" + super.question;
    }
}

class Multichoice extends TestQuestion
{
    private ArrayList<String> choice = new ArrayList<>();
    public Multichoice()
    {
    }
    @Override
    public void readQuestion(Scanner sc)
    {
        int luachon = sc.nextInt();
        sc.nextLine();
        super.question = sc.nextLine();
        for (int i = 0; i < luachon; i++)
        {
            this.choice.add(sc.nextLine());
        }
    }
    public String toString()
    {
        StringBuffer ss = new StringBuffer(this.choice.size() + "\n" + super.question + "\n");
        for(String x : this.choice)
        {
            ss.append(x).append("\n");
        }
        return ss.toString().trim();
    }

}
public class INHERITANCE007
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        StringBuffer res = new StringBuffer(n + "\n");
        for(int i = 0; i < n; i++)
        {
            String s = sc.nextLine();
            if(s.equals("m"))
            {
                Multichoice mul = new Multichoice();
                mul.readQuestion(sc);
                res.append("m\n");
                res.append(mul.toString()).append("\n");
            }
            else
            {
                Essay es = new Essay();
                es.readQuestion(sc);
                res.append("e\n");
                res.append(es.toString()).append("\n");

            }
        }
        System.out.println(res);
    }
}