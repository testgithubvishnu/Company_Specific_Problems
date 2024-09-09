package TCS_NQT;

import java.util.Scanner;

// N=3,M=100,P=10%
// N=3 P=100,N=2 P=10, N=1 P=1;
// Ans is 1

// we have to find profit earned by root person:
public class calculateProfit {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // Height of network marketing:
        System.out.println("Heigth of networking market:");
        int N=sc.nextInt();
        System.out.println("Enter the profit");
        // profit earned by Nth level person:
        double M=sc.nextDouble();
        System.out.println("Enter percent:");
        //profit percent need to pass to subordinate:
        int P=sc.nextInt();

        for(int i=0;i<N-1;i++)
        {
            M=(M*P)/100;
        }
        System.out.println("Profit earned by root:"+M);

    }
}
