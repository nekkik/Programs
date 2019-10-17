import java.util.Scanner;
import java.lang.String;
class GCD
{
	public static void main(String args[])
	{
		int x,y,value=0;
		System.out.println("Enter the value of x");
		Scanner s1=new Scanner(System.in);
		x=s1.nextInt();
		System.out.println("Enter the value of y");
		y=s1.nextInt();
		int min=Math.min(x,y);
		int j=2;
		while(j<min)
		{
			if(x%j==0 && y%j==0)
			{
				value=j;
			}
			j++;
		}
		System.out.println("GCD IS : "+value);
}
}