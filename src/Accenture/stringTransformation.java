package Accenture;

public class stringTransformation {
    public static void main(String[] args) {
        String str="abaabbcc";
        char[] arr=str.toCharArray();
        for(int i=0;i< arr.length;i++)
        {
              if(arr[i]=='a'){
                  arr[i]='b';
              }
              else if(arr[i]=='b'){
                  arr[i]='a';
              }
        }
        String ans= new String(arr);
        System.out.println(ans);
    }
}
