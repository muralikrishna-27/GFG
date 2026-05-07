class Solution {
    double power(double x, int n) {
        // code here
        if (n < 0) {
            x = 1 / x;
            n = -n;
        }
        double res = 1.0;
        while (n != 0) {
            if (n % 2 != 0) {
                res *= x;
            }
            x *= x;
            n /= 2;
        }
        
        return res;
    }
}