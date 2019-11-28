import java.util.*;
public class nov27 
{
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
	static Node root;
	
	Node lowest(Node root,int a,int b)
	{
		if(root==null)
			return root;
		if(root.data==a||root.data==b)
			return root;
		Node l=lowest(root.left,a,b);
		Node r=lowest(root.right,a,b);
		if(l!=null&&r!=null)
			return root;
		return (l!=null)?l:r;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		nov27 tree=new nov27();
		tree.root=new Node(1);
		tree.root.left=new Node(2);
		tree.root.right=new Node(3);
		tree.root.left.left=new Node(4);
		tree.root.left.right=new Node(5);
		tree.root.right.left=new Node(6);
		tree.root.right.right=new Node(7);
		
		System.out.println("Enter the two nodes");
		int a=sc.nextInt();
		int b=sc.nextInt();
		Node temp=tree.lowest(tree.root,a,b);
		System.out.print(temp.data+" ");
	}
}