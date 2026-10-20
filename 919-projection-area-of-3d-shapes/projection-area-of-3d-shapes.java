class Solution {
    public int projectionArea(int[][] grid) {
        int n = grid.length;
        int top = 0;
        int front = 0;
        int side = 0;
        for (int i = 0; i < n; i++) {
            int sum=0;
            int max = 0;
            for (int j = 0; j < n; j++) {
                if (grid[i][j] > 0)
                    top++;
                max=Math.max(max,grid[i][j]);
                sum=Math.max(sum,grid[j][i]); 
            }
            side+=max;
            front+=sum;
        }
        return top+side+front;
    }
}