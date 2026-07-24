public class Solution {
    public void setZeroes(int[][] matrix) {
        if(matrix == null) {
            return;
        }
        int R = matrix.length;
        int C = matrix[0].length;

        boolean rowHasZero = false;
        boolean colHasZero =  false;

        for(int i =0;i<C; i++){
            if(matrix[0][i] == 0){
                rowHasZero =  true;
                break;
            }
        }

        for(int i =0;i<R;i++){
            if(matrix[i][0] == 0){
                colHasZero =  true;
                break;
            }
        }

        for(int i =1 ;i<R; i++){
            for(int j=1; j<C; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for(int j =1;j<C;j++){
            if(matrix[0][j] ==0){
                nullifyCol(matrix, j, R);
            }
        }

        for(int i=1;i<R;i++){
            if(matrix[i][0] == 0){
                nullifyRow(matrix, i, C);
            }
        }

        if(rowHasZero){
            nullifyRow(matrix, 0, C);
        }

        if(colHasZero){
             nullifyCol(matrix, 0, R);
        }
        
    }

    public void nullifyRow(int[][] matrix, int i, int C){
        for(int col=0;col<C; col++){
            matrix[i][col] = 0;
        }
    }

    public void nullifyCol(int[][] matrix, int j, int R){
        for(int row=0;row<R;row++){
            matrix[row][j] = 0;
        }
    }
}
    
  