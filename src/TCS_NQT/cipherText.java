package TCS_NQT;

// caesar cipher is type of cipherb int which each alphabet
// in the plaintext or messages is shifted by number of places down the alphabet
// A-Z : 65-90 , a-z :97-122, 0-9 : 48-57
//Ex..              yZ89 key=2
//    cipher text-> aB01

import java.util.Scanner;

public class cipherText {
        public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the message");
        String str=sc.nextLine();

            System.out.println("Enter the Key");
            int key=sc.nextInt();

            StringBuilder sb =new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
            char ch =str.charAt(i);
            if(str.charAt(i)>=65 && str.charAt(i)<=90)
            {
              int index=str.charAt(i)-'A';
              index=(index+key)%26;
              sb.append((char)(65+index));
            } else if (ch>=97 && ch<=122) {
                int index=ch-'a';
                index=(index+key)%26;
                sb.append((char)(97+index));
            }
            else{
                int index=ch-'0';
                index=(index+key)%10;
                sb.append((char)(48+index));
            }
        }
            System.out.println("cipher text "+sb);
    }
}
