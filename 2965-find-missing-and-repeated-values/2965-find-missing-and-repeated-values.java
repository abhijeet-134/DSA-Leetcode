class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int repeating = -1;
        int missing = -1;

        for(int i=1; i<=n*n; i++) {
            int count = 0;
            for(int row=0; row<n; row++) {
                for(int cols=0; cols<n; cols++) {
                    if(grid[row][cols] == i) {
                        count++;
                    }
                }
            }
            if(count == 2) {
                repeating = i;
            }
            if(count == 0) {
                missing = i;
            }
        }
        return new int[]{repeating, missing};
    }
}