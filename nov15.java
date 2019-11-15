import java.util.*;
public class nov15 {
	static void checkBalance(String str) {
		int len = str.length();
		Stack<Character> st = new Stack<Character>();
		for(int i=0;i<len;i++) {
			 char ch = str.charAt(i);
			 if(ch=='{' || ch=='(' ||ch=='[') 
				 st.push(ch);
			 else if(ch=='}'&&st.peek()=='{' || ch==')' && st.peek()=='(' || ch==']' && st.peek()=='[')
				 st.pop();
		}
		if(st.isEmpty())
		System.out.println("Balanced");
		else
			System.out.println("Not Balanced");
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		checkBalance(str);
	}
}
