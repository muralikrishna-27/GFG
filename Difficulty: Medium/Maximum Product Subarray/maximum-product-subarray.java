class Solution {
    int maxProduct(int[] arr) {
        // code here
        int res = arr[0];
        int mxp = arr[0];
        int mnp = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]<0){
                int temp = mxp;
                mxp = mnp; 
                mnp = temp;
            }
            mxp = Math.max(arr[i], arr[i]*mxp);
            mnp = Math.min(arr[i], arr[i]*mnp);
            res = Math.max(mxp,res);
        }
        return res;
    }
}