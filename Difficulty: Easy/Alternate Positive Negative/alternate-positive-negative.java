class Solution {
    void rearrange(ArrayList<Integer> arr) {
        int n = arr.size();
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        // separate positives and negatives
        for (int x : arr) {
            if (x >= 0) pos.add(x);
            else neg.add(x);
        }

        int i = 0, p = 0, q = 0;

        // alternate placement
        while (p < pos.size() && q < neg.size()) {
            arr.set(i++, pos.get(p++));
            arr.set(i++, neg.get(q++));
        }

        // add remaining positives
        while (p < pos.size()) {
            arr.set(i++, pos.get(p++));
        }

        // add remaining negatives
        while (q < neg.size()) {
            arr.set(i++, neg.get(q++));
        }
    }
}
