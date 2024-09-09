package Accenture;

import java.util.Scanner;
// Valid is password:
// At least four charactor
// At least one numeric
// At least one capital letter
// No space or slash
// starting char must not be a number

public class validPassword {
    static boolean validity(String str)
    {
        int len= str.length();
        if(len<4) return false;

        if(str.charAt(0)-'0'>=0 && str.charAt(0)-'0'<=9) return false;

        int chars=0,nums=0;
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch==' ' || ch=='/') return false;
            if(ch>=65 && ch<=90)
            {
                chars++;
            }
            if(ch-'0'>=0 && ch-'0'<=9)
            {
                nums++;
            }
        }
        return chars>0 && nums>0;
    }
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);

        System.out.println("Enter the password:");
        String password=sc.nextLine();

       if( validity(password)){
           System.out.println("password is valid");
       }else{
           System.out.println("Password is invalid");
       }

    }
}
