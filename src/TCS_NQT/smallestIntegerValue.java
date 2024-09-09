package TCS_NQT;

import java.util.Scanner;
import java.util.Stack;

// Finding smallest integer value b for a given value of a.
// if we multiply thw digits of b, we should get exact value of a
// Ex.. 10 -> output 25
// 2*5 = 10
public class smallestIntegerValue {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();

         Stack<Integer> st= new Stack<>();
         for(int i=9;i>=2;i--)
         {
            while(n%i==0){
                st.push(i);
                n=n/i;
            }
             }
         if(n!=1){
             System.out.println("value of b is not possible");
         }else{
             int b=0;
             while(!st.isEmpty())
             {
                 int x=st.pop();
                 b=b*10+x;
             }
             System.out.println("Value of b is :"+b);
         }

    }
}
