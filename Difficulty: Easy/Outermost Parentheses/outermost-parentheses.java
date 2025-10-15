class Solution {
    public static String removeOuter(String s) {
        // code here
        StringBuilder res = new StringBuilder();
        int bal = 0;
        for (char c : s.toCharArray()) {
            if (c == '(' && bal++ > 0) res.append(c);
            if (c == ')' && --bal > 0) res.append(c);
        }
        return res.toString();
    }
}
