package oops;
class LinkListStack
{
	class Node
	{
		int data;
		Node next;
	}
	
	Node top;
	LinkListStack()
	{
		top=null;
	}
	
	public void push(int val)
	{
		Node newNode=new Node();

		
			newNode.next=top;
			top= newNode;
			newNode.data=val;
		System.out.println("Pushed value is : "+newNode.data);
	}
	
	public void pop()
	{
		if(top==null)
		{
		 System.out.println("No values in the stack");
		 return;
		}
		System.out.println("Poped value is :  "+top.data);
		top=top.next;
	}
	}
public class LinkedListUsingStack {

	public static void main(String[] args) {
		LinkListStack lls =new LinkListStack();
		lls.push(5);
		lls.push(43);
		lls.push(56);
		lls.push(11);
		lls.push(87);
		lls.push(45);
		lls.push(7);
		lls.push(9);
		
		
		
		lls.pop();
		lls.pop();
		lls.pop();
		lls.pop();
		lls.pop();
		lls.pop();
		lls.pop();
		lls.pop();
		lls.pop();
		
		}

}
