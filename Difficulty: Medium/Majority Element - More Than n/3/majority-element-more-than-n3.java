class Solution {
    public ArrayList<Integer> findMajority(int[] nums) {
        // Code here
        int n = nums.length;
        Arrays.sort(nums);
        ArrayList<Integer> ans = new ArrayList<>();
        int count = 1;
        for(int i=1; i<n; i++){
            if(nums[i]==nums[i-1]) count++;
            else{
                if(count>n/3) ans.add(nums[i-1]);
                count = 1;
            }
        }
        if(count > n/3) ans.add(nums[n-1]);
        return ans;
    }
}