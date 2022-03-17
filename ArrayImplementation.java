package datastructure;
/*------------------------------------Dynamic Array List Implementation-----------------------------------------by_Abd----*/
//  Aarambikalaamaa

import java.util.Arrays;

class ArrDS {
	final static int initialCapacity = 2;
	private int size;
	private int arr[];
	private int capacity;

	ArrDS() {
		arr = new int[initialCapacity];
		capacity = initialCapacity;
		size = 0;

	}
// ----------------Insert Element Into the Array----------------  //
	void insertValue(int val)
	{
		if(size== capacity)
		{
			doubleTheArray();
		}
			arr[size]= val;
			size++; // when insert  an element we must increase the size //
		
	}
	
	private void doubleTheArray()
	{
		capacity=capacity*2;
		arr=Arrays.copyOf(arr, capacity);
	}
//-----------------Display Array Element ------------------------//	
	
	void displayArrElement()
	{
		System.out.println("\nElements into the Array is : ");
		for(int i=0; i<size; i++)
		{
			System.out.print(" "+arr[i]+" ");
		}
		 
	}

//-----------------Insert Value at Particular Position -------------------------//
	
	void insertAtPos(int pos,int val)
	{
		
		if(pos >size)
		{
			System.out.println("\n\nInvalid Position Pls enter valid Position ");
			return;
		}
		for(int i=size-1; i>=pos; i--)   //Note this Line very carefully bcz it's decrement//
		{
			arr[i+1]=arr[i];
			
		}
		arr[pos]=val;
		size++; // when insert  an element we must increase the size //
	}
//--------------------------------Deleting Array element------------------------//
	
	void deleteArrElement(int pos)
	{
		if(pos >size)
		{
			System.out.println("\n\nInvalid Position Pls enter valid Position ");
			return;
		}
		System.out.println("Deleted Element is : "+arr[pos]);
		for(int i=pos; i<size; i++)
		{
			arr[i]=arr[i+1];
		}
		size--; // when delete  an element we must decrease the size //
	}
}
public class ArrayImplementation {

	public static void main(String[] args) {

		ArrDS list = new ArrDS();
		list.insertValue(1);
		list.insertValue(2);
		list.insertValue(3);
		list.insertValue(4);
		list.insertValue(5);
		list.insertValue(6);
		list.displayArrElement();
		list.insertAtPos(4, 66);
		list.displayArrElement();
		list.deleteArrElement(78);

	}

}

// Mudichaachuuu!!!
/*---------------------------------------------------------------------------------------------------------------*/
