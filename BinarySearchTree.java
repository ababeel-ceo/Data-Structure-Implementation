import java.util.Scanner;

public class BinarySearchTree {
	Scanner sc=new Scanner (System.in);
	
	// Node Class for Creating Node Object //
	class Node{
		int data;
		Node left,right;
		
		// Constructor for class Node to Intialize the data //
		Node(int val)
		{
			data=val;
		}
		
		
	}
	
	Node root; // reference variable to maintain the root Node //
	
	// Constructor for class BinarySearchTree //
	BinarySearchTree()
	{
		root= null;
	}
	
	
	// Method to create a Node and insert the value //
	
	// By Recursive //
	
	Node insertByRecursive(Node root,int val)
	{
		if(root==null)
			return root=new Node(val);
				
		if(val<root.data)
		{
			root.left=insertByRecursive(root.left,val);
		}
		else
		{
			root.right=insertByRecursive(root.right,val);
		}
		return root;
	}
	
	// Insertion By Iterative //
	
	void insertByIterative(int val)
	{
		if(root==null)
		{
			root=new Node(val);
			return;
		}
		
		Node prev=null;
		Node temp=root;
		
		while(temp!=null)
		{
			prev=temp;
			if(temp.data<val)
			{
				temp=temp.right;
			}
			else
			{
				temp=temp.left;
			}
		}
		
		if(prev.data<val)
			prev.right=new Node(val);
		else
			prev.left=new Node(val);
			
	}
	
	// insert Head method //
	void insert()
	{
		
		System.out.println("Press 1 to insert By recursive \nPress 2 to insert by iterative ");
		int choice=sc.nextInt();
		if(choice==1)
		{
			System.out.println("Enter the Value ");
			int val=sc.nextInt();
			Node temp=search(root,val);
			if(temp==null) {
			root=insertByRecursive(root,val);
			System.out.println("Value inserted By recursively");
			}else {System.out.println("This element is Already present in tree duplicates are not allowed!!!!");}
		}
		else if(choice==2) {
			System.out.println("Enter the Value ");
			int vall=sc.nextInt();
			Node temp=search(root,vall);
			if(temp==null) {
			insertByIterative(vall);
			System.out.println("Value inserted By Iteratively");
			}else {System.out.println("This element is Already present in tree duplicates are not allowed!!!!");}
		}
		else {
			System.err.println("Sorry!!! You entered the Wrong Choices");
		}
				
		
	}
	
	
	// InOrder Traversal //
	
	void inorderTraversal(Node root)
	{
		if(root!=null)
		{
			inorderTraversal(root.left);
			System.out.print(" "+root.data);
			inorderTraversal(root.right);	
		}
			
		
	}
	// PreOrder Traversal Traversal //
	
	void preorderTraversal(Node root)
	{
		if(root!=null)
		{
			System.out.print(" "+root.data);
			inorderTraversal(root.left);
			inorderTraversal(root.right);	
		}
	}
	
	// PostOrder traversal //
	void postorderTraversal(Node root)
	{
		if(root!=null)
		{
			inorderTraversal(root.left);
			inorderTraversal(root.right);
			System.out.print(" "+root.data);
		}
	}
	
	// Root Check //
	 boolean rootIsNull(Node root)
	 {
		 if(root!=null)
			 return false;
		 return true;
			 
	 }
	
	
	// Head traversal Method //
	void traversal()
	{
		if(rootIsNull(root))
		{
			System.err.println("Tree Has No Values, Plz Insert some Values");
			return;
		}
		System.out.println("Enter 1 to PreOrder Traversal\nEnter 2 to InOrder Traversal\nEnter 3 to PostOrder Traversal");
		int choice=sc.nextInt();
		if(choice==1)
		{
			System.out.println("Pre Order Traversal");
			preorderTraversal(root);
			System.out.println();
		}
		else if(choice ==2)
		{
			System.out.println("In Order Traversal");
			inorderTraversal(root);
			System.out.println();
		}
		else if(choice==3)
		{
			System.out.println("Post Order Traversal");
			postorderTraversal(root);
			System.out.println();
		}
		else
		{
			System.err.println("Sorry!!! You entered the Wrong Choices");
		}
	}
	
	Node delete(Node root,int val)
	{
		if(root==null)
			return null;
		if(root.data<val) 
			root.right=delete(root.right,val);
		else if(root.data>val) 
			root.left=delete(root.left,val);
		else {
			if(root.left==null) 
				return root.right;
			else if(root.right==null)
				return root.left;
			root.data=min(root.right);
			root.right=delete(root.right,root.data);
		}
		return root;
	}
	
	// Find Minimum Value //
	int min(Node root)
	{
		
		int min=root.data;
		while(root.left!=null)
		{
			min=root.left.data;
			root=root.left;
		}
		return min;
	}
	
	// search method to search the given value is present or not //
	
	Node search(Node root,int val)
	{
		if(root==null)
			return null;
		if(val<root.data)
			return search(root.left,val);
		else if(val>root.data)
			return search(root.right,val);
		else
			return root;
	}
	
	void searchAndDelete()
	{
		System.out.println("Enter the value :");
		int val=sc.nextInt();
		Node temp=search(root,val);
		if(temp==null) {
			System.err.println("No such element in the Tree");
			return;
		}			
		else {
			root=delete(root,val);
			System.out.println(val +"  Successfully  deleted ");
		}
		
	}
	
	void info()
	{
		while(true)
		{
			System.out.println("	-------------------WELCOME--------------------------\n	|");
			System.out.println("	|Press 1 to Insert the Value ");
			System.out.println("	|Press 2 to Delete the Value ");
			System.out.println("	|Press 3 to Traverse");
			System.out.println("	|Press 4 to Exit");
			System.out.println("	|----------------------------------------------------");
			
			System.out.println("\nEnter Your Choice");
			Scanner sc=new Scanner(System.in);
			int choice =sc.nextInt();
			
			switch(choice)
			{
			case 1:
				insert();
				break;
			case 2:
				searchAndDelete();
					break;
			case 3:
					traversal();
					break;
			case 4:
					System.out.println("Bye Bye!!!");
					System.exit(0);
			default:
				System.err.println("Plz Enter the Valid Choice");
				
				
						
			}
			
		}
	}

	public static void main(String[] args) {
	
			BinarySearchTree bst=new BinarySearchTree();
			bst.info();			
	}

}
