class Solution {
    public String reverseWords(String s) {
        // 1. Remove leading/trailing dots and split by one or more dots
        String[] words = s.replaceAll("^\\.+|\\.+$", "").split("\\.+");
        
        // 2. Reverse the words
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i != 0) sb.append("."); // add dot between words
        }
        
        return sb.toString();
    }
}
