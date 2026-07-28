class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<String, Integer> sMap = new HashMap<>();
        Map<String, Integer> tMap = new HashMap<>();

        // Initialize count to 0
        for (int i = 0; i < s.length(); i++) {
            String sKey = s.substring(i,i+1);
            String tKey = t.substring(i,i+1);
            sMap.put(sKey, 0);
            tMap.put(tKey, 0);
        }
        // Count frequencies for s
        for (int j = 0; j < s.length(); j++) {
            String key = s.substring(j,j+1);
            sMap.put(key, sMap.get(key)+1);
        }
        // Count frequencies for t
        for (int k = 0; k < t.length(); k++) {
            String key = t.substring(k,k+1);
            tMap.put(key, tMap.get(key)+1);
        }
        // Compare
        for (String character : sMap.keySet()) {
            if (!java.util.Objects.equals(sMap.get(character), tMap.get(character))) {
                return false;
            }
        }
        return true;
    }
}
