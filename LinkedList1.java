import java.util.*;
import java.lang.String;
public class LinkedList1{
class Rail
{
	int data;
	Rail next;
	public Rail(int data)
	{
		this.data=data;
		next=null;
	}
}

	public Rail start=null;
	public Rail n=null;

	
	public void insert(int x)
	{
		Rail temp;
		temp=new Rail(x);
		if(start==null)
		{
			start=temp;
			n=temp;
					}
		else
		{
			n.next=temp;
			n=temp;
			
		}
		
		
	}
	public void display()
	{
		Rail node=start;
		if(start==null)
		{
			System.out.print("Link is empty !!");
		}
		else
		{
		while(node!=null)
		{
			System.out.println(node.data);
			node=node.next;
		}
		
		}
	}
	public void add(LinkedList1 l1,LinkedList1 l2)
	{
		
		
	}
	public static void main(String args[])
	{
		LinkedList1 ll=new LinkedList1();
		LinkedList1 l2=new LinkedList1();
		ll.insert(4);
		l2.insert(54);
		ll.display();
		l2.display();
	}
}
