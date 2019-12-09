import java.util.*;
public class dec9 {
	static class Node{
		int data;
		Node next;
		Node(int d){
			data=d;
			next = null;
		}
	}
	static Node head;
	
	static void insertMid(int x) {
		Node new_node = new Node(x);
		Node curr = head;
		int len=0;
		while(curr!=null) {
			len++;
			curr = curr.next;
		}
		curr=head;
		int count;
		if(len%2==0)
			count = len/2;
		else
			count = len+1/2;
		while(count!=1) {
			curr=curr.next;
			count--;
		}
		new_node.next = curr.next;
		curr.next = new_node;
	}
	static void display(Node head) {
		Node curr = head;
		while(curr!=null) {
			System.out.print(curr.data+" ");
			curr = curr.next;
		}
	}
	public static void main(String[] args) {
		head = new Node(1);
		head.next=new Node(2);
		head.next.next=new Node(4);
		head.next.next.next=new Node(5);
		insertMid(3);
		display(head);
	}
}
