package searchSort;

import java.util.Arrays;

public class MergeSameArray 
{
	public static void main(String[] args) 
	{
		int a[]= {3,5,9,15,18,20,8,12,17,19,21,25};
		//THE GIVEN ARRAY IS A MERGE OF TWO SORTED ARRAY 
		//AGAIN SORTING THEM 
		merge(a);
	}
	
	public static void merge(int a[])
	{
		
		int ans[] = new int [a.length];
		int i=0,j=a.length/2,k=0;
		
		while(i<a.length/2 && j<a.length)
		{
			if(a[i]<=a[j])
			{
				ans[k++]=a[i++];
			}
			else if(a[i]>=a[j])
			{
				ans[k++]=a[j++];
			}
		}
		while(i<a.length/2)
		{
			ans[k++]=a[i++];	
		}
		while(j<a.length)
		{
			ans[k++]=a[j++];
		}
		System.out.println(Arrays.toString(ans));;
	}
}
