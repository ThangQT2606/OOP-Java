import java.util.HashMap;
import java.util.Scanner;

class Account
{
    private String username;
    private HashMap<Integer, Note> note;
    public Account()
    {
        this.note = new HashMap<>();
    }
    public Account(String username) 
    {
        this.username = username;
        this.note = new HashMap<>();
    }
    public Account(String username, HashMap<Integer, Note> note) 
    {
        this.username = username;
        this.note = note;
    }
    public void addNote(Note note)
    {
        this.note.put(this.note.size()+1,note);
    }
    public Note share(int id)
    {
        return this.note.get(id);
    }
    public String getUsername()
    {
        return this.username;
    }
    public HashMap<Integer, Note> getNote()
    {
        return this.note;
    }
    
}
class Note
{
    String content;
    String createdTime;
    public Note() 
    {
    }
    public Note(String content, String createdTime) 
    {
        this.content = content;
        this.createdTime = createdTime;
    }
    public String getContent() 
    {
        return content;
    }
    public String getCreatedTime() 
    {
        return createdTime;
    }
}
public class ELAB2315 
{
    public static void main(String[] args)
    {
        HashMap<Integer, Account> acc = new HashMap<>();

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++)
        {
            String username = sc.nextLine();
            acc.put(i+1, new Account(username));
        }
        while(sc.hasNextLine())
        {
            String[] data = sc.nextLine().split(" ", 3);
            switch (data[1]) 
            {
                case "Add":
                    String[] tmp = data[2].split(" ", 2);
                    String date = tmp[0].substring(tmp[0].length()-4,tmp[0].length()-2) + " " + tmp[0].substring(0, tmp[0].length()-4) + " " + tmp[0].substring(tmp[0].length()-2);
                    acc.get(Integer.parseInt(data[0])).addNote(new Note(tmp[1],date));
                    break;
                case "Share":
                    String[] tmp1 = data[2].split(" ", 2);
                    acc.get(Integer.parseInt(tmp1[0])).addNote(acc.get(Integer.parseInt(data[0])).share(Integer.parseInt(tmp1[1])));
                    break;
                default:
                    System.out.print("invalid input");
                    return;
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.printf("Account: %s\n",acc.get(i+1).getUsername());
            HashMap<Integer, Note> note = acc.get(i+1).getNote();
            for(int key : note.keySet())
            {
                System.out.printf("%s | %s\n",note.get(key).getCreatedTime(), note.get(key).getContent());
            }
        }
    }
}
