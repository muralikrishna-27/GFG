class Solution {
    int countWords(String str) {
        int count = 0;
        boolean inWord = false;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '\\' && i + 1 < str.length()) {
                char next = str.charAt(i + 1);
                if (next == 'n' || next == 't') {
                    inWord = false;
                    i++; 
                    continue;
                }
            }

            if (ch == ' ' ) {
                inWord = false;
            } else {
                if (!inWord) {
                    count++;
                    inWord = true;
                }
            }
        }
        return count;
    }
}