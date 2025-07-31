class Solution {
    int missingNum(int arr[]) {
        // code here
        long n = arr.length+1;
        double s = n*(n+1)/2;
        double s1 = 0;
        for(int a:arr){
            s1 += a;
        }
        return (int)(s-s1);
    }
}