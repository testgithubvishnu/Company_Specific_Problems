package Accenture;

public class negativeGrowth {
    public static void main(String[] args) {
        int[] prices={2,3,1,4,5,2};
        int ans=0;
        for(int i=0;i<= prices.length-2;i++)
        {
            if(prices[i]>prices[i+1]){
                ans++;
            }
        }
        System.out.println("numbers: "+ans);
    }
}
