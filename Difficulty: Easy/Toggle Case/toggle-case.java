class Solution {
    public String toggleCase(String s) {
        // code here
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isUpperCase(ch)) {
                res.append(Character.toLowerCase(ch));
            } else {
                res.append(Character.toUpperCase(ch));
            }
        }
        return res.toString();
    }
}
