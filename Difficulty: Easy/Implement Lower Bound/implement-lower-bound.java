class Solution {
    int lowerBound(int[] arr, int target) {
        int l = 0, r = arr.length - 1, ans = arr.length;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] >= target) {
                ans = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }
}
