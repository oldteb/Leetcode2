public class Solution {
    public int titleToNumber(String s) {
        if(s == null || s.length() == 0)  return 0;
        int base = 1;   // overflow problem?
        int rst = 0;

        for(int i = 0; i < s.length(); i++){
            rst += (s.charAt(s.length()-i-1) - 'A' + 1) * base;
            base *= 26;
        }

        return rst;
    }
}
