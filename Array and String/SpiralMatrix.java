import java.util.*;
class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ret = new ArrayList<>();
        if(matrix.length == 0) return ret;
        int[] map = {0,0,matrix.length-1,matrix[0].length-1};
        int dir = 0;
        int i = 0;
        int j = -1;
        int cnt = 1;
        
        while(map[0] <= map[2] && map[1] <= map[3]) {
            if(dir%4 == 0) {
                //Go Right
                if(j >= map[3]) {
                    dir++;
                    map[0]++;
                    i++;
                } else {
                  j++;
                }
            } else if(dir%4 == 1) {
                //Go Down
                if(i >= map[2]) {
                    dir++;
                    map[3]--;
                    j--;
                } else {
                  i++;
                }
            } else if(dir%4 == 2) {
                //Go Left
                if(j <= map[1]) {
                    dir++;
                    map[2]--;
                    i--;
                } else {
                  j--;
                }
            } else {
                //Go Up
                if(i <= map[0]) {
                    dir++;
                    map[1]++;
                    j++;
                } else {
                  i--;
                }
            }
            ret.add(matrix[i][j]);
        }
        return ret;
    }
}