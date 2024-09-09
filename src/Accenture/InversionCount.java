package Accenture;

public class InversionCount {
    public static void main(String[] args) {
        int[] arr={1,20,6,4,5};
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            int j=i;
            while(j< arr.length)
            {
                if(arr[j]<arr[i])
                {
                    count++;
                }
                j++;
            }
        }
        System.out.println("Number of Inversion pair: "+count);
    }
}
