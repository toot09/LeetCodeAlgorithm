//Runtime: 2 ms
//Memory Usage: 45.5 MB
class NumberOfIslands {
    public int numIslands(char[][] grid) {
        if(grid.length == 0) return 0;
        int ret = 0;;
        for(int i=0 ; i<grid.length ; i++) {
            for(int j=0 ; j<grid[0].length ; j++) {
                if(grid[i][j] == '1') {
                    DFS(grid,i,j);
                    ret++;
                }
            }
        }
        return ret;
    }
    public void DFS(char[][] grid, int i, int j){
        if(i<0 || i>= grid.length || j<0 || j>= grid[0].length || grid[i][j] == '0') {
            return;
        }
        grid[i][j] = '0';
        DFS(grid,i+1,j);
        DFS(grid,i-1,j);
        DFS(grid,i,j+1);
        DFS(grid,i,j-1);
    }
}

//Runtime: 11 ms
//Memory Usage: 45.9 MB
/*
class NumberOfIslands {
    public int numIslands(char[][] grid) {
        if(grid.length == 0) return 0;
        int ret = 0;
        Queue<int[]> q = new LinkedList<>();
        for(int i=0 ; i<grid.length ; i++) {
            for(int j=0 ; j<grid[0].length ; j++) {
                if(grid[i][j] == '1') {
                    q.offer(new int[]{i,j});
                    grid[i][j] = '3';
                    while(q.size()>0) {
                        int x = q.peek()[0];
                        int y = q.peek()[1];
                        q.poll();
                        if(x+1 < grid.length && grid[x+1][y] == '1') {
                            q.offer(new int[]{x+1,y});
                            grid[x+1][y] = '3';
                        }
                        if(x-1 >= 0 && grid[x-1][y] == '1') {
                            q.offer(new int[]{x-1,y});
                            grid[x-1][y] = '3';
                        }
                        if(y+1 < grid[0].length && grid[x][y+1] == '1') {
                            q.offer(new int[]{x,y+1});
                            grid[x][y+1] = '3';
                        }
                        if(y-1 >= 0 && grid[x][y-1] == '1') {
                            q.offer(new int[]{x,y-1});
                            grid[x][y-1] = '3';
                        }
                    }
                ret++;
                }
            }
        }
        return ret;
    }
}
*/