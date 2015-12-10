public class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0)  return 0;
        int len = 0;
        int temp = 0;
        int j;

        for(int i = 0; i < nums.length; i++){
            temp = nums[i];
            nums[len++] = nums[i];
            for(j = i; j+1 < nums.length && nums[j+1] == temp;){
                j++;
                if(j - i < 2){
                    nums[len++] = nums[j];
                }
            }
            i = j;
        }

        return len;

    }
}
