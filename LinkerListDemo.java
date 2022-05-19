//-----------------------------------------Linked List Implementation-------------by_Abd----//

class LinkedList
{
	Node head;
	
	//creating Node Structure//
	class Node
	{
		int data;
		Node next;
		
		Node(int val)
		{
			data = val;
			next = null;
		}
	}
	
	LinkedList(){
		head =null;
	}
	
	// insert node beginning of the List  //
	public void insertAtBeg(int val)
	{
		Node newNode=new Node(val);
		
		if(head == null)
		{
			head = newNode;
			System.out.println("Entered value is :"+ newNode.data);
			
		}
		else {
			newNode.next =head;
			head=newNode;
			System.out.println("Entered value is :"+ newNode.data);
		}
		
	}
	
	// Traverse (Display) the List //
	
	public void display() {
		
		System.out.println();
		Node temp=head;
		while(temp != null)
		{
			System.out.print( temp.data+"  ");
			temp=temp.next;
			//System.out.print(temp.data);
		}
	}
	// insert the node at specific position  //
	public void insertAtPos(int pos, int val)
	{
		Node newNode=new Node(val);
		Node temp=head;
		if(pos == 0)
		{
			insertAtBeg(val);
			return;
		}
		
	for(int i=1; i<pos; i++)
	{
		temp=temp.next;
		if(temp == null)
		{
			System.err.println("Invalid position ");
			return;
		}
	}
	newNode.next=temp.next;
	temp.next=newNode;
	
		
	}
	
	// deleting node at specific position  //
	public void deleteAtPos(int pos)
	{
		Node temp=head;
		Node pre = null;
		if(pos == 0)
		{
			deleteAtBeg(0);
			return;
		}
		for (int i=1; i<pos; i++)
		{
			pre=temp;
			temp=temp.next;
		}
		pre.next=temp.next;
	}
	
	// deleting Last Node  //
	
	public void deleteAtLast() {
		Node temp =head;
		while(temp.next.next!=null)
		{
			temp=temp.next;
		}
		temp.next=null;
	}
	
	//  Reversing LinkedList  //
	public void reverse()
	{
		Node prev=null;
		Node cur=head;
		Node next=head.next;
		
		while(cur != null)
		{
			next=cur.next;
			cur.next=prev;
			prev=cur;
			cur=next;
		}
		head=prev;
	}
	// deleting Node at Beginning of the List //
	public void deleteAtBeg(int pos)
	{
		if(head==null)
		{
			System.out.println("List is Empty");
			return;
		}
		head=head.next;
	}
}

public class LinkerListDemo {

	public static void main(String[] args) {
		
		LinkedList list =new LinkedList();
		
		list.insertAtBeg(8);
		list.insertAtBeg(9);
		list.insertAtBeg(10);
		list.insertAtBeg(11);
		list.insertAtBeg(12);
		list.display();
		list.reverse();
		list.display();
		list.deleteAtLast();
		list.display();
		
	}

}
  