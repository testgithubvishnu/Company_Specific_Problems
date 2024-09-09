package Accenture;

import java.util.Scanner;

//String conatins following characters:
//A - AND operation
//B - OR operation
//c - XOR operation


public class binaryStringManipulate {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("enter the binary string:");
        String binaryStr= sc.nextLine();

        int Ans=1;
        for(int i=1;i<binaryStr.length()-2;i++)
        {
            char op= binaryStr.charAt(i);
            int b=binaryStr.charAt(i+1)-'0';

            if(op=='A') Ans &= b;
            else if(op=='B') Ans |=b;
            else Ans^=b;

        }
        System.out.println("Answer: "+Ans);
    }
}
