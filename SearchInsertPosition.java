public class Solution {
    public int searchInsert(int[] nums, int target) {
        if(nums == null || nums.length == 0) return 0;

        return BinerySearch(nums, 0, nums.length-1, target);
    }

    int BinerySearch(int[] nums, int begin, int end, int target){
        if(begin == end){
            if(nums[begin] >= target)  return begin;
            else return begin + 1;
        }

        if(nums[(end + begin)/2] < target){
            begin = (end + begin)/2 + 1;
        }
        else{
            end = (end + begin)/2;
        }

        return BinerySearch(nums, begin, end, target);

    }
}
