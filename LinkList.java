import java.util.Scanner;
import java.lang.String;

class LinkList
{


Node root;

static class Node
{

	int data;
	Node next;

	Node(int data)
	{
		this.data =data;
		next = null;
	}
}



public static void main(String args[])
	{

		LinkList ll = new LinkList();
		System.out.print("How many numbers you want to insert in the link list ");
		Scanner s1= new Scanner(System.in);
		int n = s1.nextInt();
		for(int i = 0 ; i<n;i++)
		{
			System.out.println("Enter the number you want insert in the Linklist");
			int k = s1.nextInt();
			ll.insert(k);
	}
		ll.display();

	}






// Insertion Function //

public void insert(int d)
{
	root=add(d,root);
}


public Node add(int d, Node root) 
{

	
	Node temp  = new Node (d);
	temp.next=null;
	Node n ; 
	n=root;
	// when the root is null 
	
	if(root==null)
	{
		root=temp;
	

	// when the root is not null 

}
	else
	{

		while(n.next!=null)
		{
			n=n.next;
		}
		n.next=temp;
		//temp=null;
	}


	return root;
}




public void display()
{
	show(root);
}
	
public void show(Node root)
{
	System.out.println("Output is : ");
	while(root!=null)
	{
		System.out.println(root.data);
		root=root.next;
	}
}
}





	

