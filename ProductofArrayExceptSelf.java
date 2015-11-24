public class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums == null || nums.length <= 1)  return nums;
        int[] arr1 = new int[nums.length];
        int[] arr2 = new int[nums.length];

        for(int i = 0; i < arr1.length; i++){
            if(i-1 < 0){
                arr1[i] = 1;
            }
            else{
                arr1[i] = nums[i-1] * arr1[i-1];
            }
        }

        for(int i = arr2.length-1; i >= 0; i--){
            if(i+1 >= arr2.length){
                arr2[i] = 1;
            }
            else{
                arr2[i] = nums[i+1] * arr2[i+1];
            }
        }

        for(int i = 0; i < arr2.length; i++){
            arr2[i] *= arr1[i];
        }

        return arr2;
    }
}
