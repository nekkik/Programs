import java.util.*;
import java.lang.String;
public class SumOfLinkedList{
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
	public int current=0;
	
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
	public void show()
	{
		sum(start);
	}
	public void sum(Rail head)
	{
		if(head==null)
			return;
		else
			sum(head.next);
			current = current + head.data;
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
		System.out.print(current);
		
		}
	}
	public void add(LinkedList1 l1,LinkedList1 l2)
	{
		
		
	}
	public static void main(String args[])
	{
		LinkedList1 ll=new LinkedList1();
		//LinkedList1 l2=new LinkedList1();
		ll.insert(4);
		ll.insert(54);
		ll.show();
		ll.display();
		
	}
}
