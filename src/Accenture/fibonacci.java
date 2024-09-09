package Accenture;

public class fibonacci
{
    public static int fibonic(int n)
    {
        if(n<=1)
        {
            return n;
        }
         return fibonic(n-1)+fibonic(n-2);
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(fibonic(n));
    }
}
