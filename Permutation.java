import java.util.*;
import java.lang.*;
class Permutation
{
	static void swap(char[] a, int i, int j)
	{
	char s=a[i];
	a[i]=a[j];
	a[j]=s;
	}
	static void fun(char[] c, int i)
	{
		if(i==c.length)
		{
			System.out.println(c);
			
		}
		else
		{
			for(int j=i;j<c.length;j++)
			{
				swap(c,i,j);
				fun(c,i+1);
				swap(c,i,j);
			}
		}
	}
	public static void main(String args[])
	{
		String s="abc";
		int i=0;
		fun(s.toCharArray(), i);
	}
}