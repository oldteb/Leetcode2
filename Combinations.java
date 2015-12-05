public class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> rst = new ArrayList<List<Integer>>();
        List<Integer> buf = new ArrayList<Integer>(k);
        if(n < 1 || k < 1 || k > n)  return rst;

        dfs(rst, n, k, 1, buf);

        return rst;
    }

    void dfs(List<List<Integer>> rst, int n, int k, int lvl, List<Integer> buf){
        if(buf.size() == k){
            List<Integer> temp = new ArrayList<Integer>(buf);
            rst.add(temp);
            return;
        }

        for(int i = lvl ; i <= n; i++){
            if(n - i + 1 < k - buf.size()){
                return;
            }
            buf.add(i);
            dfs(rst,n,k,i+1,buf);
            buf.remove(buf.size()-1);
        }

    }

}
