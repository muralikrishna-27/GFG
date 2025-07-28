class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        int mx = Integer.MIN_VALUE;
        int cs = 0;
        for(int n : arr){
            cs = cs + n;
            mx = Math.max(mx,cs);
            if(cs<0){
                cs = 0;
            }
        }
        return mx;
        
    }
}
