package Accenture;

import java.util.Scanner;

public class floydTrianglePattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int N=sc.nextInt();

        int[][] matrix= new int[N][N];
      int num=1;
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<=i;j++){
              //  int k=i;
                   System.out.print(num+" ");
                   num++;
            }
            System.out.println();
        }
    }
}
