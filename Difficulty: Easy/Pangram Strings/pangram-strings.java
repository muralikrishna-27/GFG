// User function Template for Java

class Solution {
    int isPanagram(String sentence) {
        // code here
        // convert to lowercase and reassign
        sentence = sentence.toLowerCase();

        // check every letter from a to z
        for (char c = 'a'; c <= 'z'; c++) {
            if (sentence.indexOf(c) == -1) {
                return 0;
            }
        }
        return 1;
    }
}

