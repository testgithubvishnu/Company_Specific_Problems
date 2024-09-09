package TCS_NQT;

//Given string contain elements from 0 to 9.
//Find the number substring  of the string where sum of elements of the substring is not equal to
// length of substring length, 201 string , output->3
//Ex.. 3

import java.util.Scanner;

public class findSubstring {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
     String str=sc.nextLine();
     int count=0;

     for(int i=0;i<str.length();i++)
     {
         for(int j=i;j<=str.length();j++)
         {
             String subs=str.substring(i,j);
             int len=subs.length();
             int sum=0;
             for(int k=0;k<len;k++)
             {
                 sum=sum+subs.charAt(k)-'0';
             }
             if(sum!=len) count++;
         }
     }
        System.out.println(count);
    }

}
