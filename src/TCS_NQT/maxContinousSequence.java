package TCS_NQT;

public class maxContinousSequence {
    public static void main(String[] args) {
        //Number of Horses:
        int H=10;
        //Amount of money have:
        int M=100;

        //Price of each of horses:
        int[] price={30,40,50,20,20,10,90,10,10,10};
        int n= price.length;
        // Total bet money < K , output -> 3
       // Approach:

        int i=0;
        int j=0;
        int sum=0;
        int count=0;
        int fcount=0;

        //Sliding window Approach:
          while(j<n){
              if(price[j]>=M)
              {
                  j++;
                  i=j;
                  count=0;
              }
              else if(sum+price[j]>=M){
               sum-=price[i];
               i++;
               count--;
              }
              else{
                  sum+=price[j];
                  j++;
                  count++;
              }
              fcount=Math.max(fcount,count);
          }
        System.out.println(fcount);
    }
}
