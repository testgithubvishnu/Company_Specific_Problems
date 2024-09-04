package Accenture;

public class SuperiorElement {
    public static void main(String[] args) {
        int[] arr={7,9,5,2,8,7};
        int ans=0;
        int Superior=Integer.MIN_VALUE;
        for(int i=arr.length-1;i>=0;i--)
        {
             if(arr[i]>Superior)
             {
                 ans++;
                 Superior=arr[i];
             }
        }
        System.out.println(ans);
    }
}
