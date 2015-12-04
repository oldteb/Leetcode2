public class Solution {
    public boolean isValidSudoku(char[][] board) {
        if(board == null || board.length == 0 || board[0].length == 0)  return false;
        int size = board.length;
        int[] info = new int[size+1];

        for(int i = 0; i < size; i++){
            Arrays.fill(info,0);
            for(int j = 0; j < size; j++){
                if(board[i][j] == '.')  continue;
                else if(info[board[i][j]-'0'] != 0)  return false;
                else info[board[i][j]-'0'] = 1;
            }
        }

        for(int i = 0; i < size; i++){
            Arrays.fill(info,0);
            for(int j = 0; j < size; j++){
                if(board[j][i] == '.')  continue;
                else if(info[board[j][i]-'0'] != 0)  return false;
                else info[board[j][i]-'0'] = 1;
            }
        }

        for(int i = 0; i < size; i += 3){
            for(int j = 0; j < size; j += 3){
                Arrays.fill(info,0);
                for(int k = 0; k < Math.sqrt(size); k ++){
                    for(int l = 0; l < Math.sqrt(size); l++){
                        if(board[i+k][j+l] == '.')  continue;
                        else if(info[board[i+k][j+l]-'0'] != 0)  return false;
                        else info[board[i+k][j+l]-'0'] = 1;
                    }
                }
            }
        }

        return true;
    }
}
