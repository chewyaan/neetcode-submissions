class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != s.length()) {
            return false;
        }
        char[] sCharArray = s.toCharArray();
        char[] tCharArray = t.toCharArray();
        Arrays.sort(sCharArray);
        Arrays.sort(tCharArray);
        if (Arrays.equals(sCharArray, tCharArray)) {
            return true;
        } else {
            return false;
        }
    }
}
