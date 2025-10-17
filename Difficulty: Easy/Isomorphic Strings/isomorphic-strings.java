class Solution {
    public boolean areIsomorphic(String s1, String s2) {
        // code here
        int[] ms = new int[256];
        int[] mt = new int[256];
        for(int i=0; i<s1.length(); i++){
            int a = s1.charAt(i), b=s2.charAt(i);
            if(ms[a]!=mt[b]) return false;
            ms[a] = mt[b] = i+1;
        }
        return true;
    }
}