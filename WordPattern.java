public class Solution {
    public boolean wordPattern(String pattern, String str) {
        if((pattern == null || pattern.length() == 0)
                && (str == null || str.length() == 0))
            return true;
        if(!(!(pattern == null || pattern.length() == 0)
                && !(str == null || str.length() == 0)))
            return false;

        String[] words = str.split("\\s+");

        if(words.length != pattern.length())  return false;

        Map<Character, String> map1 = new HashMap<Character, String>();
        Map<String, Character> map2 = new HashMap<String, Character>();

        for(int i = 0; i < words.length; i++){
            if(map1.containsKey(pattern.charAt(i)) == true){
                if(map1.get(pattern.charAt(i)).equals(words[i]) == false)  return false;
            }
            else{
                if(map2.containsKey(words[i]) == true)  return false;
                else{
                    map1.put(pattern.charAt(i), words[i]);
                    map2.put(words[i], pattern.charAt(i));
                }
            }
        }

        return true;

    }
}
