public class Solution {
    public int hIndex(int[] citations) {
        if(citations == null || citations.length == 0)  return 0;
        int temp;
        Arrays.sort(citations);

        for(int i = 0; i < citations.length; i++){
            temp = citations[citations.length-1-i];
            if(temp == i + 1){
                return temp;
            }
            else if(temp < i + 1){
                return i;
            }
        }

        return citations.length;

    }
}
