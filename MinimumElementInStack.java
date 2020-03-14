import java.util.*;
import java.lang.*;
import java.lang.*;
public class MinimumElementInStack {
	public static void main(String args[]) {
	Stack<Integer> s=new Stack<Integer>();
	Stack<Integer> aux=new Stack<Integer>();
	s.push(4);
	s.push(54);
	s.push(88);
	s.push(101);
	s.push(3);
	s.push(300);
	s.push(2);
	s.push(30);
	int x=0;
	int y=0;
	x=aux.push(s.pop());
	//System.out.print(s.capacity());
	for(int i=s.size();i>0;i--)
	{
		y=s.pop();
		//System.out.println(y);
		if(x > y)
		{
			x=y;
		}else {}
	}
/*	for(int i=0;i<s.capacity();i++)
	{
		b=s.pop();
		if(a>b)
		{
			a=b;
		}
	}
	*/
	System.out.print(x);
	
	}
}

