import java.util.*;
import java.lang.*;
import java.util.*;
public class Stack {
	
	public int top=-1;
	public int cap;
	public int a[]=new int[10];
	
	void fill(int i)
	{
		cap=i;
	}
	int Empty()
		{
			if(top==-1)
			{
				return 1;
			}
			else
			{
				return 0;
			}
}
void push(int i)
{
		if(top==cap-1)
		{
			System.out.println("Stack is overflow");
		}
		else
		{
			top=top+1;
				a[top]=i;
		}
	}
void pop()
{
	int k;
	if(top==-1)
	{
		System.out.println("Stack is underflow");
	}
	else
	{
		k=a[top];
		top--;
	}
}
void display()
{
	for(int i=top;i>=0;i--)
	{
	System.out.println(a[i]);	
	}
}
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int no;
	int cap = sc.nextInt();
	Stack s1=new Stack();
	s1.fill(cap);
	for(int i=0;i<cap;i++)
	{
		System.out.println("Enter the number to be pushed");
		no=sc.nextInt();
		s1.push(no);
	}
	int e;
	System.out.println("Enter the numbers to be popped");
	e=sc.nextInt();
	for(int i=0;i<e;i++)
	{
		s1.pop();
	}
	
	s1.display();
}
}
	
