import java.util.ArrayList;
import java.util.Scanner;

class NotJavaFileException extends Exception {
    public NotJavaFileException(String message) {
        super(message);
    }
}

public class EXCEPTION002 {
    public int CheckFileExtension(String fileName) throws NotJavaFileException {
        if (fileName == null || fileName.isEmpty()) {
            throw new NotJavaFileException("Not java file exception.Mark is");
        }

        if (fileName.endsWith(".java")) 
        {
            return 1;
        } 
        else 
        {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0)
        {
            EXCEPTION002 grader = new EXCEPTION002();
            String s = sc.nextLine();
            try 
            {
                System.out.println(grader.CheckFileExtension(s));
            } 
            catch (NotJavaFileException e) 
            {
                System.out.print(e.getMessage() + " ");
                System.out.println("-1");
            }
        }

    }
}
