public class Solution {
    public int singleNumber(int[] nums) {
        if(nums == null || nums.length == 0)  return 0;
        int[] info = new int[32];
        int mask = 1;
        int rst = 0;

        for(int i : nums){
            for(int j = 0;j < 32; j++){
                if((i & mask) != 0){
                    info[j]++;
                }
                mask = mask << 1;
            }
            mask = 1;
        }

        mask = 1;

        for(int i = 0; i < 32; i++){
            if(info[i]%3 != 0){
                rst |= mask;
            }
            mask = mask << 1;
        }

        return rst;
    }
}
