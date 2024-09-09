package Accenture;


import java.util.*;

public class AnagramStrings {
    public static void main(String[] args) {

        String str1= "anagram";
        String str2= "nagaram";
        int [] arr= new int[26];

        if(str1.length() !=str2.length())
        {
            System.out.println("false");
        }
        for(int i=0;i< str1.length();i++)
        {
           arr[str1.charAt(i)-'a']++;
           arr[str2.charAt(i)-'a']--;
       }
        for(int i=0;i<26;i++)
        {
            if(arr[i]!=0)
            {
                System.out.println("Strings are not anagram");
            }
        }

        System.out.println("Strings are anagram");
    }
}
