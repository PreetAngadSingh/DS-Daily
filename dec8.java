import java.util.*;
public class dec8 {
	static void sort(int[] arr1,int[]arr2) {
		int len1 = arr1.length;
		int len2 = arr2.length;
		int len3 = len1+len2;
		int arr3[] = new int[len3];
		int i=0,j=0,m=0;
		
		while (i<len1 && j <len2) 
        {
            if (arr1[i] < arr2[j]) 
                arr3[m++] = arr1[i++]; 
            else
                arr3[m++] = arr2[j++];
        }
        while (i < len1) 
            arr3[m++] = arr1[i++];
        while (j < len2) 
            arr3[m++] = arr2[j++];
		for(i=0;i<len3;i++)
			System.out.print(arr3[i]+" ");
	}
	public static void main(String[] args) {
		int arr1[] = {2,6,10,15,25};
		int arr2[] = {3,5,14,20,30};
		sort(arr1,arr2);
	}
}
