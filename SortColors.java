public class Solution {
    public void sortColors(int[] nums) {
        if(nums == null || nums.length == 0){
            return;
        }

        partition3way(nums);

        return;
    }

    void partition3way(int[] nums){
        int pivot = 1;
        int i = -1;
        int j = -1;
        int k = 0;
        int temp;

        for(; k < nums.length; k++){
            if(nums[k] < pivot){
                temp = nums[k];
                nums[k] = nums[j+1];
                nums[j+1] = nums[i+1];
                nums[i+1] = temp;
                i++;  j++;
            }
            else if(nums[k] == pivot){
                temp = nums[j+1];
                nums[j+1] = nums[k];
                nums[k] = temp;
                j++;
            }
        }

        return;
    }
}
