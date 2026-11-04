class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] mat=new int[m][n];
        for(int[] index:indices) {
            int r=index[0];
            int c=index[1];
            for(int j=0;j<n;j++) {
                mat[r][j]++;
            }
            for(int i=0;i<m;i++) {
                mat[i][c]++;
            }
        }
        int cnt=0;
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                if(mat[i][j]%2!=0) cnt++;
            }
        }
        return cnt;
    }
}