class Solution {
    ArrayList<Integer> nthRowOfPascalTriangle(int n) {
        ArrayList<Integer> row = new ArrayList<>();
        row.add(1);
        for (int i = 1; i < n; i++) {
            ArrayList<Integer> newRow = new ArrayList<>();
            newRow.add(1);
            for (int j = 1; j < row.size(); j++)
                newRow.add(row.get(j - 1) + row.get(j));
            newRow.add(1);
            row = newRow;
        }
        return row;
    }
}
