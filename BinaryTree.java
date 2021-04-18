import java.util.*;
import java.lang.*;


class BinaryTree
{

	class Node
	{
		public int data;
		Node left,rig;

		public  Node(int data)
		{
			this.data = data;
			left=rig=null;
			
		}
	}

		public static boolean flag = true;

		Node root ;

		public void insert(int value)
		
		{
			root = add(root,value);
		}

		 Node add(Node root, int value)
		{
			if(root==null)
			{
				try
				{
				root = new Node(value);
				}
				catch(Exception e)
				{
					System.out.print("Not working.");
				}
				return root;
			}
			else if(flag == true)
			{
				root.left = add(root.left,value);
				flag = false;
			}
			else
			{
				root.rig=add(root.rig,value);
				flag = true;
			}
			return root;
		}
		public void show()
		{
			display(root);
		}
	public void display(Node root)
	{
		if(root!=null)
		{
			display(root.rig);
			display(root.left);

			System.out.print(root.data);
			
			

		}
	}
	

	public static void main(String args[])
	{
		BinaryTree b1= new BinaryTree();
		
		b1.insert(1);
		b1.insert(2);
		b1.insert(3);
		b1.show();
	}

}