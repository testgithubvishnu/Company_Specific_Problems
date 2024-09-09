package Accenture;

import java.util.HashMap;

public class symmetricPairs {
    static void solve(int[][] arr){
        HashMap<Integer,Integer> hm= new HashMap<>();
        for(int[] nums :arr)
        {
            if(!hm.containsKey(nums[1])){
                hm.put(nums[0],nums[1]);
            }else{
                System.out.print("("+nums[0]+","+nums[1]+")"+",");
            }
        }
    }
    public static void main(String[] args) {
        int[][] arr={{1,2},{2,1},{3,4},{4,5},{5,4}};
        solve(arr);
    }
}
