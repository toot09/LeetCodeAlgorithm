// 1139. Largest 1-Bordered Square
// Difficulty : Medium
// Comment : Squeeze Brain!!!
// url : https://leetcode.com/problems/largest-1-bordered-square/
import java.util.*;
class Largest1BorderedSquare_category {
    public int largest1BorderedSquare(int[][] grid) {
        int r=grid.length, l=grid[0].length, ret=0;
        int[][] v = new int[r][l], h = new int[r][l];
        
        for(int i=0 ; i<r ; i++) {
            for(int j=0 ; j<l ; j++) {
                if(grid[i][j]>0) {
                    v[i][j] = (i-1<0?0:v[i-1][j])+1;
                    h[i][j] = (j-1<0?0:h[i][j-1])+1;
                }
            }
        }
        
        for(int d=Math.min(r,l) ; d>=1 ; d--) {
            for(int i=0 ; i<r-d+1 ; i++) {
                for(int j=0 ; j<l-d+1 ; j++) {
                    if(v[i+d-1][j]>=d && v[i+d-1][j+d-1]>=d && h[i][j+d-1]>=d && h[i+d-1][j+d-1]>=d) {
                        ret = Math.max(ret, d*d);
                    }
                }
            }
            if(ret>0) break;
        }
        return ret;
    }
}