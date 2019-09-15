import java.util.*;
import java.lang.*;
public class Array {
	public static void main(String args[])
	{
		int score[]=new int[10];
		Scanner s1=new Scanner(System.in);
		int n;
		System.out.println("Enter the number of games");
		n=s1.nextInt();
		System.out.println("Enter the Maria's score");
		for(int i=0;i<n;i++)
		{
			score[i]=s1.nextInt();		
					
		}
		int max=0,min=0;
		int mincount=score[0],maxcount=score[0];
		for(int i=1;i<=n-1;i++)
		{
			if(mincount > score[i] && mincount!=score[i])
			{
				mincount=score[i];
				min++;
			}
			else if(maxcount < score[i] && max!=score[i])
			{
				maxcount=score[i];
				max++;
			}
			
		}
		System.out.print(max);
		System.out.print("   ");
		System.out.print(min);
		
	}
	

}
