import java.util.Scanner;
public class nov23 { 

	static Node head; 

	static class Node { 

		int data; 
		Node next, prev; 

		Node(int d) { 
			data = d; 
			next = prev = null; 
		} 
	} 
	void insert(int data) {
		Node node=new Node(data);
		if(head==null)
		{
			head=node;
			return;
		}
		Node current=head;
		while(current.next!=null)
		{
			current=current.next;
		}
		current.next=node;
		node.next=null;
		node.prev=current;
	}
	
	void reverse() { 
		Node temp = null; 
		Node current = head; 
		while (current != null) { 
			temp = current.prev; 
			current.prev = current.next; 
			current.next = temp; 
			current = current.prev; 
		} 
		if (temp != null) { 
			head = temp.prev; 
		} 
	} 

	public static void main(String[] args) { 
		Scanner s = new Scanner(System.in);
		nov23 list = new nov23();
		System.out.println("Enter size of list");
        int n = s.nextInt();
        
        System.out.println("Enter elements of list");
        for(int i=0;i<n;i++)
        list.insert(s.nextInt());

		list.reverse(); 
		System.out.println("Reversed Linked List");
		while (head != null) { 
			System.out.print(head.data + " "); 
			head = head.next; 
		} 
	} 
}
