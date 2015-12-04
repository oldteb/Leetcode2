public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0)  return false;
        return BS2D(matrix, target, 0, matrix.length * matrix[0].length - 1);
    }

    boolean BS2D(int[][] matrix, int target, int idxL, int idxR){
        if(idxL == idxR ){
            if(target == matrix[idxL/matrix[0].length][idxL%matrix[0].length])  return true;
            else return false;
        }

        if(matrix[(idxL+idxR)/2/matrix[0].length][((idxL+idxR)/2)%matrix[0].length] < target){
            return BS2D(matrix, target, (idxL+idxR)/2+1, idxR);
        }
        else{
            return BS2D(matrix, target, idxL, (idxL+idxR)/2);
        }
    }
}
