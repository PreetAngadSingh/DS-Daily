import java.util.*;
public class dec3
{
    static Queue<Integer> q1=new LinkedList<Integer>();
    static Queue<Integer> q2=new LinkedList<Integer>();
    
    public static void push(int data)
    {
        while(!q1.isEmpty())
        {
            q2.add(q1.poll());
        }
        q1.add(data);
        while(!q2.isEmpty())
        {
            q1.add(q2.poll());
        }
    }
    public static void pop()
    {
        q1.poll();
    }
    public static void display()
    {
        System.out.println(q1);
    }
    
    public static void main(String args[])
    {
        dec3 sq=new dec3();
        sq.push(10);
        sq.push(20);
        sq.push(30);
        sq.push(40);
        display();
        sq.pop();
        display();
        
    }
}