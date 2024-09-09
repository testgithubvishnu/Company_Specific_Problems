package Accenture;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class RegionsOnPlane {
    // There  are N stright lines that are not parallel and no 3 lines go through
    // same point.The line divides the plane into M regions.
    // Write a funtion to find out max no. of number of regions he can get.

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no. of cuts");
        int n= sc.nextInt();
        // Approach same as Edward's birthday:
        int ans=n*(n+1)/2;
        System.out.println(ans+1);
    }
}
