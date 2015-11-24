public class Solution {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }

        int max = Integer.MIN_VALUE;
        int local = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++){
            if(local <= 0){
                if(local < nums[i] ){
                    local = nums[i];
                }
            }
            else{
                if(local + nums[i] >= 0){
                    local += nums[i];
                }
                else{
                    local = 0;
                }
            }

            max = Math.max(max, local);
        }

        return max;

    }
}
