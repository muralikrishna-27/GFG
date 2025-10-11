class Solution {
    public int kokoEat(int[] piles, int h) {
        // code here
        int l = 1, r = 0;
        for (int p : piles) r = Math.max(r, p);
        while (l < r) {
            int m = l + (r - l) / 2;
            long hours = 0;
            for (int p : piles) hours += (p + m - 1) / m; // ceil(p/m)
            if (hours <= h) r = m;
            else l = m + 1;
        }
        return l;
    }
}
