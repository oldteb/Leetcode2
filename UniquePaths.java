public class Solution {
    public int uniquePaths(int m, int n) {
        if(m <= 0 || n <= 0)  return 0;
        int[][] info = new int[m][n];

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(i == 0){
                    info[i][j] = 1;
                }
                else if(j == 0){
                    info[i][j] = 1;
                }
                else{
                    info[i][j] = info[i-1][j] + info[i][j-1];
                }
            }
        }

        return info[m-1][n-1];

    }
}
