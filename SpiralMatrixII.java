public class Solution {
    public int[][] generateMatrix(int n) {
        int[][] rst = new int[0][];
        if(n < 1)  return rst;
        rst = new int[n][n];
        int num = 1;
        int lvl = 0;

        while(num <= n*n){
            if(num == n*n){
                rst[lvl][lvl] = num;
                break;
            }
            for(int i = 0; i < n-1-lvl*2; i++){
                rst[lvl][lvl+i] = num++;
            }
            for(int i = 0; i < n-1-lvl*2; i++){
                rst[lvl+i][n-1-lvl] = num++;
            }
            for(int i = 0; i < n-1-lvl*2; i++){
                rst[n-1-lvl][n-1-i-lvl] = num++;
            }
            for(int i = 0; i < n-1-lvl*2; i++){
                rst[n-1-i-lvl][lvl] = num++;
            }
            lvl++;
        }

        return rst;
    }
}
