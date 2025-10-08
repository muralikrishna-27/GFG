class Solution {
    public int findKRotation(int arr[]) {
        // Code here
        int n = arr.length;
        int min = arr[0], minIndex = 0;
        for (int i = 0; i < n; i++) {
            if (min > arr[i]) {
                min = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
}