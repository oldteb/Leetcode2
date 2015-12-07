public class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> rst = new ArrayList<List<Integer>>();
        if(k < 1 || n < 1 || k > n)  return rst;
        List<Integer> buf = new ArrayList<Integer>(k);

        dfs(rst, buf, k, n, 1, 0);

        return rst;
    }

    void dfs(List<List<Integer>> rst, List<Integer> buf, int k, int n, int lvl, int sum){
        if(buf.size() == k){
            if(sum == n){
                List<Integer> temp = new ArrayList<Integer>(buf);
                rst.add(temp);
            }
            return;
        }

        for(int i = lvl; i <= 9; i++){
            if(sum + i <= n){
                buf.add(i);
                dfs(rst, buf, k, n, i+1, sum+i);
                buf.remove(buf.size()-1);
            }
            else{
                return;
            }
        }
    }
}
