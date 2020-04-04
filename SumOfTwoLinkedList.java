import java.util.*;
import java.lang.String;
public class SumOfTwoLinkedList{
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
	public static int l1=0;
	public static int ll2=0;
	public static int ll3=0;
	
	
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
	public void showl1()
	{
		System.out.println(suml1(start));
	}
	public int suml1(Rail start)
	{
		if(start==null)
			return l1;
		else
			suml1(start.next);
			l1=l1 + start.data;
			
		return l1;	
	}
	// LINKED LIST SECOND //
	public void showl2()
	{
		System.out.println(suml2(start));
	}
	public int suml2(Rail start)
	{
		if(start==null)
			return ll2;
		else
			suml2(start.next);
			ll2=ll2 + start.data;
	  return ll2;
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
			//System.out.print("--->");
			System.out.print(":"+node.data+"-->");
			//
			node=node.next;
		}
		System.out.println("");
		
		}
	}
	public int numberadded()
	{
		ll3= l1+ll2;
		return ll3;
	}

	public static void main(String args[])
	{
		SumOfTwoLinkedList ll=new SumOfTwoLinkedList();
		SumOfTwoLinkedList ll2=new SumOfTwoLinkedList();
		SumOfTwoLinkedList ll3=new SumOfTwoLinkedList();
		
		ll.insert(4);
		ll.insert(12);
		ll.insert(24);
		ll2.insert(54);
		ll2.insert(30);
		ll2.insert(45);
		
		
		ll.display();
		ll.showl1();
		ll2.display();
		ll2.showl2();
		
		System.out.println("sum of the number is : - "+ll3.numberadded());
	}
}
