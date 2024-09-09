package TCS_NQT;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

// Find the empty packets(0) of chocolate and push it into left;
public class chocolateFactory {
    static void swap(int x,int y)
    {
        int temp=x;
         x=y;
        y=temp;
    }
    public static void main(String[] args) {
        int[] arr={4,5,0,1,9,0,5,0};
        int N=arr.length;
         int j=0;
         for(int i=0;i<N;i++)
         {
             if(arr[i]!=0)
             {
                 swap(arr[i],arr[j]);
                 j++;
             }
         }

        for(int k=0;k<N;k++)
        {
            System.out.print(arr[k]+" ");
        }
    }
}
