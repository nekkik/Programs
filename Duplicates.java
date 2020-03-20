import java.util.*;
import java.lang.*;
public class Duplicates {
public static void main(String args[])
{
	Scanner s1=new Scanner(System.in);
	int n;
	HashMap<Integer, Integer> hm= new HashMap<Integer, Integer>();
	HashSet<Integer> hset=new HashSet<Integer>();
	
	for(int i=0;i<5;i++)
	{
		System.out.println("Enter the value ");
		n=s1.nextInt();
		hm.put(i,n);
	}
	for(int i=0;i<hm.size();i++)
	{
		if(!hset.contains(hm.get(i)))
				{
					hset.add(hm.get(i));
				}
		else
		{
			System.out.println("Duplicates are :"+hm.get(i));
		}
	}
}

}
