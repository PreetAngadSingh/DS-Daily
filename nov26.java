import java.util.*;
public class nov26 {
	static void findPairs(int size,int size1,int num,int arr[],int arr1[]) {
		System.out.println("The pairs are as follows");
		for(int i=0;i<size;i++) {
			for(int j=0;j<size1;j++) {
				if(arr[i]+arr1[j]==num) {
					System.out.println(arr[i] + ", " + arr1[j]);
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		
		int size1 = s.nextInt();
		int arr1[] = new int[size1];
		
		int num = s.nextInt();
		
		for(int i=0;i<size;i++)
			arr[i] = s.nextInt();
		
		for(int i=0;i<size1;i++)
			arr1[i] = s.nextInt();
		findPairs(size,size1,num,arr,arr1);
	}
}
