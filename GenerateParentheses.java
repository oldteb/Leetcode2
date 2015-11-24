public class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> rst = new ArrayList<String>();
        int lvl = 0;
        if(n < 1)  return rst;
        StringBuffer sb = new StringBuffer();
        sb.append('(');
        lvl++;

        help(rst, sb, lvl, n);

        return rst;

    }

    void help(List<String> rst, StringBuffer sb, int lvl, int n){
        if(sb.length() == 2 * n){
            rst.add(sb.toString());
            return;
        }

        if(lvl < n){
            sb.append('(');
            help(rst,sb,lvl+1,n);
            sb.deleteCharAt(sb.length()-1);
        }
        if(lvl > sb.length() - lvl){
            sb.append(')');
            help(rst,sb,lvl,n);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
