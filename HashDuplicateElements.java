import java.util.*;
import java.lang.*;
public class HashDuplicateElements {
public static void main(String args[])
{
	int count=0;
	int []a=new int[10];
HashMap<Integer,Integer> hm=new HashMap<>();	

int k;
Scanner s1=new Scanner(System.in);
for(int i=0;i<5;i++)
{
	k=s1.nextInt();
	if(hm.get(k)==null)
	{
		hm.put(k, 1);
	}
	else {
//	hm.put(k,hm.get(k)+1);
	//a[count]=hm.get(k);
	//count++;
		a[count]=k;
		count++;
	}}
for(int i=0;i<count;i++) {
System.out.print(a[i]);
}
}
}
