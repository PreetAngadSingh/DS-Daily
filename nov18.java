import java.util.*;
public class nov18 {
	
	static void calcFrequency(int[] arr,int size) {
		int count;
		for(int i=0;i<size;i++) {
			count=1;
			for(int j=i+1;j<size;j++) {
				if(arr[i]==arr[j]&&arr[i]!=-444) {
					count++;
					arr[j]=-444;
				}
			}
			if(arr[i]!=-444)
				System.out.println("Frequency of " + arr[i] + " is " +count);
		}
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = s.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the array");
		for(int i=0;i<size;i++)
		arr[i] = s.nextInt();
		
		calcFrequency(arr,size);
	}
}
