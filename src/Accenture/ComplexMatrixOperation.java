package Accenture;

import java.util.Scanner;

public class ComplexMatrixOperation {
    // input size and elements of matrix
    // main matrix divide int two submatrix :
    // 1} for even indexed elemnts
    // 2} for odd indexed elements

    // sort both submatrices in ascending order
    // calculate and print sum of second largest elments from both matrices

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

    }
}
