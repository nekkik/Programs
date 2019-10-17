import java.util.Scanner;
import java.lang.String;
class LCM
{
	public static void main(String args[])
	{
		int x,y,value=0;
		System.out.println("Enter the value of x and y");
		Scanner s1=new Scanner(System.in);
		x=s1.nextInt();
		y=s1.nextInt();
		int i=x*y;
		int min=Math.min(x,y);
		while(min<i)
		{
			
			if(min%x==0 && min%y==0 )
			{
				value=min;
				break;
			}
			min++;
		}
		System.out.print(value);
	}
}