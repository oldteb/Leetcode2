public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int ctr = 0;
        int base = 1;

        for(int i = 0; i < 32; i++){
            if((n & base) != 0)  ctr++;
            base = base<<1;
        }

        return ctr;
    }
}
