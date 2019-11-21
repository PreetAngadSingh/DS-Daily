import java.util.*;
public class nov21 {
	
	static void maxInWindow(int[] arr,int size,int window) {
		int size2=size-window+1;
		int arr2[] = new int[size2];
		int max,index=0;
		
		for(int i=0;i<size2;i++) {
			max = arr[i];
			for(int j=i;j<i+window;j++) {
				if(arr[j]>max)
					max=arr[j];
			}
			arr2[index++]=max;
		}
		for(int i=0;i<size2;i++)
			System.out.println(arr2[i]);
	}
	
	public static void main(String[] args) {
		Scanner s  = new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int size = s.nextInt();
		System.out.println("Enter the size of window");
		int window = s.nextInt();
		if(window<size) {
		int arr[] = new int[size];
		
		System.out.println("Enter the elements of array");
		for(int i=0;i<size;i++)
			arr[i]=s.nextInt();
		
		maxInWindow(arr,size,window);
		}
		else
			System.out.println("The size of window cannot be greater than size of array");
	}
}
