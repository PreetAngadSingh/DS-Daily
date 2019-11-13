import java.util.*;

public class nov13 {
	static void arraySum(int arr[] , int sum) {
		int len = arr.length;
		for(int i=0;i<len;i++)
		{
			int add=0;
			for(int j=i;j<len;j++) {
				add+=arr[j];
				if(add==sum)
				{
					System.out.println("Starting index is : " + i + ",");
					System.out.println("Ending index is : " + j);
					break;
				}
			}
		}
	}

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int size = scan.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the array : ");
		for(int i=0;i<size;i++)
			arr[i] = scan.nextInt();
		System.out.println("Enter the sum");
		int sum = scan.nextInt();
		arraySum(arr,sum);
	}
}