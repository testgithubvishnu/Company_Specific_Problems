package Accenture;

import java.util.Scanner;

//Approach:
// Any palindromic substring can have centre of 1 or 2 charactors

//Odd: consider each character of string as centre  of palindrome
// then check for longest possible palindrome

//Even:  consider each consecutive pair of two characters as centre
// then check for longest possible palindrome


public class longestPalindrome {
    static String longestPalindrome(String str)
    {
        int len= str.length();
        if(len<=1) return str;
        int start=0;

        int maxLen=1;

        // Odd length palindrome:
        for(int i=0;i<len;i++)
        {
            int l=i,r=i;
            while(l>=0 && r<len)
            {
                if(str.charAt(l)==str.charAt(r))
                {
                    l--;
                    r++;
                }else{
                    break;
                }
            }
            int length=r-l-1;
             if(maxLen<length)
             {
                 maxLen=length;
                 start=l+1;
             }
        }

        //Even length palindrome:
        for(int i=0;i<len-1;i++)
        {
            int l=i,r=i+1;
            while(l>=0 && r<len)
            {
                if(str.charAt(l)==str.charAt(r))
                {
                    l--;
                    r++;
                }else{
                    break;
                }
            }
            int length=r-l-1;
            if(maxLen<length)
            {
                maxLen=length;
                start=l+1;
            }
        }


        return str.substring(start,maxLen);

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=sc.nextLine();
        String ans=longestPalindrome(str);

        System.out.println("Longest palindromic substring: "+ans);

    }
}
