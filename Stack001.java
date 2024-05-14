import java.util.Scanner;
import java.util.Stack;

public class Stack001 
{
    public static void compressDuplicates(Stack<Integer> s)
    {
        if(s.isEmpty())
        {
            return;
        }
        int cur = s.peek();
        s.pop();
        int cnt = 1;
        Stack<Integer> store = new Stack<>();
        while(!s.empty())
        {
            if(cur == s.peek())
            {
                cnt++;
                s.pop();
            }
            else
            {
                store.push(cur);
                store.push(cnt);
                cnt = 1;
                cur = s.peek();
                s.pop();
            }
        }
        store.push(cur);
        store.push(cnt);
        while (store.size() > 1) 
        {
            System.out.print(store.peek() + " ");
            store.pop();   
        }
        System.out.print(store.peek());
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t -- > 0)
        {
            String s = sc.nextLine();
            String[] token = s.split(" ");
            Stack<Integer> st = new Stack<>();
            for(String x : token)
            {
                st.push(Integer.parseInt(x));
            }
            compressDuplicates(st);
            System.out.println();
        }
    }    
}
