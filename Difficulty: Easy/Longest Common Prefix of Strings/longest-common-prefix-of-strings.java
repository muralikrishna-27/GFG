// User function Template for Java
class Solution {
    public String longestCommonPrefix(String strs[]) {
        // code here
                String prefix = strs[0];
        for(String word:strs){
            while(word.indexOf(prefix)!=0)
                prefix = prefix.substring(0,prefix.length()-1);
        }
        return prefix;
    }
}