package Accenture;

// Equilibrium point where sum of right elements and left elements is equal:
public class equilibriumPoint {
    public static void main(String[] args) {
      int[] arr={-7,2,4,9,-8,1,6};
      // Ans : 9 ->  leftSUm=rightSum=-1;
        int[] prefix= new int[arr.length];
        int[] suffix=new int[arr.length];

        prefix[0]=arr[0];
        suffix[arr.length-1]=arr[arr.length-1];

        for(int i=1;i< arr.length;i++)
        {
            prefix[i]=prefix[i-1]+arr[i];
        }
        for(int i= arr.length-2;i>=0;i--)
        {
            suffix[i]=suffix[i+1]+arr[i];
        }
        for(int i=0;i< arr.length;i++)
        {
           if(prefix[i]==suffix[i]){
               System.out.println("Point of equilibrium is: "+i);
           }
        }
    }
}
