package Accenture;

import java.util.Scanner;

public class binaryOperation {
    public static String binaryAnd(String s1,String s2)
    {
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)=='0' || s2.charAt(i)=='0'){
                sb.append('0');
            }else{
                sb.append('1');
            }
        }
        return sb.toString();
    }
    public static String binaryOr(String s1,String s2)
    {
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)=='1' || s2.charAt(i)=='1'){
                sb.append('1');
            }else{
                sb.append('0');
            }
        }
        return sb.toString();
    }
    public static String binaryXor(String s1,String s2)
    {
   StringBuilder sb= new StringBuilder();
    for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)==s2.charAt(i)){
                sb.append('0');
            }else{
                sb.append('1');
            }
        }
       return sb.toString();
    }


    public static void main(String[] args) {
        String s1="1101";
        String s2="1011";
        System.out.println(binaryOr(s1,s2));
        System.out.println(binaryAnd(s1,s2));
        System.out.println(binaryXor(s1,s2));
    }
}
