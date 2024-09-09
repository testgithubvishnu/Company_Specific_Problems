package TCS_NQT;

import java.util.HashMap;

// Given array of length n , find the length of largest subarray which
//contains equal number odf 0s and 1s
//Ex.. 1011100  output -> 6
public class largestSubarray {
    public static void main(String[] args) {
        int[] arr={1,0,1,1,1,0,0};
         int n=arr.length;

        //Prefix-Sum Approach:
        // if 0 -> -1, 1 -> 1
        HashMap<Integer,Integer> hm= new HashMap<>();
        hm.put(0,-1);
        int length=0;
        int prefixSum=0;

         for(int j=0;j<n;j++)
         {
             prefixSum+=(arr[j]==1?1:-1);
             if(hm.containsKey(prefixSum)){
                 int i=hm.get(prefixSum);
                 length=Math.max(length,j-i);
             }else{
                 hm.put(prefixSum,hm.get(prefixSum)+j);
             }
         }
        System.out.println(length);
    }
}
