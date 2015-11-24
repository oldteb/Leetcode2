public class Solution {
    public int climbStairs(int n) {
        if(n <= 0)  return 0;
        int singleStep = 2;
        int jumpStep = 1;
        int temp = 0;

        if(n == 1)  return 1;
        else if(n == 2)  return 2;

        for(int i = 2; i < n; i++){
            temp = singleStep + jumpStep;
            jumpStep = singleStep;
            singleStep = temp;
        }

        return singleStep;

    }
}
