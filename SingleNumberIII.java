public class Solution {
    public int[] singleNumber(int[] nums) {
        if(nums == null || nums.length < 2)  return nums;

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i : nums){
            if(map.containsKey(i)){
                map.remove(i);
            }
            else{
                map.put(i,1);
            }
        }

        Set<Integer> keySet = map.keySet();
        Integer[] temp = keySet.toArray(new Integer[keySet.size()]);
        int[] rst = new int[keySet.size()];

        for(int i = 0; i < keySet.size(); i++)
            rst[i] = temp[i].intValue();

        return rst;

    }
}
