public class Solution {
    public boolean isPalindrome(int x) {
        int baseH = 1;
        int baseL = 1;
        if(x == 0)  return true;
        else if(x < 0)  return false;

        while(!(x/baseH > -10 && x/baseH < 10)){
            baseH *= 10;
        }

        while(baseH > baseL){
            if((x / baseH)%10 != (x/baseL)%10)  return false;
            baseH /= 10;
            baseL *= 10;
        }

        return true;
    }
}
