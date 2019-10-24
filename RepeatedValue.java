import java.util.Scanner;
import java.lang.String;
class RepeatedValue
{
	public static void main(String args[])
	{
		int n,value,count=0;
		int hold=0,ping=0;
		boolean flag=false;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the number of array");
		n=s1.nextInt();
		int b[]=new int[1];
		int a[]=new int[n];
		System.out.println("Enter the array");
		for(int i=0;i<n;i++)
		{
			a[i]=s1.nextInt();
		}
		for(int i=0;i<n-1;i++)
		{
			value=1;
			for(int j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					value++;
					flag=true;
					hold=a[i];
					ping=1;
				}
			}

			if(flag==true && count<value && ping==1)
			{
				count=value;
				b[0]=hold;
				
			}

		}
			
			System.out.print("This numeber " +b[0]+ " is repeated "+count+" many times !!");
			
				
			
	}
}