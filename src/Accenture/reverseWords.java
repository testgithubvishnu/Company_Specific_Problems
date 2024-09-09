package Accenture;

import java.util.Scanner;
import java.util.Stack;

// Reverse the given words:
// Hello dear guys
// :- guys dear Hello
public class reverseWords {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string:");
        String str= sc.nextLine();
        String ans="";

        String[] arr=str.split(" ");
        for(int i=arr.length-1;i>=0;i--){
            ans+=arr[i]+" ";
        }
        System.out.println(ans);
    }
}
