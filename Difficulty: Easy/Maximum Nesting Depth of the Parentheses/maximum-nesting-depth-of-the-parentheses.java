class Solution {
    public static int maxDepth(String s) {
        // code here
        int count = 0;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(')
                count++;
            max = Math.max(max, count);
            if (s.charAt(i) == ')') 
                count--;
        }
        return max;
    }
}
