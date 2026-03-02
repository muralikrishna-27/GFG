class Solution {
    static List<Integer> get(int a, int b) {
            a = a ^ b;
            b = a ^ b;
            a = a ^ b;
        return List.of(a, b);
    }
}