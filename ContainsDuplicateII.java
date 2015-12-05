public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums == null || nums.length == 0 || k < 1)  return false;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(nums[0], 0);

        for(int i = 1; i < nums.length; i++){
            if(map.containsKey(nums[i]) == true
                && i - map.get(nums[i]) <= k){
                return true;
            }
            map.put(nums[i],i);
        }

        return false;

    }
}
