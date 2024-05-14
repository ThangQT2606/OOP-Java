import java.util.Scanner;

class Song
{
    private String name;
    private String author;
    private int duration;
    public Song(String name, String author, int duration)
    {
        this.name = name;
        this.author = author;
        this.duration = duration;
    }
    public boolean equals(Song other)
    {
        if(this.name.equals(other.name) && this.author.equals(other.author)  && this.duration == other.duration)
        {
            return true;
        }
        else return false;
    }
}
public class OBJECT_REFERENCES001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0)
        {
            String[] s1 = sc.nextLine().split(" ", 3);
            String[] s2 = sc.nextLine().split(" ", 3);
            int s12 = Integer.parseInt(s1[2]);
            int s22 = Integer.parseInt(s2[2]);
            Song song1 = new Song(s1[0], s1[1], s12);
            Song song2 = new Song(s2[0], s2[1], s22);
            System.out.println(song1.equals(song2));
        }
    }
}