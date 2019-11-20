import java.util.*;
public class nov20 
{
	static Node root;
	static int arr[]=new int[50];
	static int m=0,count=1;
	
	static class Node
	{
		Node left,right;
		int data;
		Node(int data)
		{
			this.data=data;
			left=right=null;
		}
	}
	boolean isBst()
	{
		for(int i=0;i<m-1;i++)
		{
			if(arr[i]<arr[i+1])
				count++;
		}
		if(count==m)
			return true;
		else
			return false;
	}
	static void inOrder(Node root)
	{
		if(root==null)
			return;
		inOrder(root.left);
		arr[m]=root.data;
		m++;
		inOrder(root.right);
	}
	public static void main(String args[])
	{
		nov20 t=new nov20();
		t.root=new Node(8);
		t.root.left = new Node(3);  
	    t.root.right = new Node(10);  
	    t.root.left.left = new Node(1);  
	    t.root.left.right = new Node(6);  
	    t.root.right.right = new Node(14);  
	    t.root.right.right.left = new Node(13);  
	    t.root.left.right.left = new Node(4); 
	    t.root.left.right.right = new Node(7);
	    inOrder(root);
		if(t.isBst())
		{
			System.out.println("It is BST");
		}
		else
		{
			System.out.println("It is not BST");
		}
	}

}