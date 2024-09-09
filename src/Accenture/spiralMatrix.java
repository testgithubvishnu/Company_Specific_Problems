package Accenture;

public class spiralMatrix {
    public static void main(String[] args) {
        int[][] matrix= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        // spiral matrix :
        // 1,2,3,4
        // 5,6,7,8
        // 9,10,11,12
        // 13,14,15,16
        // 1,2,3,4,8,12,16,15,14,13,9,5,1,2,3,7,11,10,6

        int rows= matrix.length, cols= matrix[0].length;
        int top=0,down=rows-1,left=0,right=cols-1;
        int direction=0;
        while(top<=down && left<=right){
            if(direction==0)
            {
                for(int i=left;i<=right;i++){
                    System.out.print(matrix[top][i]+" ");
                }
                top++;
            }
            else if(direction==1)
            {
                for(int i=top;i<=down;i++){
                    System.out.print(matrix[i][right]+" ");
                }
                right--;
            }
            else if(direction==2)
            {
                for(int i=right;i>=left;i--){
                    System.out.print(matrix[down][i]+" ");
                }
                down--;
            }
            else if(direction==3)
            {
                for(int i=down;i>=top;i--){
                    System.out.print(matrix[i][left]+" ");
                }
                left++;
            }
          direction=(direction+1)%4;

        }

    }
}
