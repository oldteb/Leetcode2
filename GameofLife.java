public class Solution {
    public void gameOfLife(int[][] board) {
        if(board == null || board.length == 0 || board[0].length == 0)
            return;

        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                board[i][j] = update(board,i,j);
            }
        }

        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] == 2 || board[i][j] == 4)  board[i][j] = 0;
                else board[i][j] = 1;
            }
        }
    }

    int update(int[][] board, int i, int j){
        int ctr = 0;

        for(int m = -1; m < 2; m++){
            for(int n = -1; n < 2; n++){
                if(i+m < 0 || i+m >= board.length)  continue;
                else if(j+n < 0 || j+n >= board[0].length)  continue;
                else if(board[i+m][j+n] == 1 || board[i+m][j+n] > 3){
                    ctr++;
                }
            }
        }
        ctr -= board[i][j];

        if(board[i][j] == 0){
            if(ctr == 3)  return 3;
            else return 2;
        }
        else{
            if(ctr >= 2 && ctr <= 3)  return 5;
            else return 4;
        }
    }
}
