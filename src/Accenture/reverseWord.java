package Accenture;

import java.util.Scanner;

public class reverseWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=sc.nextLine();

        String[] words=str.split(" ");
        for(int i= words.length-1;i>=0;i--)
        {
            System.out.print(words[i]+" ");
        }
    }
}
