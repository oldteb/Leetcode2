public class Solution {
    public int lengthOfLIS(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        int localMax = 0;
        int[] info = new int[nums.length];

        Arrays.fill(info,0);

        for(int i = 1; i < nums.length; i++){
            localMax = 0;
            for(int j = 0; j < i; j++){
                if(nums[j] < nums[i]){
                    localMax = Math.max(info[j]+1,localMax);
                }
            }
            info[i] = localMax;
        }

        localMax = 0;

        for(int i : info){
            localMax = Math.max(i, localMax);
        }

        return localMax+1;
    }
}
