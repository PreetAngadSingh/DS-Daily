import java.util.*;
public class nov28 
{
	static class Node
	{
		int data;
		Node left,right;
		Node(int data)
		{
			left=right=null;
			this.data=data;
		}
	}
	Node root;
	static int m=0;
	static void print(Node root,int a)
	{
		if(root==null)
			return;
		if(m<a)
		{
			System.out.print(root.data+" ");
			m=a;
		}
		print(root.left,a+1);
		print(root.right,a+1);
	}
	void printLeft()
	{
		print(root,1);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		nov28 tree=new nov28();
		tree.root=new Node(1);
		tree.root.left=new Node(2);
		tree.root.left.left=new Node(4);
		tree.root.left.right=new Node(5);
		tree.root.left.right.left=new Node(7);
		tree.root.left.right.left.right=new Node(8);
		tree.root.right=new Node(3);
		tree.root.right=new Node(6);
		tree.printLeft();
	}
}