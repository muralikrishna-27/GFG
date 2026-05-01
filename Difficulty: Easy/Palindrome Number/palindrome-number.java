class Solution {
    public boolean isPalindrome(int n) {
        // code here
        int temp = Math.abs(n);
        int rev = 0;
        
        while(temp!=0){
            rev = (rev*10) + (temp%10);
            temp /= 10;
        }
        
        return (rev==Math.abs(n));
        
    }
}