public class Solution {
    public void rotate(int[][] matrix) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0)  return;
        int lvl = 0;
        int n = matrix.length;
        int temp = 0;

        while(lvl < n/2){
            for(int i = 0; i < n-2*lvl-1; i++){
                temp = matrix[i+lvl][n-1-lvl];
                matrix[i+lvl][n-1-lvl] = matrix[lvl][lvl+i];
                matrix[lvl][lvl+i] = matrix[n-1-lvl-i][lvl];
                matrix[n-1-lvl-i][lvl] = matrix[n-1-lvl][n-1-lvl-i];
                matrix[n-1-lvl][n-1-lvl-i] = temp;
            }
            lvl++;
        }

        return;

    }
}
