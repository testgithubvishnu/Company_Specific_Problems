package Accenture;

public class BuyAndSellStock {
    public static void main(String[] args) {
        int[] arr={7,1,5,3,6,4,2};

        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            min=Math.min(min,arr[i]);
            max=Math.max(max,arr[i]-min);
        }
        System.out.println("Maximum profit will be: "+max);
    }
}
