public class Solution {
    public String intToRoman(int num) {
        StringBuffer sb = new StringBuffer();
        if(num < 1)  return sb.toString();
        int temp = 0;

        char[][] info = {{'I','V'}, {'X', 'L'}, {'C', 'D'}, {'M'}};
        int lvl = 0;

        while(num != 0){
            temp = num % 10;
            if(temp < 4){
                for(int i = 0; i < temp; i++){
                    sb.append(info[lvl][0]);
                }
            }
            else if( temp == 4){
                sb.append(info[lvl][1]);
                sb.append(info[lvl][0]);
            }
            else if(temp > 4 && temp < 9){
                for(int i = 5; i < temp; i++){
                    sb.append(info[lvl][0]);
                }
                sb.append(info[lvl][1]);
            }
            else{  // temp == 9
                sb.append(info[lvl+1][0]);
                sb.append(info[lvl][0]);
            }

            lvl++;
            num /= 10;
        }

        return sb.reverse().toString();

    }
}
