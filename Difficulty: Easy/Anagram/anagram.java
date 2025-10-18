class Solution {
    public static boolean areAnagrams(String s, String t) {
        // code here
        if(s.length()!=t.length()) return false;
        int chars[] = new int[26];
        for(char c:s.toCharArray()) chars[c-'a']++;
        for(char c: t.toCharArray()) chars[c-'a']--;
        for(int n : chars) if(n!=0) return false;
    return true;
    }
}