import java.util.*;
import java.lang.String;
class Pangram
{
	public static void main(String args[])
	{
		///// to get the ascii value /////////////
		char c='a';
		int k=(int)c;
		///////////// TO REMOVE DUPLICATES ////////////
		HashSet<Integer> number=new HashSet<Integer>();
		String s="We promply judged anique ivory buckles for he nex prize";
	    //// to the get the ascii btwn 95 to 122 ////////////
	    String s1=s.toLowerCase();
	    char[] ck=s1.toCharArray();
	    ////////  Array to save the differecne between the ascii //////////
	    int[] a=new int[s1.length()];
	    for(int i=0;i<ck.length;i++)
	    {
	    	a[i]=(int)c-(int)ck[i];
	    	number.add(a[i]);
	    }
	    //// TO count the number of values //////////////
	    int count=0;
	    for(int i=1;i<number.size();i++)
	    {
	    	count++;
	    }
	    if(count==26)
	    {
	    	System.out.print("pangram");
	    }
	    else
	    {
	    System.out.print("no pangram");	
	    }
	    
		
	
	}
}