class Solution {

    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] nums) {
        // code here
        Arrays.sort(nums);
        int n = nums.length;
        if (n == 0) return 0;
        int max = 1, count = 1;
        for (int i = 0; i < n-1; i++) {
            if (nums[i + 1] == nums[i]) continue; 
            else if ((nums[i + 1]-nums[i])==1) count++;
            else count = 1; 
            max = Math.max(max, count);
        }

        return max;
    }
}