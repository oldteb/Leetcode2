public class Solution {
    public int lengthOfLastWord(String s) {
        if(s == null || s.length() == 0)  return 0;
        int isWord = 0;
        int length = 0;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(s.length()-1-i) == ' '){
                if(isWord == 0)  continue;
                else return length;
            }
            else{
                isWord = 1;
                length++;
            }
        }

        return length;


    }
}
