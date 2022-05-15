package oops;

class CircularLL
{
	class Node
	{
		int data;
		Node next;
		
		Node(int val)
		{
			data=val;
			next=null;
		}
	}
	Node last;
	CircularLL()
	{
		last=null;
	}
	
	public void insertAtBeg(int val)
	{
		Node newNode= new Node(val);
		if(last==null)
		{
			newNode.next=newNode;
			last=newNode;
		}
		else
		{
			newNode.next  =last.next;
			last.next=newNode;
			
			
		}
	//	System.out.println("Entered value is : "+newNode.data);
	}
	
	public void display()
	{
		Node jump;
		jump=last;
		
		do
		{
			
			System.out.println("Value is : "+jump.data);
			jump=jump.next;
			
		}while(jump!=last);

	}
	
}

public class CircularLinkList {

	public static void main(String[] args) {
		
		CircularLL cll=new CircularLL();
		cll.insertAtBeg(12);
		cll.insertAtBeg(1);
		cll.insertAtBeg(87);
		cll.insertAtBeg(67);
		
		cll.display();
	}



}
