import java.util.*;
public class nov19 {
	
	static Node head;
	static class Node{
		int data;
		Node next;
		Node(int item){
			data = item;
			next = null;
		}
	}
	
	public void insert(int new_data) 
	{
	    Node new_node = new Node(new_data);
	    if (head == null) 
	    { 
	        head = new Node(new_data); 
	        return; 
	    }
	    new_node.next = null; 
	    Node last = head;  
	    while (last.next != null) 
	        last = last.next; 
	    last.next = new_node; 
	    return; 
	}
	
	static void rotate(int r) {
		if (r == 0) return;  
        Node current  = head;  
        int count = 1; 
        while (r>1 && current !=  null) 
        { 
            current = current.next; 
            r--; 
        } 
        if (current == null) 
            return;  
        Node lastNode = current;  
        while (current.next != null) 
            current = current.next; 
        current.next = head;  
        head = lastNode.next;
        lastNode.next = null; 
		
	}
	
	static void print(Node node) {
		while(node!=null) {
			System.out.print(node.data + " ");
			node=node.next;
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		nov19 list = new nov19();
		System.out.println("Enter size of list");
        int n = s.nextInt();
        
        System.out.println("Enter the elements of list");
        for(int i=0;i<n;i++)
        list.insert(s.nextInt());
        
        System.out.println("Rotate how many times");
        int r = s.nextInt();
        
         list.rotate(r);
 		System.out.println("Rotated List :");
 		list.print(head);
	}
}
