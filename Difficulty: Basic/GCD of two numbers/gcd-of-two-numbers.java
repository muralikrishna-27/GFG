class Solution {
    public static int gcd(int a, int b) {
        // code here
        if(a==0 || b==0) return Math.max(a, b);
        
        while(b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        
        return a;
    }
}
