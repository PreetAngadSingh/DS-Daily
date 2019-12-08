import java.util.*;
public class dec6 
{
	static class Node
	{
		int data;
		Node left,right;
		Node(int data)
		{
			this.data=data;
		}
	}
	static Node root;
	boolean isMirror(Node root)
	{
		return check(root,root);
	}
	boolean check(Node a,Node b)
	{
		if(a==null&&b==null)
			return true;
		if(a!=null&&b!=null&&a.data==b.data)
		{
			return (check(a.left,b.right))&&(check(a.right,b.left));
		}
		return false;
	}
	public static void main(String args[])
	{
		dec6 list=new dec6();
		list.root=new Node(1);
		list.root.left=new Node(2);
		list.root.right=new Node(2);
		list.root.left.left=new Node(3);
		list.root.left.right=new Node(4);
		list.root.right.left=new Node(4);
		list.root.right.right=new Node(3);
		System.out.println(list.isMirror(list.root));
	}

}