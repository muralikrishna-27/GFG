class Solution {
    public int maxConsecBits(int[] arr) {
        int max = 1, curr = 1, n = arr.length;
        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1]) curr++;
            else curr = 1;
            max = Math.max(max, curr);
        }
        return max;
    }
}
