class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int Largest = arr[0];
        int Slargest = -1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>Largest){
                Slargest = Largest;
                Largest = arr[i];
            }else if(arr[i]<Largest && arr[i]>Slargest) Slargest = arr[i];
        }
        return Slargest;
    }
}