class NumberofIslands_2 {
    public int numIslands(char[][] grid) {
        int ret = 0;
        for(int i=0 ; i<grid.length ; i++) {
            for(int j=0 ; j<grid[0].length ; j++) {
                if(DFS(grid, i ,j)) {
                    ret++;
                }
            }
        }
        return ret;
    }
    
    public boolean DFS(char[][] grid, int i, int j) {
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j]=='0' || grid[i][j] == '2') {
            return false;
        }
        grid[i][j] = '2';
        DFS(grid,i+1,j);
        DFS(grid,i,j+1);
        DFS(grid,i-1,j);
        DFS(grid,i,j-1);
        return true;
    }
    
}