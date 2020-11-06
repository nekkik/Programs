import java.util.Scanner;
import java.lang.String;

class DeletionOfNode
{


Node root;


int n = 1;

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

		DeletionOfNode ll = new DeletionOfNode();
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

		System.out.println("Number to be deleted ");
		int l  = s1.nextInt();
		
		ll.removetheelement(l);

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
		n++;
	}
}

// DELETION OF A NODE //


public void removetheelement(int dell)
{
	del(dell,root);
}
public  void del(int dell,Node root)
{
	int length = 1 ;

Node new_node = root;
Node temporary_node =root;

	while(root!=null && root.data!=dell)
	{
		root=root.next;
		length ++;
	}
System.out.println("Lenght where the element is kept is : "+length);
		if(length==n)
		{
			System.out.println("There is no data which you entered !!");

		}

		else
		{
			for(int i=1;i<length-1;i++)
			{
				temporary_node=temporary_node.next;
			}
			for(int j=1;j<length;j++)
			{
				new_node=new_node.next;
			}
			temporary_node.next=new_node.next;
			

		}



}

}





	

