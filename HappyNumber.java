public class Solution {
    public boolean isHappy(int n) {
        if(n < 1)  return false;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int temp = n;

        while(temp != 1){
            temp = digitsSum(temp);
            if(map.containsKey(temp) == true){
                return false;
            }
            else{
                map.put(temp,1);
            }
        }

        return true;


    }

    int digitsSum(int n){
        int temp = 0;

        while(n > 0){
            temp += math.pow(n % 10, 2);
            n = n / 10;
        }

        return temp;
    }
}
