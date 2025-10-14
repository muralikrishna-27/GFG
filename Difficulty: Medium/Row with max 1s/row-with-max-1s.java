// User function Template for Java

class Solution {
    public int rowWithMax1s(int arr[][]) {
        // code here
        int mx =0;
        int k=0;
        for(int i=0; i<arr.length; i++){
            int c=0;
            for(int j=0; j<arr[i].length; j++){
                c += arr[i][j];
            }
            if(c>mx){
                mx = c;
                k = i;
            }
        }
        return k;
    }
}