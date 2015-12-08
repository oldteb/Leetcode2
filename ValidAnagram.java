public class Solution {


    // The porpurse to add this inner class is to handle unicode characters
    class Tuple{
        int highBit = 0;
        int lowBit = 0;

        @Override
        public boolean equals(Object obj){
            Tuple t = (Tuple)obj;
            if(t.highBit == this.highBit && t.lowBit == this.lowBit)
                return true;
            else
                return false;
        }

        @Override
        public int hashCode(){
            return highBit + lowBit;
        }
    }


    public boolean isAnagram(String s, String t) {
        if(s == null || t == null)  return false;
        Tuple temp = new Tuple();
        Map<Tuple, Integer> map = new HashMap<Tuple, Integer>();

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) < 128){
                temp.highBit = s.charAt(i);
                temp.lowBit = 0;
            }
            else{
                temp.highBit = s.charAt(i);
                temp.lowBit = s.charAt(i+1);
            }

            if(map.containsKey(temp)){
                map.put(temp, map.get(temp) + 1);
            }
            else{
                map.put(temp, 1);
            }
        }

        for(int i = 0; i < t.length(); i++){
            if(t.charAt(i) < 128){
                temp.highBit = t.charAt(i);
                temp.lowBit = 0;
            }
            else{
                temp.highBit = t.charAt(i);
                temp.lowBit = t.charAt(i+1);
            }

            if(map.containsKey(temp)){
                map.put(temp, map.get(temp) - 1);
                if(map.get(temp) == 0)
                    map.remove(temp);
            }
            else{
                return false;
            }

        }

        if(map.size() == 0)
            return true;
        else
            return false;


    }
}
