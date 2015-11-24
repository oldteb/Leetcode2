public class Solution {
    public int rob(int[] nums) {
        if(nums == null || nums.length == 0)  return 0;
        int other = 0;
        int last = nums[0];
        int temp = 0;

        if(nums.length == 1){
            return nums[0];
        }

        for(int i = 1; i < nums.length; i++){
            if(nums[i] + other > last){
                temp = last;
                last = nums[i] + other;
                other = temp;
            }
            else{
                other = last;
            }
        }

        return last;
    }
}
