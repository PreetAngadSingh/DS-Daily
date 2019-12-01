import java.util.*;
public class nov30 
{
	Stack<Integer> s=new Stack<Integer>();
	static class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
			next=null;
		}
	}
	static Node head;
	void insert(int data)
	{
		Node tem=new Node(data);
		if(head==null)
		{
			head=tem;
			return;
		}
		Node current=head;
		while(current.next!=null)
		{
			current=current.next;
		}
		current.next=tem;
	}
	void check(int size)
	{
		int count=0;
		Node current=head;
		while(current!=null)
		{
			s.push(current.data);
			current=current.next;
		}
		Node cur1=head;
		while(cur1!=null&&!s.isEmpty())
		{
			int x=s.pop();
			if(x==cur1.data)
			{
				count++;
			}
			cur1=cur1.next;
		}
		if(count==size)
		{
			System.out.println("Pallindrome");
		}
		else
		{
			System.out.println("Not  Pallindrome");
		}
	}
	public static void main(String args[])
	{
		nov30 p=new nov30();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		System.out.println("Enter the elements");
		for(int i=0;i<size;i++)
			p.insert(sc.nextInt());
		p.check(size);
	}

}