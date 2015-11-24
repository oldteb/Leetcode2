public class Solution {
    public void moveZeroes(int[] nums) {
        int zeroNum = 0;
        if(nums == null || nums.length == 0)  return;
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                zeroNum++;
                continue;
            }
            else{
                nums[i - zeroNum] = nums[i];
            }
        }
        
        for(int i = 0; i < zeroNum; i++){
            nums[nums.length - zeroNum + i] = 0;
        }
    }
}