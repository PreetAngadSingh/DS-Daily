import java.util.*;
public class nov17 {
	static Node head;
	static class Node{
		int data;
		Node next;
		Node(int item){
			data=item;
			next=null;
		}
	}
	
	static void remove() {
		Node cuurent = null, nextCur = null, dup = null; 
        cuurent = head; 
  
        while (cuurent != null && cuurent.next != null) { 
            nextCur = cuurent;
            while (nextCur.next != null) {
                if (cuurent.data == nextCur.next.data) {
                    dup = nextCur.next; 
                    nextCur.next = nextCur.next.next;
                } else{ 
                    nextCur = nextCur.next; 
                } 
            } 
            cuurent = cuurent.next; 
        }
	}
	
	public static void main(String args[]) {
		nov17 list = new nov17();
		list.head = new Node(10);
		list.head.next = new Node(12); 
        list.head.next.next = new Node(11); 
        list.head.next.next.next = new Node(11); 
        list.head.next.next.next.next = new Node(12); 
        list.head.next.next.next.next.next = new Node(11); 
        list.head.next.next.next.next.next.next = new Node(10); 
        
        list.remove();
        while (head != null) { 
            System.out.print(head.data + " "); 
            head = head.next; 
        }
	}
}
