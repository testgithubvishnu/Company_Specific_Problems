package TCS_NQT;

//Given Square matrix,calculate the absolute differnce between the sums of it's diagonal
public class diagonalDifference {
    public static void main(String[] args) {
        int[][] matrix={{3,8,9},{7,2,5},{4,6,9}};
        int m=matrix.length;
        int n=matrix[0].length;

        int suml=0;
        int sumr=0;

        int i=0;
        int j=0;

        while(i!=m && j!=n)
        {
            suml+=matrix[i][j];
            i++;
            j++;
        }
        int k=0;
        int l=n-1;
        while(k!=m && l>=0)
        {
            sumr+=matrix[k][l];
            k++;
            l--;
        }
        System.out.println(Math.abs(suml-sumr));
    }
}
