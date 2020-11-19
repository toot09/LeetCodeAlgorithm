//Runtime: 0 ms (100%)
//Memory Usage: 35.9 MB
class uniquePaths_TIQ {
    public int uniquePaths_TIQ(int m, int n) {
        int[][] map = new int[m][n];
        for(int i=0 ; i<m ; i++) {
            for(int j=0 ; j<n ; j++) {
                if(i==0 || j==0) map[i][j] = 1;
                else map[i][j] = map[i-1][j] + map[i][j-1];
            }
        }
        return map[m-1][n-1];
    }
}