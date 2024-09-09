package TCS_NQT;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class nearestSmallerElement {
    public static void main(String[] args) {
        int[] arr={1,6,4,10,2,5};
        Stack<Integer> st= new Stack<>();
        ArrayList<Integer> al= new ArrayList<>();

      //  Arrays.toString(arr);
        al.add(-1);
        for(int i=0;i< arr.length;i++)
        {
            if(st.isEmpty()) {
                st.push(arr[i]);
            }
            else if(st.peek()<arr[i])
            {
               al.add(st.peek());
               st.push(arr[i]);
            }else{
                while(st.peek()>arr[i]){
                    st.pop();
                }
                al.add(st.peek());
                st.push(arr[i]);

            }
        }

        for(int i=0;i<al.size();i++)
        {
            System.out.print(al.get(i)+" ");
        }
    }
}
