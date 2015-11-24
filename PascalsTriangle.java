public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> rst = new ArrayList<List<Integer>>();
        if(numRows == 0)  return rst;
        List<Integer> temp = new ArrayList<Integer>(1);
        temp.add(1);
        rst.add(temp);

        for(int i = 1 ; i < numRows; i++){
            temp = new ArrayList<Integer>(rst.get(rst.size()-1).size() + 1);
            temp.add(1);
            for(int j = 1; j < rst.get(rst.size()-1).size(); j++){
                temp.add(rst.get(rst.size()-1).get(j-1) + rst.get(rst.size()-1).get(j));
            }
            temp.add(1);
            rst.add(temp);
        }

        return rst;



    }
}
