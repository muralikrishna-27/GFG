// User function Template for Java
// User function Template for Java

/*
class Pair<K, V> {
    private final K key;
    private final V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}

Java users need to return result in Pair class
For Example -> return new Pair(minimum,maximum)
*/

class Solution {
    public Pair<Integer, Integer> getMinMax(int[] arr) {
        // Code Here
        int large = Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE;
        for(int i =0; i<arr.length; i++){
            if(large<arr[i]){
                large = arr[i];
            }
            if(small>arr[i]){
                small = arr[i];
            }
        }
        return new Pair(small,large);
    }
}
