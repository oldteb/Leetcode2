public class Solution {
    public boolean isUgly(int num) {
        if( num < 1)  return false;
        else if(num == 1)  return true;
        int[] factor = {2,3,5};
        int i = 0;

        while(num != 1){
            if(i > 2){
                return false;
            }
            if(num % factor[i] == 0){
                num /= factor[i];
            }
            else{
                i++;
            }
        }

        return true;

    }
}
