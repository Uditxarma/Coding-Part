//Program to move all 0's to the end of an array by maintaining the relative order of the other (non-zero) array elements
package only_practice;
import java.util.Arrays;

public class Move_zeros_At_the_End 
{
	
	public static void reOrder(int[] s)						//Logic 1
	{
		int k=0;
		for(int i :s)
		{
			if(i!=0)
			{
				s[k++]=i;
			}
		}
		for(int i=k;i<s.length;i++)
		{
			s[i]=0;
		}
	}
	
	
	
	
	public static void swap(int[] a,int i ,int j)
	{
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		
	}
	public static void partition(int[] s)						//Logic 2 Using partitioning logic of Quicksort
	{
		int j=0;
		
		for(int i=0; i<s.length;i++)
		{
			if(s[i]!=0)						// pivot is 0
			{
				swap(s,i,j);
				j++;
			}
		}
		
	}

	

	
	public static void main(String[] args) 
	{
		int[] s= {1,0,0,2,1,0,1};
		reOrder(s);
		System.out.println(Arrays.toString(s));
		
		partition(s);
		System.out.println(Arrays.toString(s));
		
	}

}