package TCS_NQT;
// Given set 0f (0,1,2) output should all ones first then all 0s then 2s at last
public class rearrangeDigits {
    public static void main(String[] args) {
        int[] arr={0,2,1,0,1,2};
        // output : 1 1 0 0 2 2

        int count0=0;
        int count1=0;
        int count2=0;

        for(int i=0;i<arr.length;i++) {
            if(arr[i]==1) count1++;
            else if(arr[i]==0) count0++;
            else  count2++;

        }
        for(int i=0;i< arr.length;i++)
        {
            if(count1>0){
                arr[i]=1;
                count1--;
            }else if(count0>0)
            {
                arr[i]=0;
                count0--;
            }
            else arr[i]=2;
        }
   for(int n:arr){
       System.out.print(n+" ");
   }
    }
}
