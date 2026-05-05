// User function Template for Java

class Solution {
    int arraySum(int arr[]) {
        // code here
        int n = arr.length-1;
        int sum = 0;
        while(n>=0){
            sum += arr[n--];
        }
        return sum;
    }
}
