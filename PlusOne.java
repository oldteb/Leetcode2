public class Solution {
    public int[] plusOne(int[] digits) {
        int[] rst = new int[digits.length];
        if(digits == null || digits.length == 0)  return rst;
        int sign = 1;

        for(int i = 0; i < digits.length; i++){
            rst[digits.length-1-i] = (digits[digits.length-1-i] + sign) % 10;
            sign = (digits[digits.length-1-i] + sign) / 10;
        }

        if(sign == 1){
            rst = new int[digits.length + 1];
            rst[0] = 1;

        }

        return rst;

    }
}
