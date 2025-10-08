class Solution {
    public int peakElement(int[] arr) {
        int st = 0, end = arr.length - 1;
        while (st < end) {
            int mid = st + (end - st) / 2;
            if (arr[mid] > arr[mid + 1]) end = mid;
            else st = mid + 1;
        }
        return st;
    }
}
