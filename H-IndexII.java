public class Solution {
    public int hIndex(int[] citations) {
        if(citations == null || citations.length == 0)  return 0;

        for(int i = 0; i < citations.length; i++){
            if(citations[citations.length-1-i] == i+1){
                return i+1;
            }
            else if(citations[citations.length-1-i] < i+1){
                return i;
            }
        }

        return citations.length;
    }
}
