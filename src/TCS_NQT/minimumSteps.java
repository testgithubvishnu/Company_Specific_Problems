package TCS_NQT;

//staircase contains N steps man can climb stairs in power of 2
// find min number of steps man needs to reach at top
// Ex.. 3 -> 2(1+2), 4 -> 1(4), 5 ->2(1+4)
import java.util.Scanner;

public class minimumSteps {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of steps:");
        int N=sc.nextInt();

        // Bit-masking approach:
        // N into binary string and count set bits:
        int steps=0;
        String bin=Integer.toBinaryString(N);
        for(int i=0;i<bin.length();i++)
        {
            if(bin.charAt(i)=='1')  steps++;
        }
        System.out.println(steps);
    }
}
