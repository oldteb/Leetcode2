public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0)  return "";
        int cmnLen = 0;
        char cmnChar = '1';
        StringBuffer sb = new StringBuffer();

        for(;true; cmnLen++){
            for(int i = 0; i < strs.length; i++){
                if(strs[i] == null || strs[i].length() == 0)  return "";
                else if(strs[i].length() < cmnLen + 1)  return sb.toString();
                else if(i == 0){
                    cmnChar = strs[0].charAt(cmnLen);
                }
                else if(cmnChar != strs[i].charAt(cmnLen)){
                    return sb.toString();
                }
            }
            sb.append(cmnChar);
        }

    }
}
