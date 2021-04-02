// 200. Number of Islands
// Difficulty : Medium
// Comment : Good Prob. Remembered how to solve it.
// url : https://leetcode.com/problems/number-of-islands/



class NumberOfIslandsGoogle {
    public int numIslands(char[][] grid) {
        int island = 0;
        for(int i=0 ; i<grid.length ; i++) {
            for(int j=0 ; j<grid[0].length ; j++) {
                if(helper(grid, i, j)>0) island++;
            }
        }
        return island;
    }
    public int helper(char[][] grid, int i, int j) {
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j]=='0') return 0;
        grid[i][j] = '0';
        int area = 1;
        area += helper(grid, i+1, j);
        area += helper(grid, i, j+1);
        area += helper(grid, i-1, j);
        area += helper(grid, i, j-1);
        return area;
    }
}