import java.lang.String;
import java.util.*;
public class SubsetSum {
	
	public boolean SubsetFunction(int[] a, int n , int sum)
	{
		boolean[][] b=new boolean[a.length+1][sum+1];
		for(int i=0;i<b.length;i++)
		{
			b[i][0]=true;
		}
		
		for(int i=1;i<=a.length;i++)
		{
			for(int j=1;j<=sum;j++)
			{
				if(j<a[i-1])
				{
					b[i][j]=b[i-1][j];
					
				}
				else if(j >= a[i-1])
				{
					b[i][j]=b[i-1][j] || b[i-1][j-a[i-1]];
				}
			}
		}
		return b[a.length][sum]; 
	}

	public static void main(String args[])
	{
		SubsetSum s1=new SubsetSum();
		int[] a= {1,2,3};
		int n=a.length;
		int sum=100;
		System.out.print(s1.SubsetFunction(a,n,sum));
	}
}
