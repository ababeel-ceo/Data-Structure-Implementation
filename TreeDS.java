package oops;
//---------------------------------------BINARY TREE IMPLEMENTATION--------------------------by_Abd
class BT{
	
	
	// Creating Node Structure//
	class Node
	{
		int data;
		Node left,right;
		Node(int val) // Constructor for class Node
		{
			data=val;
			left=null;
			right=null;
		}
		
	}
	Node root;// reference variable to store ref of root node
	BT(int val)// constructor for Class BT
	{
		root = new Node(val);
	}
	
// Inserting at Right side of the node 
	void insertLeftNode(Node n, int val)
	{
		Node newNode= new Node(val);
		
		n.left=newNode;
	}
//Inserting left side of the Node 
	void insertRightNode(Node n, int val)
	{
		Node newNode =new Node(val);
		n.right=newNode;
	}
	
// In Order Traversing (LEFT->ROOT->RIGHT)
	static void InOrdertraverse(Node r)
	{
		if(r !=null)
		{
		InOrdertraverse(r.left);
		System.out.print(r.data+"  ");
		InOrdertraverse(r.right);
		}
	}
// PRE ORDER TRAVERSING (ROOT->LEFT->RIGHT)
	static void preOrdertraverse(Node r)
	{
		if(r !=null)
		{
		System.out.print(r.data+"  ");
		preOrdertraverse(r.left);
		preOrdertraverse(r.right);
		}
		
	}
	
//POST ORDER TRAVERSING (LEFT->RIGHT->ROOT)
	static void postOrdertraverse(Node r)
	{
		if(r !=null)
		{
		postOrdertraverse(r.left);
		postOrdertraverse(r.right);
		System.out.print(r.data+"  ");
		}
	}

}

public class TreeDS {

	public static void main(String[] args) {
		BT tree = new BT(15);// Creating Obj for class BT
		tree.insertLeftNode(tree.root,10); 
		tree.insertRightNode(tree.root, 17);
		tree.insertLeftNode(tree.root.left, 8);
		tree.insertRightNode(tree.root.left,11);
		tree.insertRightNode(tree.root.right, 18);	
		tree.insertLeftNode(tree.root.right,16);
		System.out.println("PRE ORDER TRAVERSAL");
		BT.preOrdertraverse(tree.root);
		System.out.println("\nIN ORDER TRAVERSAL");
		BT.InOrdertraverse(tree.root);	
		System.out.println("\nPOST ORDER TRAVERSAL");
		BT.postOrdertraverse(tree.root);
		
		
	}

}

