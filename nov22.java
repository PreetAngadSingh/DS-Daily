import java.util.*;
public class nov22 
{
	static void compareNumber(int arr[],int size,int comp)
	{
		int max=0,count=0;
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				max=0;
				for(int k=i;k<=j;k++)
				{
					if(arr[k]>max)
						max=arr[k];
				}
				if(max>comp)
					count++;
			}	
		}
		System.out.println(count);
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int size=s.nextInt();
		int arr[]=new int[size];
		
		System.out.println("Enter the elements of array");
		for(int i=0;i<size;i++)
			arr[i]=s.nextInt();
		
		System.out.println("Enter the integer to compare");
		int comp=s.nextInt();
		compareNumber(arr,arr.length,comp);
	}

}