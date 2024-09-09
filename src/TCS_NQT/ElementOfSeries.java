package TCS_NQT;

// We have to find nth element in series:
// The series is mixture of 3 series:
// All prime positions values are power of 2
// All perfect square positions are power of 3
// Remaining positions are sum of previous two

// Ex. 1 1 2 3 4 7 8 15 9 24 16 40 32 72 104 27 64 91 128...

import java.util.Scanner;

public class ElementOfSeries {
    static boolean isPrime(int n)
    {
       if(n<=1) return false;
        for(int i=2;i<Math.sqrt(n);i++)
        {
            if(n%i==0) return false;
        }
        return true;
    }
    static boolean isPerfectSquare(int n)
    {
       int root=(int)Math.sqrt(n);
       return ((root*root)==n);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();

        int pow_of_two=1;
        int pow_of_three=1;

        int[] arr= new int[n];
        for(int i=0;i<n;i++)
        {
           if(isPrime(i+1)){
               arr[i]=pow_of_two;
               pow_of_two*=2;
           } else if(isPerfectSquare(i+1))
           {
               arr[i]=pow_of_three;
               pow_of_three*=3;
           }else{
               arr[i]=arr[i-1]+arr[i-2];
           }
        }

      for(int i=0;i< arr.length;i++)
      {
          System.out.print(arr[i]+" ");
      }
    }
}
