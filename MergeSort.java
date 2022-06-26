import java.util.Arrays;

/**
 *
 * @author ABDULLA
 */
public class MergeSort {
    
    public static int[] mergeSort(int a[])
    {
        if(a.length==1)
            return a;
        int mid=a.length/2;
        int left[]= mergeSort(Arrays.copyOfRange(a,0,mid));
        int right[]=mergeSort(Arrays.copyOfRange(a, mid,a.length));
        return merge(left,right);
    }
    
    public static int[] merge(int[] l,int[] r)
    {
        int merge[]=new int[l.length+r.length];
        int i=0,j=0,k=0;
        while(i<l.length && j<r.length)
        {
            if(l[i]<r[j])
                merge[k++]=l[i++];
            else
                merge[k++]=r[j++];
        }
        while(i<l.length)
        {
            merge[k++]=l[i++];
        }
        while(j<r.length)
        {
            merge[k++]=r[j++];
        }
        return merge;
    }
    public static void main(String[] args) {
        
        int arr[]={76,34,67,23,65,90,45};
        System.out.println("Before Sorting ");
        System.out.println(Arrays.toString(arr));
        
        System.out.println("After Sorting ");
        System.out.println(Arrays.toString(mergeSort(arr)));
        
    }
}
