public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> rst = new ArrayList<List<Integer>>();
        if(nums == null || nums.length == 0)  return rst;
        List<Integer> temp = new ArrayList<Integer>();
        int[] mark = new int[nums.length];
        for(int i : mark){
            i = 0;
        }

        dfs(rst, temp, nums, mark);

        return rst;

    }

    void dfs(List<List<Integer>> rst, List<Integer> temp, int[] nums, int[] mark){
        if(temp.size() == nums.length){
            List<Integer> tlist = new ArrayList<Integer>();
            for(Integer i : temp){
                tlist.add(i);
            }
            rst.add(tlist);
            return;
        }

        for(int i = 0; i < nums.length; i++){
            if(mark[i] == 1)  continue;
            if(i > 0 && mark[i-1] == 0 && nums[i-1] == nums[i])  continue;
            temp.add(nums[i]);
            mark[i] = 1;
            dfs(rst, temp, nums, mark);
            mark[i] = 0;
            temp.remove(temp.size() - 1);
        }

        return;
    }
}
