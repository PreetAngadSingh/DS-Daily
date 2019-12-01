
import java.util.*;
public class nov29
{
	static class Node
	{
		Node next;
		int data;
		Node(int data)
		{
			this.data=data;
		}
	}
	static Node head,head1;
	void insert(int data)
	{
		Node temp=new Node(data);
		if(head==null)
		{
			head=temp;
			return;
		}
		Node current=head;
		while(current.next!=null)
		{
			current=current.next;
		}
		current.next=temp;
	}
	void insert1(int data)
	{
		Node temp=new Node(data);
		if(head1==null)
		{
			head1=temp;
			return;
		}
		Node current=head1;
		while(current.next!=null)
		{
			current=current.next;
		}
		current.next=temp;
	}
	void print(Node h)
	{
		Node current=h;
		while(current!=null)
		{
			System.out.print(current.data+" ");
			current=current.next;
		}
		System.out.println();
	}
	static Node add(Node a,Node b)
	{
		Node prev=null;
		Node node=null,node1=null;
		int carry=0,sum;
		while(a!=null||b!=null)
		{
			sum=carry+(a!=null?a.data:0)+(b!=null?b.data:0);
			carry=(sum>=10)?1:0;
			sum=sum%10;
			node=new Node(sum);
			if(node1==null)
				node1=node;
			else
			{
				prev.next=node;
			}
			prev=node;
			if(a!=null)
				a=a.next;
			if(b!=null)
				b=b.next;
		}
		if(carry>0)
			node.next=new Node(carry);
		return node1;
	}
	public static void main(String args[])
	{
		nov29 linkedlist=new nov29();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of first list");
		int size=sc.nextInt();
		System.out.println("Enter the list");
		for(int i=0;i<size;i++)
			linkedlist.insert(sc.nextInt());
		linkedlist.print(linkedlist.head);
		System.out.println("Enter the size of second list");
		int size1=sc.nextInt();
		System.out.println("Enter the list");
		for(int i=0;i<size1;i++)
			linkedlist.insert1(sc.nextInt());
		linkedlist.print(linkedlist.head1);
		Node h=add(head,head1);
		linkedlist.print(h);
	}
}