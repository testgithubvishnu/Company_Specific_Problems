package TCS_NQT;

import java.util.Scanner;

// Programme to check if for a given number N,it's power of 4
// ends with the number itself or not
// Ex. 5 ->625,  25 ->390625

public class powerOfFour {
    static boolean checker(int N)
    {
        int temp=N;
        int temp1=N;

        int len=0;
        while(temp>0)
        {
            temp=temp/10;
            len++;
        }

        int ans=N*N*N*N;

        int num=1;
        while(len>0)
        {
            num=num*10;
            len--;
        }
       if(ans%num==temp1) return true;

        return false;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number:");
        int N=sc.nextInt();
         if(checker(N)){
             System.out.println("Yes");
         }else System.out.println("No");
    }
}
