import java.util.*;
import java.lang.*;
public class InsertionSort {
	public static void main(String args[])
{
	//int k;
	Scanner s1=new Scanner(System.in);
	int[] a=new int[size];
	int k=a.length;
	for(int i=0;i<k;i++)
	{
		a[i]=s1.nextInt();
	}
	int temp;
	for(int i=1;i<k;i++)
	{
	for(int j=i;j>0;j--)
	{
		if(a[j] > a[j-1])
		{
			temp=a[j];
			a[j]=a[j-1];
			a[j-1]=temp;
		}
	}
	}
	for(int i=0;i<k;i++)
	{
		System.out.print(a[i]);
	}
	
}
}
