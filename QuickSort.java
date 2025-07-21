package searchSort;

import java.util.Arrays;

public class QuickSort 
{
	public static void main(String[] args) {
		
		int a[] = {2,46,2,18,62,8,2,4,6};
		quickSort(a,0,a.length-1);
		System.out.println(Arrays.toString(a));
		
	}
	
	public static void quickSort(int a[],int start,int end)
	{
		if(start<end)
		{
			int pos=partition(a,start,end);
			
			quickSort(a,start,pos-1);
			quickSort(a,pos+1,end);
		}
	}
	
	public static int partition(int a[],int start,int end)
	{
		int ref = a[start];
		int i=start,j=end;
		while(i<j)
		{
			while(i<=end && a[i]<=ref)
			{
				i++;
			}
			while(j>start && a[j]>=ref)
			{
				j--;
			}
			if(i<j)
				swap(a,i,j);
			
		}
		swap(a,start,j);
		return j;
	}
	
	public static void swap(int []a,int i,int j)
	{
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
}
