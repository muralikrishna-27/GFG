class Solution {
    public void setMatrixZeroes(int[][] matrix) {
        // code here
        int row = matrix.length, col = matrix[0].length;
        boolean[] r = new boolean[row], c = new boolean[col];
        for (int i = 0; i < row; i++)
            for (int j = 0; j < col; j++)
                if (matrix[i][j] == 0) {
                    r[i] = true; c[j] = true;
                }
        for (int i = 0; i < row; i++)
            for (int j = 0; j < col; j++)
                if (r[i] || c[j]) matrix[i][j] = 0;
    }
}