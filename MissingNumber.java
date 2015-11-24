public class Solution {
    public int missingNumber(int[] nums) {
        if(nums == null || nums.length == 0)  return 0;

        long sum1 = 0;
        long sum2 = (1 + nums.length) * nums.length / 2;

        for(int i : nums)
            sum += i;


        return (int)(sum2 - sum1);
    }
}
