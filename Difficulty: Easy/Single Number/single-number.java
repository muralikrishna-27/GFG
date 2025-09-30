// User function Template for Java

class Solution {
    int getSingle(int nums[]) {
        // code here
                int result = 0;
        for (int num : nums) result ^= num;
        return result;
    }
}