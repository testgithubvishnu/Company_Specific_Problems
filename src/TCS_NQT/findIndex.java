package TCS_NQT;

public class findIndex {
    public static void main(String[] args) {
        int[] arr={-7,1,5,2,-4,3,0};
        int n= arr.length;
        int[] leftSum=new int[n];
        int[] rightSum=new int[n];
        int index=-1;

        int left=0;
        for(int i=0;i<n;i++)
        {
            leftSum[i]=left;
            left+=arr[i];
        }

        int right=0;
        for(int i=arr.length-1;i>=0;i--)
        {
            rightSum[i]=right;
            right+=arr[i];
        }

        for(int i=0;i<n;i++)
        {
            if(leftSum[i]==rightSum[i])
            {
                index=i;
                break;
            }
        }
        System.out.println("Equilibrium index:"+index);
    }
}
