class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int max = -1;
        int index = 0;

        int m = mat.length;
        int n = mat[0].length;

        for (int i = 0; i < m; i++) {
            int countrow = 0;

            for (int j = 0; j < n; j++) {
                countrow += mat[i][j];
            }

            if (countrow > max) {
                max = countrow;
                index = i;
            }
        }

        return new int[]{index, max};
    }
}