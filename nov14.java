import java.util.*;
public class nov14 {
	static void reverseString(String str) {
		char ch[] = str.toCharArray();
		
		int len = str.length();
		int l = 0;   //left pointer
		int r = len-1; //right pointer
		
		while(l<r) {
			if(!((ch[l]>=65 && ch[l]<=90) || (ch[l]>=97 && ch[l]<=122))) //if the character is a special character
				l++;
			else if(!((ch[r]>=65 && ch[r]<=90) || (ch[r]>=97 && ch[r]<=122)))
				r--;
			else {
				char temp = ch[l];                    //swapping when we find string on both pointer
				ch[l]=ch[r];
				ch[r]=temp;
				l++;
				r--;
			}
		}
		
		
		String str1 = new String(ch);
		System.out.println(str1);
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		reverseString(str);
	}
}
