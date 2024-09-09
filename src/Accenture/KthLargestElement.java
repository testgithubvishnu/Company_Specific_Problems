package Accenture;
import java.util.*;
// We have to find out the kth largest elemnt in te given array:

public class KthLargestElement {
  public   static int kthLarge(int k,int[] arr){
        for(int i=0;i<k;i++)
        {
            int max_index=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[max_index]){
                    max_index=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[max_index];
            arr[max_index]=temp;
        }
        return arr[k-1];
    }
    public static void main(String[] args) {
        int[] arr={3,2,1,5,6,4};
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the number");
        int k= sc.nextInt();

        System.out.println(k+ " th largest element is "+kthLarge(k,arr));
    }
}
