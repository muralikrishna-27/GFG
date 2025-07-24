class Solution {
    // Function to remove duplicates from the given array.
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        int i = 0;
        for(int j=1; j<arr.length; j++ ){
            if(arr[i] != arr[j]){
                arr[++i] = arr[j];
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        int k =0;
        while(k<i+1){
            result.add(arr[k++]);
        }
        return result;
    }
}
