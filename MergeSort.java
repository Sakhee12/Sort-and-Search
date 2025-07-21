package searchSort;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		
		int a[] = {2,8,6,48,33,2,6,7,1};
		mergeSort(a,0,a.length-1);
		System.out.println(Arrays.toString(a));
		
	}
	
	public static void mergeSort(int a[],int start,int end)
	{
		
		if(start<end)
		{
			int mid=(start+end)/2;
			mergeSort(a,start,mid);
			mergeSort(a,mid+1,end);
			mergingSameArray(a,start,mid,end);
		}
		
		
		
	}
	
	public static int[] mergingSameArray(int a[],int start,int mid,int end)
	{
		int ans[] = new int[a.length];
		int i=start,j=mid+1,k=start;
		
		while(i<=mid && j<=end)
		{
			if(a[i]<=a[j])
				ans[k++]=a[i++];
			else if(a[i]>a[j]){
				ans[k++]=a[j++];
			}
			
		}
		while(i<=mid)
		{
			ans[k++]=a[i++];
		}
		while(j<=end)
		{
			ans[k++]=a[j++];
		}
		
		for(int r=start;r<=end;r++)
		{
			a[r]=ans[r];
		}
		return ans;
	}
}
