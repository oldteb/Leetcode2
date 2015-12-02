public class Solution {
    public int minPathSum(int[][] grid) {
        if(grid == null || grid.length == 0 || grid[0].length == 0)  return 0;
        int[][] info = new int[grid.length][grid[0].length];

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(i == 0 && j == 0){
                    info[i][j] = grid[i][j];
                }
                else if(i == 0){
                    info[i][j] = info[i][j-1] + grid[i][j];
                }
                else if(j == 0){
                    info[i][j] = info[i-1][j] + grid[i][j];
                }
                else{
                    info[i][j] = Math.min(info[i-1][j] , info[i][j-1]) + grid[i][j];
                }
            }
        }

        return info[grid.length-1][grid[0].length-1];
    }
}
