package dataStructure;

//-----------------------------------Doubly Linked List----------by_Abd---------//
//------------let's Start----------------//
import java.util.Scanner;
class DoublyLL
{
    //Creating Node//
    class Node
    {
        int data;
        Node prev;
        Node next;
        Node(int val)  //Constructor to initialize and assiging data value//
        {
            prev=null;
            next=null;
            data=val;
        }
    }
    Node head; //creating head (reference variable)
    Node tail; //creating tail (reference variable)
    DoublyLL() //Constructor to intialize head and tail to null
    {
        head=null;
        tail=null;
    }
//-------Inserting Node At Beginning-------------//

    void insertAtBeginning(int val)
    {
        Node newNode= new Node(val);  //creating new Node
        if(head==null)
        {

            tail=newNode;
        }
        else{
            head.prev=newNode;
            newNode.next=head;


        }
        head=newNode;
    }
//------------Inserting Node At Specific Position------------//
    void insertAtPos(int pos, int val)
    {
        // if the position is 1 then it will call the insertAtBeg function
        if(pos==1)
        {
            insertAtBeginning(val);//function calling
            return;
        }
        // if the position is greaterthan 1 then the following steps are done //

        Node newNode=new Node(val);// creating new Node
        Node temp=head; //assigning head to temp ref variable for jumping
        for(int i=2; i<pos; i++)
        {
            if(temp==null)
            {
                System.out.println("Invalid Position ");
                return;
            }
            temp=temp.next; //jumping to next Node
        }
        newNode.next=temp.next;
        newNode.prev=temp;
        // Inserting Node last Position //
        if(temp==tail) {
            tail=newNode;
        }
        else {
            temp.next.prev = newNode;
        }
        temp.next = newNode;
    }
//-------Traverse Using Head----------//
    void DisplayByHead()
    {
        if(head==null)
        {
            System.out.println("List is Empty");
            return;
        }
        Node temp=head;
        System.out.println("\nDisplay Using Head : ");
        while(temp!=null)
        {
            System.out.print(temp.data+"  ");
            temp=temp.next;
        }
    }
//--------Traverse Using Tail----------//
    void DisplayByTail()
    {
        if(tail==null)
        {
            System.out.println("List is Empty");
            return;
        }
        Node temp=tail;
        System.out.println("\nDisplay Using Tail : ");
        while(temp!=null)
        {
            System.out.print(temp.data+"  ");
            temp=temp.prev;
        }

    }
//--------deleting the Node-----------//
    void deleteNodeByPos(int pos)
    {
        int value;
        if(head==null)
        {
            System.out.println("List has No Value ");
            return;
        }
        // deleting the 1st Node //
        if(pos==1)
        {
            value=head.data;
            head = head.next;
             if(head==null) {
             tail=null;
             }else {
                head.prev = null;
                }
            System.out.println("\nDeleted Value is : "+value);
            return;
        }
        Node temp=head;     // for jumping
        Node pre = null;    //to store previous of temp
        // Deleting the Middle Node //
        for(int i=2; i<=pos; i++)
        {
            pre=temp;          //it stores the before the specified location
            temp=temp.next;   //it stores the specified location
            if(temp==null)     //if the position is greater than the available node
            {
                System.out.println("invalid Position");
                return;
            }
        }
        value= temp.data;
        //  Deleting the last Node //
        if(temp==tail)
        {
            tail=tail.prev;
            tail.next=null;
        }
        else {
            pre.next = temp.next;
            temp.next.prev = pre;
        }
        System.out.println("\nDeleted Value is : "+value);
    }
}
public class DoublyLinkedList {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        DoublyLL list= new DoublyLL();     // It creates DLL Structure
        int pos,val,choice;
        while (true) {
            System.out.println("\nPress 1 Insert Value At Position(Position Starts from 1)");
            System.out.println("Press 2 to Display The List Using Head");
            System.out.println("Press 3 to Display The List Using Tail");
            System.out.println("Press 4 to Delete The node by Position(position Starts from 1)");
            System.out.println("Press 5 to Exit  ");

            System.out.println("Enter Your Choice :");
            choice=sc.nextInt();
            switch (choice)
            {
                case 1:System.out.println("Enter The Position And Value");
                        pos=sc.nextInt();
                        if(pos<1)
                        {
                            System.out.println("invalid Position");
                            break;
                        }
                        val=sc.nextInt();
                        list.insertAtPos(pos,val);
                        break;
                case 2:list.DisplayByHead();
                        break;
                case 3:list.DisplayByTail();
                        break;
                case 4:System.out.println("Enter the Position to Delete the Node ");
                        pos=sc.nextInt();
                        if(pos<1)
                        {
                            System.out.println("Invalid Position");
                            break;
                        }
                        list.deleteNodeByPos(pos);
                        break;

                case 5: System.exit(0);
                        break;
                default:
                    System.out.println("Plz Enter the Correct Choice ");
            }
        }

    }
}
//------------------------------------------Mudinthathuuu----------------------------//