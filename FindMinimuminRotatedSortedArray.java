public class Solution {
    public int findMin(int[] nums) {
        if(nums == null || nums.length == 0)  return 0;
        int begin = 0;
        int end = nums.length - 1;
        int mid = 0;

        while(end != begin){
            if(nums[begin] < end[end])  return nums[begin];
            mid = (begin + end)/2;

            if(nums[mid] > nums[end]){
                begin = mid + 1;
            }
            else{
                end = mid;
            }
        }

        return nums[begin];

    }
}
