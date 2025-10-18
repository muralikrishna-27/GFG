class Solution {
    public int romanToDecimal(String s) {
        // code here
        int sum = 0;
        for(int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if(i < s.length()-1) {
                char next = s.charAt(i+1);
                if(current == 'I' && (next == 'V' || next == 'X')) {
                    sum -= 1;
                    continue;
                }else if(current == 'X' && (next == 'L' || next == 'C')) {
                    sum -= 10;
                    continue;
                } else if(current == 'C' && (next == 'D' || next == 'M')) {
                    sum -= 100;
                    continue;
                }
            }
            if(current == 'I') sum += 1;
            else if(current == 'V') sum += 5;
            else if(current == 'X') sum += 10;
            else if(current == 'L') sum += 50;
            else if(current == 'C') sum += 100;
            else if(current == 'D') sum += 500;
            else sum += 1000;
        }
        return sum;
    }
}