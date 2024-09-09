package Accenture;

public class mergeSortedArray {
    public static void main(String[] args) {
        int[] arr1={1,3,6,7};
        int[] arr2={2,4,5,8,9};
        int m= arr1.length;
        int n= arr2.length;

        int[] ans=new int[m+n];
        int i=0,j=0,c=0;

        while( i<m && j<n){
            if(arr1[i]<arr2[j])
            {
                ans[c++]=arr1[i];
                i++;
            }
            else{
                ans[c++]=arr2[j];
                j++;
            }
        }
        while(i<m){
            ans[c++]=arr1[i];
            i++;
        }
        while(j<n){
            ans[c++]=arr2[j];
            j++;
        }
        int k=0;
        while(k< ans.length){
            System.out.print(ans[k]+" ");
            k++;
        }
    }
}
