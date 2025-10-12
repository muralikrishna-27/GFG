class Solution {
    int smallestDivisor(int[] nums, int threshold) {
        // Code here
        int l = 1, r=0;
        for(int n:nums) if(n>r) r=n;
        int ans = r;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(isValid(nums,mid,threshold)){
                ans = mid;
                r = mid-1;
            }else l = mid+1;
        }
        return ans;
    }
    static int ceil(int a, int b){return (a+b-1)/b;}

    static boolean isValid(int[] arr, int divisor, int th){
        int total = 0;
        for(int val : arr){
            total += ceil(val,divisor);
            if(total>th) return false;
        }
        return true;
    }
}