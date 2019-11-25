import java.util.*;
public class nov25 {
	
	static void removeDup(char[] ch) {
		int len = ch.length;
		String str="";
		for(int i=0;i<len-1;i++) {
			if(i==0) {
				if(ch[i]!=ch[i+1])
					str+=ch[i];
			}
			else if(i>0) {
				if(ch[i]!=ch[i+1]&&ch[i]!=ch[i-1]) {
					str+=ch[i];
				}
			}
		}
		if(ch[len-1]!=ch[len-2])
		{
			str+=ch[len-1];
		}
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String");
		String str = s.next();
		removeDup(str.toCharArray());
	}
}