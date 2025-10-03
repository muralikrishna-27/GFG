class Solution {
    void nextPermutation(int[] nums) {
        // code here
        int n = nums.length;
        int i = n-2;
        while(i>=0 && nums[i]>= nums[i+1]) i--;
        if(i>=0){
            int j = n-1;
            while(nums[j]<=nums[i]) j--;
            swap(nums,i,j);
        }
        reverse(nums,i+1,n-1);
    }
    private void swap(int[] arr,int left,int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
    private void reverse(int[]arr,int start,int end){
        while(start<end) swap(arr,start++,end--);
    }
}