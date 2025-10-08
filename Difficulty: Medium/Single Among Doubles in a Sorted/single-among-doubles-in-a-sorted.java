class Solution {
    int single(int[] nums) {
        // code here
                int n = nums.length;
        int left = 0, right = n-1;
        while(left<right){
            int mid = left+(right-left)/2;
            if(mid%2!=0) mid--;
            if(nums[mid]==nums[mid+1]) left = mid+2;
            else right = mid;
        }
        return nums[left];
    }
}