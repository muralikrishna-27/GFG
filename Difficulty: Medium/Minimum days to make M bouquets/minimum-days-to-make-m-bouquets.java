class Solution {
    public int minDaysBloom(int[] arr, int k, int m) {
        int n = arr.length;
        if (n < (long)m * k) return -1;

        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int x : arr) {
            min = Math.min(min, x);
            max = Math.max(max, x);
        }

        int low = min, high = max, ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (possible(arr, n, k, m, mid)) {
                ans = mid;
                high = mid - 1;
            } else low = mid + 1;
        }
        return ans;
    }

    private boolean possible(int[] arr, int n, int k, int m, int day) {
        int flowers = 0, bouquets = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] <= day) flowers++;
            else {
                bouquets += flowers / k;
                flowers = 0;
            }
        }
        bouquets += flowers / k;
        return bouquets >= m;
    }
}
