import java.util.*;
public class nov16 {
	static void longestSubString(String str) {
		int len = str.length();
		int size = (len*(len+1))/2;
		int m=0;
		//substring
		String[] stArr = new String[size];
		for (int i = 0; i < len; i++)  
	           for (int j = i+1; j <= len; j++) 
	        	   stArr[m++]=(str.substring(i, j)); 
		//check palindrome
		String reverse = "";
		String pla[] = new String[size];
		int n=0;
		for(int i=0;i<stArr.length;i++) {
			reverse="";
			for ( int j = stArr[i].length() - 1; j >= 0; j-- ) {
		          reverse = reverse + stArr[i].charAt(j); 
			}
			if (stArr[i].equals(reverse))
			pla[n++] = reverse;
		}
			int max=0;
			String str3="";
			for(int i=0;i<n;i++)
			{
				if(pla[i].length()>max)
					{
					max=pla[i].length();
					str3=pla[i];
					}
			}
			System.out.println(str3);
}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		longestSubString(str);
	}
}
