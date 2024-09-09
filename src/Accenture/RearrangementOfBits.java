package Accenture;

import java.util.*;


//In this question we have to rearrange the bits of number:
// All set bits are in consecutive order
// Finding an integer value representing the minimum possible
// number that can be formed be after rearranging bits
// for ex.  10 => 1001
// 0110 = 6, 1100 = 12, 0011 = 3
// minimum number is 3

public class RearrangementOfBits {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();

        //Approach:
        // 1] count set bits
        // 2] All setbits should be consecutive and starting from right

        int count=0;
        while(n>0){
            if((n&1)==1)
            {
                count++;
            }
            n=n>>1;
        }

        int ans=0;
        int power=1;
        for(int i=0;i<count;i++)
        {
            ans+=power;
            power=power*2;
        }
        System.out.println(ans);
    }
}
