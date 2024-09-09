package TCS_NQT;

// Jack has two strings  A&B .jill has to derive C  from A.
// by deleting element from string A,such that String C does'nt contain
// any element of string B
//Ex..Tiger ->A, Ti ->B  ger ->C
public class deriveString {
    public static void main(String[] args) {
        String str1="processed";
        String str2="esd";

        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str1.length();i++)
        {
            char ch=str1.charAt(i);
            if(str2.indexOf(ch)<0)
            {
                sb.append(ch);
            }
        }
        System.out.println(sb);
    }
}
