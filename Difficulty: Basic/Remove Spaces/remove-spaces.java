class Solution {
    String removeSpaces(String s) {
        // code here
        char[] arr = s.toCharArray();
        int n = s.length();
        int i=0,itr=0;
        while(i<n){
            if(arr[i]!=' '){
                arr[itr++] = arr[i];
            }
            i++;
        }
        return new String(arr,0,itr);
    }
}