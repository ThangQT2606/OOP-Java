class SimpleDate
{
    private int day;
    private int month;
    private int year;
    public SimpleDate(int day, int month, int year)
    {
        this.day = day;
        this. month = month;
        this.year = year;
    }   
    public boolean equals(SimpleDate other)
    {
        if(this.day == other.day && this.month == other.month && this.year == other.year)
        {
            return true;
        }
        else return false;
    }
}
public class OBJECT_REFERENCES002 {
    public static void main(String[] args) {
        SimpleDate d = new SimpleDate(1, 2, 2000);
        System.out.println(d.equals("heh"));
        System.out.println(d.equals(new SimpleDate(5, 2, 2012)));
        System.out.println(d.equals(new SimpleDate(1, 2, 2000)));
    }
}
