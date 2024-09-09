package Accenture;

import java.util.Scanner;

public class palindromeString {
    static boolean solve(String str)
    {
        int i=0;
        int j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
               // System.out.println("Not palidrome");
                return false;

            }
            i++;
            j--;
        }
       return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string:");
        String str=sc.nextLine();
  if(solve(str)){
      System.out.println("Yes");
  }else{
      System.out.println("No");
  }

    }
}
