public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> rst = new ArrayList<Integer>();
        if(rowIndex < 0)  return rst;
        int temp = 0;

        rst.add(1);
        for(int i = 0; i < rowIndex; i++){
            rst.add(1);
            for(int j = 0; j < i; j++){
                rst.add(rst.get(0) + rst.get(1));
                rst.remove(0);
            }
            rst.add(1);
            rst.remove(0);
        }

        return rst;

    }
}
