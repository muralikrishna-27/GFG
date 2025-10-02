class Solution {
    int maxSubarraySum(int[] nums) {
        // Code here
                int mx = Integer.MIN_VALUE;
        int count = 0;
        for(int n:nums){
            count += n;
            mx = Math.max(mx,count);
            if(count<0) count=0; 
        }
        return mx;
    }
}
