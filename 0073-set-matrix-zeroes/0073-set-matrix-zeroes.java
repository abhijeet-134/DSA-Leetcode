class Solution {
    public void setZeroes(int[][] matrix) {
        List<int[]> positions = new ArrayList<>();

        int n = matrix.length;
        int m = matrix[0].length;

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(matrix[i][j] == 0) {
                    positions.add(new int[]{i, j});
                }
            }
        }

        for(int[] pos:positions) {
            int x = pos[0];
            int y = pos[1];

            for(int i=0; i<m; i++) {
                matrix[x][i] = 0;
            }

            for(int i=0; i<n; i++) {
                matrix[i][y] = 0;
            }
        }
    }
}