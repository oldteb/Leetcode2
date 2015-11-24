public class Solution {
    public int numTrees(int n) {
        if( n <= 0 )  return 0;
        int[] info = new int[n];
        int temp = 0;

        info[0] = 1;

        for(int i = 1; i < n; i++){
            info[i] = 2 * info[i-1];
            for(int j = 0; j < i-1; j++){
                temp += info[j] * info[i-j-2];
            }
            info[i] += temp;
            temp = 0;
        }

        return info[n-1];

    }
}
