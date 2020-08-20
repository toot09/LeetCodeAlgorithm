import java.util.*;

class ZeroOneMatrix {
    public int[][] updateMatrix(int[][] matrix) {
        Queue<int[]> q = new LinkedList<>();
        for(int i=0 ; i<matrix.length ; i++) {
            for(int j=0 ; j<matrix[0].length ; j++) {
                if(matrix[i][j] == 0) {
                    q.offer(new int[]{i,j});
                } else {
                    matrix[i][j] = Integer.MAX_VALUE;
                }
            }
        }
        int[][] v = {{1,0},{-1,0},{0,1},{0,-1}};
        while(q.size() > 0) {
            int i = q.peek()[0];
            int j = q.peek()[1];
            q.poll();
            for(int[] tmp : v) {
                if(i+tmp[0] >= 0 && i+tmp[0] < matrix.length && j+tmp[1] >=0 && j+tmp[1] < matrix[0].length) {
					if(matrix[i][j]+1 < matrix[i+tmp[0]][j+tmp[1]]) {
						matrix[i+tmp[0]][j+tmp[1]] = matrix[i][j]+1;
						q.offer(new int[]{i+tmp[0],j+tmp[1]});
					}
                }
            }
        }
        return matrix;
    }
}