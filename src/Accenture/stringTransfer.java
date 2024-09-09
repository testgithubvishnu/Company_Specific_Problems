package Accenture;
import java.util.*;

// Problem statement:
// Your task is to find out the number of operations required to tranform string
// s1 into s2

// If letter is removed cost = 0
// If letter is swapped cost= 0
//if new letter is added cost= 1

public class stringTransfer {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the strings");

        String str1= sc.nextLine();
        String str2=sc.nextLine();

        HashMap<Character,Integer> hm= new HashMap<>();
        for(int i=0;i<str2.length();i++)
        {
            char ch=str2.charAt(i);
            if(!hm.containsKey(ch)){
                hm.put(ch,1);
            }else{
                hm.put(ch,hm.get(ch)+1);
            }
        }

        for(int i=0;i<str1.length();i++)
        {
            char ch=str1.charAt(i);
            if(hm.containsKey(ch))
            {
                hm.put(ch,hm.get(ch)-1);
            }
        }

        int ans=0;
        for(var e: hm.entrySet()){
            ans+=e.getValue();
        }
        System.out.println("Total cost: "+ans);
    }
}
