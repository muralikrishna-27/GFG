class Solution {
    public int binarysearch(int[] a, int t) {
        int l = 0, r = a.length - 1, ans = -1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a[m] == t) { ans = m; r = m - 1; }   // keep searching left
            else if (a[m] < t) l = m + 1;
            else r = m - 1;
        }
        return ans;
    }
}
