package TCS_NQT;

import java.util.Arrays;
import java.util.HashMap;

//Given array of integers replace it with it's rank:
public class replaceNumWithRank {
    public static void main(String[] args) {
        int[] arr={20,15,26,2,98,2};

        int[] b=new int[arr.length];

        for(int num:arr)
        {
            System.out.print(num+" ");
        }
        System.out.println();

        for(int i=0;i< arr.length;i++)
        {
         b[i]=arr[i];
        }
        Arrays.sort(b);

        HashMap<Integer,Integer> hm= new HashMap<>();
        int rank=1;

        for(int i=0;i<b.length;i++)
        {
            if(!hm.containsKey(b[i])){
                hm.put(b[i],rank);
                rank++;
            }
        }
        for(int i=0;i< arr.length;i++)
        {
            arr[i]=hm.get(arr[i]);
        }
     for(int num:arr)
     {
         System.out.print(num+" ");
     }
    }
}

