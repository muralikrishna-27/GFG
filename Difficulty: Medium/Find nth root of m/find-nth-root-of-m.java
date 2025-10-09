class Solution {
    public int nthRoot(int n, int m) {
        // code here
        if(m==0 || m==1) return n;
        int low = 1,high = m;
        while(low<=high){
            long mid = low + (high - low) / 2;
            long pow = 1;
            for (int i = 0; i < n; i++) {
                pow *= mid;
                if (pow > m) break; 
            }

            if (pow == m) return (int) mid;
            if (pow < m) low = (int) mid + 1;
            else high = (int) mid - 1;
        }
        return -1; 
    }
}