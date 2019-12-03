import java.util.*;
public class dec1 {
	static void calculate(int arr[],int m) {
		Arrays.sort(arr);
		if(m==0) {
			return;
		}
		int min=Integer.MAX_VALUE;
		for(int i=0;i<=arr.length-m;i++) {
			int diff=arr[i+m-1]-arr[i];
			if(diff<min) {
				min=diff;
			}
		}
		System.out.println("The minimum difference is "+min);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the array");
		for(int i=0;i<size;i++)
			arr[i]=sc.nextInt();
		System.out.println("Enter the number of students");
		int m=sc.nextInt();
		calculate(arr,m);
	}
}
