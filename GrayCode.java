public class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> rst = new ArrayList<Integer>();
        rst.add(0);
        if(n < 1)  return rst;
        int size = 0;
        int base = 1;
        rst.add(1);

        for(int i = 1; i < n; i++){
            size = rst.size();
            base <<= 1;
            for(int j = 0; j < size; j++){
                rst.add(rst.get(size-1-j) | base);
            }
        }

        return rst;

    }
}
