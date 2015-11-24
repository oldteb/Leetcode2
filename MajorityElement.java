public class Solution {
    public int majorityElement(int[] nums) {
        if(nums == null || nums.length == 0)  return 0;

        Arrays.sort(nums);

        return nums[nums.length/2];
    }

    int partition(int[] nums){
        int pivot = nums[nums.length - 1];
        int i = -1;
        int j = -1;
        int k = 0;
        int temp;

        for(; k < nums.length - 1; k++){
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

        temp = nums[j+1];
        nums[j+1] = pivot;
        nums[nums.length - 1] = temp;

        return i+1;
    }
}
