public class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums == null || nums.length == 0)  return 0;
        int end = nums.length - 1;
        int temp = 0;
        int i = 0;

        while(i <= end){
            if(nums[i] == val){
                temp = nums[end];
                nums[end] = nums[i];
                nums[i] = temp;
                end--;
            }
            else{
                i++;
            }
        }

        return end+1;
    }
}
