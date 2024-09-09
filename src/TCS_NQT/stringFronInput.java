package TCS_NQT;

import java.util.Scanner;

// we have to check  whwther string from input string with single backward
// and single forward shift are same or not
// EX.. sfdlmnop  forward -> psfdlmno  , backward -> fdlmnop
public class stringFronInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        int n=input.length();

        String leftShift="";
        String rightShift="";

        //Right-Shift:
        rightShift=input.charAt(n-1)+input.substring(0,n-1);
        System.out.println(rightShift);

        //Left-Shift:
        leftShift= input.substring(1,n)+input.charAt(0);
        System.out.println(leftShift);

        if(rightShift.equals(leftShift)){
            System.out.println("Yes");
        } else{
            System.out.println("No");
        }

    }

}
