package TCS_NQT;

import java.util.Scanner;
//programme to find the sum of all characters and all possible contigius
// character combination from given string
//Ex.. string str="321
//  output -> {3,2,1,32,21,321}  Adding them sum=380
public class sumOfChars {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=sc.nextLine();

        int sum=0;
        for(int i=0;i<str.length();i++)
        {
            for(int j=i;j<str.length();j++)
            {
                String sub=str.substring(i,j+1);
                sum=sum+Integer.valueOf(sub);
            }
        }
        System.out.println("sum is: "+sum);
    }
}
