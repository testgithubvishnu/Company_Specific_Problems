package TCS_NQT;

// Given two binary strings:
// Find whether these can be made equal by rearranging bits:
// for ex. 101 and 011

import java.util.Scanner;

public class rearrangeBits {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();

        if(str1.length()!=str2.length()) {
            System.out.println("NO");
        }
        int zeros1=0, ones1=0;
        for(int i=0;i<str1.length();i++)
        {
            if(str1.charAt(i)=='0') zeros1++;
            else ones1++;

        }
        int zeros2=0, ones2=0;
        for(int i=0;i<str2.length();i++)
        {
            if(str2.charAt(i)=='0') zeros2++;
            else ones2++;

        }

        if(ones1==ones2 && zeros1==zeros2){
            System.out.println("Yes");
        }
else {
            System.out.println("No");
        }
    }
}
