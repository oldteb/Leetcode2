public class Solution {
    public int trailingZeroes(int n) {
        if(n <= 0)  return 0;

        int base = 5;
        int ctr = 0;

         while(n >= base){
             ctr += n / base;
             if(Integer.MAX_VALUE / 5 < base)  break;
             else  base *= 5;
        }

        return ctr;
    }
}
