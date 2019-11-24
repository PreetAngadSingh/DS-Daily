import java.util.*;
public class nov24 {
	
	static void convert(String str) {
		Stack<String> stack = new Stack<String>();
		String a="",b="",res = "";
		for (int i = str.length() - 1; i >= 0; i--)
		{
			if ( (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') || (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')) 
			{
				String s = "";
				s = s + str.charAt(i);
				stack.push(s);
			} 
			else 
			{
				if (!stack.empty())
					a = stack.pop();
				
				if (!stack.empty())
					b = stack.pop();
				
				res = a + b + str.charAt(i);
				stack.push(res);
			}
		}
		System.out.println("The postfix expression is");
		System.out.println(stack.pop());
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the prefix expression");
		String s=sc.next();
		convert(s);
	}
}