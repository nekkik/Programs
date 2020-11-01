import java.util.*;
import java.lang.*;

class Permutation
{
	
	static void Perm(String s, int i , int n)
	{

			if(i==n)
			{
				//count++;
				System.out.println(s);
			}
			else
			{
				for(int j=i;j<n;j++)
				{
					s=swap(s,i,j);
					Perm(s,i+1,n);
					s=swap(s,i,j);

				}
			}
	}
	public static String  swap(String s , int i ,  int j)
	{
		char[] a=s.toCharArray();
		char temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		


		return String.valueOf(a);
	}
	public static void main(String args[])
	{
		 //int count = 0 ;
		int i=0, j=0;
		String s = "abc";
		int n = s.length();
		Perm(s,i,n);
	}
}
