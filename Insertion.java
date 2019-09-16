import java.lang.String;
import java.util.Scanner;
class Insertion
{

	public static void main(String args[])
	{
		Insertion i1=new Insertion();
		Scanner s1=new Scanner(System.in);
		int n;
		int k;
		System.out.println("Enter the number of arrays");
		n=s1.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the arrays");
		for(int i=0;i<n;i++)
		{
			a[i]=s1.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
						k=a[i];
						a[i]=a[j];
						a[j]=k;
				}
				else{}
			}
		}
		System.out.println("                              ");
		System.out.println("Your Sorted arrays is -");
		for(int i=0;i<5;i++)
		{
			System.out.println(a[i]);
			
		}
	}
	
}