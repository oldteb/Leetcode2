public class Solution {
    public String countAndSay(int n) {
        if(n < 0)  return null;
        StringBuffer sb = new StringBuffer(Integer.toString(1));
        int ctr = 0;
        for(int i = 1; i < n; i++){
            String temp = sb.toString();
            sb = new StringBuffer();
            for(int j = 0; j < temp.length(); j++){
                char c = temp.charAt(j);
                ctr = 1;
                while(j+1 < temp.length() && temp.charAt(j+1) == c){
                    ctr++;
                    j++;
                }
                sb.append(Integer.toString(ctr));
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
