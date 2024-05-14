import java.util.ArrayList;
import java.util.Scanner;

class Account
{
    private int id;
    private String name;
    private int surplus;
    public Account(int id, String name, int surplus)
    {
        this.id = id;
        this.name = name;
        this.surplus = surplus;
    }
    public int getId()
    {
        return this.id;
    }
    public String getName()
    {
        return this.name;
    }
    public int getSurplus()
    {
        return this.surplus;
    }
    public void rut(int number)
    {
        if(this.surplus >= number)
            this.surplus -= number;
    }
    public void nap(int number)
    {
        this.surplus += number;
    }
    public void chuyen(Account that, int number)
    {
        if (this.surplus >= number) 
            {
                this.surplus -= number;
                that.nap(number);
            }
    }
    @Override
    public String toString()
    {
        String s = String.format("%03d", this.id);
        return "[" + s + ", " + this.name + ", " + this.surplus + "]";
    }
}
public class LAB02_StaticClass{
    public static boolean checkId(ArrayList<Account> list_Account, int id) 
    {
        for (Account acc : list_Account) 
        {
            if (acc.getId() == id) 
            {
                return true; 
            }
        }
        return false;
    }
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0)
        {
            ArrayList<Account> acc = new ArrayList<>();
            int n = Integer.parseInt(sc.next());
            String[] input = sc.nextLine().split(" ");
            String tmp = "";
            int cnt = 1;
            for(int i = 0; i < input.length; i++)
            {
                try
                {   
                    acc.add(new Account(cnt, tmp.trim(), Integer.parseInt(input[i])));
                    cnt++;
                    tmp = "";
                }
                catch(Exception e)
                {
                    tmp = tmp + input[i] + " ";
                }
            }
            if(!tmp.equals( ""))
            {
                acc.add(new Account(cnt, tmp.trim(), 0));
            }
            int m = sc.nextInt();
            for(int i = 0; i < m; i++)
            {
                String in = sc.next();
                if(in.equals("rut"))
                {
                    int id = Integer.parseInt(sc.next());
                    int amount = Integer.parseInt(sc.next());
                    if(checkId(acc, id))
                    {
                        acc.get(id-1).rut(amount);
                    }
                }
                else if(in.equals("chuyen"))
                {
                    int id1 = Integer.parseInt(sc.next());
                    int id2 = Integer.parseInt(sc.next());
                    int amount = Integer.parseInt(sc.next());
                    if(checkId(acc, id1) && checkId(acc, id2))
                    {
                        acc.get(id1-1).chuyen(acc.get(id2-1), amount);
                    }
                }
                else
                {
                    int id = Integer.parseInt(sc.next());
                    int amount = Integer.parseInt(sc.next());
                    if(checkId(acc, id))
                    {
                        acc.get(id-1).nap(amount);
                    }
                }
            }
            for(Account x : acc)
            {
                System.out.print(x.toString());
            }
            System.out.println();
        }
    }
}