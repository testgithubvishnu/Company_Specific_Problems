package Accenture;

import java.util.*;

//Programme to find sum of magical numbers beteen 1 TO N:
// Magical Number can be defined as below:
// 1] Replace 0 with 1 and 1 with 2 in the binary string
// 2] sum of digtis of modified binary string.if sum is odd it means
     // it's magical number

// example:
// let n=3 =>11  => 22 =>2+2 =>even    -> Not a magical number
// let n=2 =>10  => 21 =>2+1 =>odd     -> magical number

public class magicalNumbers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();

            // # Bruit-force approach:

            // Convert integer to binary:
            //make 0 to 1 and 1 to 2:
            // Add digit to string
            //check whether it is odd or not

            // Optimal Approach:
            // Let sum=0;
            // 1] We will check for LSB
            //    if LSB==1 then sum+=2;
            //    if LSB==0 then sum+=1;
                   // Checking LSB:
                   // number & 1=1 -> LSB=1
                   // number & 1=0 -> LSB=0

            // 2] we will right shift the number to check next digit
            // and process continues till number > 0

            int count=0;
            int sum=0;
            for(int i=1;i<=n;i++)
            {
                int j=i;
                while(j>0)
                {
                    if((j&1)==1){
                       sum+=2;
                    }
                    else{
                        sum+=1;
                    }
                   j= j>>1;
                }
                if(sum%2!=0) count++;
                sum=0;

                }
        System.out.println(count);
            }


        }

