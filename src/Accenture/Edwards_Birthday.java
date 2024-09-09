package Accenture;
import java.util.*;
public class Edwards_Birthday {

//        It's edward's birthday today,his friend bought cicular cake for him.Edward
//        want's to find out max number of pieces he can get by making exactly N strainght
//       verticle cut on the (cake)
        // write a function return max number of pieces:
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of straight cuts:");
        int n=sc.nextInt();
        int ans=n*(n+1)/2;
          System.out.println(ans+1);

    }
}
