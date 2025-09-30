class Solution {
    public void sort012(int[] arr) {
        // code here
        int i =0;
        for(int pos = 0; pos<2; pos++){
            for(int j=0; j<arr.length; j++){
                if(arr[j]==pos){
                    arr[j] = arr[i];
                    arr[i] = pos;
                    i++;
                }
            }
        }
    }
}