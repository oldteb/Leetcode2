public class Solution {
    public boolean isIsomorphic(String s, String t) {
        if((s == null || s.length() == 0)
                && (t == null || t.length() == 0))
            return true;
        if(!(!(s == null || s.length() == 0)
                && !(t == null || t.length() == 0)))
            return false;
        char c1, c2;

        Map<Character, Character> map1 = new HashMap<Character, Character>();
        Map<Character, Character> map2 = new HashMap<Character, Character>();

        if(s.length() != t.length())  return false;

        for(int i = 0; i < s.length(); i++){
            c1 = s.charAt(i);
            c2 = t.charAt(i);
            if(map1.containsKey(c1)){
                if(map1.get(c1) != c2)  return false;
            }
            else{
                if(map2.containsKey(c2) == true)  return false;
                map1.put(c1,c2);
                map2.put(c2,c1);
            }
        }

        return true;
    }
}
