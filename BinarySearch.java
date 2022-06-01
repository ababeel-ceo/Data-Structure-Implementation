
package binarysearch;

/**
 * @author ABDULLA
 */

public class BinarySearch {

    
    // Binary Search Using Iteration //
    int binarySearch(int a[], int tar )
    { 
       int s=0;
       int e=a.length-1;
       while(s<=e)
       {
       int mid=(s+e)/2;
       if(a[mid]<tar)
       {
           s=mid+1;
       }
       else if(a[mid]>tar){
            e=mid-1;
       } 
       else{
           return mid;
       }
       
       }
       return -1;
    } 
    // Binary Search Using Recursion //
    int BinSearch(int arr[],int s,int l,int tar)
    {
        if(s<=l)
        {    
        int mid=(l+s)/2;
        if(arr[mid]<tar)
        {
            return BinSearch(arr,mid+1,l,tar);
        }
        else if(arr[mid]>tar)
        {
            return BinSearch(arr,s,mid-1,tar);
        }
        else{
            return mid;
        }
        }
        return -1;
    }
    public static void main(String[] args) {
       int arr[]={1,2,3,4,5,6,7,8,9};
       BinarySearch bs=new BinarySearch();
        System.out.println(bs.binarySearch(arr,7));
        System.out.println(bs.BinSearch(arr, 0, arr.length-1, 5));
    }
    
}
