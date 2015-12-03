public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums1 == null || nums1.length == 0)  return;
        if(nums2 == null || nums2.length == 0 || n <= 0)  return;
        int idx1 = m-1;
        int idx2 = n-1;

        for(int i = 0; i < m+n; i++){
            if(idx1 >= 0 && idx2 >= 0){
                if(nums1[idx1] > nums2[idx2]){
                    nums1[nums1.length-1-i] = nums1[idx1--];
                }
                else{
                    nums1[nums1.length-1-i] = nums2[idx2--];
                }
            }
            else if(idx1 >= 0){
                break;
            }
            else{
                nums1[nums1.length-1-i] = nums2[idx2--];
            }
        }

        return;
    }
}
