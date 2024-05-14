class Money
{
    private int euros;
    private int cents;
    public Money(int euros, int cents)
    {
        this.euros = euros;
        this.cents = cents;
    }
    public Money(Money money) 
    {
        this.euros = money.euros;
        this.cents = money.cents; 
    }
    public void plus(Money added)
    {
        this.euros += added.euros;
        this.cents += added.cents;
    }
    public boolean lessThan(Money compare)
    {
        if(this.euros < compare.euros)
        {
            return true;
        }
        else return false;
    }
    public void minus(Money minus)
    {
        if(this.cents < minus.cents)
        {
            this.cents = 100-minus.cents;
            this.euros -= 1;
        }
        else
        {
            this.cents -= minus.cents;
        }
        if(this.euros < minus.euros)
        {
            this.euros = 0;
            this.cents = 0;
        }
        else
        {
            this.euros -= minus.euros;
        }
    }
    @Override
    public String toString()
    {
        String tmp1 = String.format("%d", this.euros);
        String tmp2 = String.format("%02d", this.cents);
        return tmp1 + "." + tmp2 + "e";
    }
}

public class CONTEST006 {
    public static void main(String[] args) {
        Money a = new Money(10, 8);
        Money b = new Money(5, 5);
        Money c = new Money(a);
        c.plus(b);
        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());
        Money u = new Money(10, 0);
        Money y = new Money(3, 0);
        Money w = new Money(5, 0);
        System.out.println(u.lessThan(y));
        System.out.println(y.lessThan(w));
        Money m = new Money(10, 0);
        Money n = new Money(3, 50);
        Money o = new Money(m);
        o.minus(n);
        System.out.println(m.toString());
        System.out.println(n.toString());
        System.out.println(o.toString());
        o.minus(m);
        System.out.println(o.toString());
    }
}
