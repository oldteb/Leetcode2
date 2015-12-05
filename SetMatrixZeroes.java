public class Solution {
    public void setZeroes(int[][] matrix) {
        int mark = 0;
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return;
        }

        int[] info = new int[matrix[0].length];
        Arrays.fill(info, 0);

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    mark = 1;
                    info[j] = 1;
                }
            }
            if(mark == 1){
                mark = 0;
                Arrays.fill(matrix[i], 0);
            }
        }

        for(int i = 0; i < info.length; i++){
            if(info[i] == 1){
                for(int j = 0; j < matrix.length; j++){
                    matrix[j][i] = 0;
                }
            }
        }

        return matrix;
    }
}
