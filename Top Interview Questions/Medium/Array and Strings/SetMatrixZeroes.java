import java.util.*;

//Runtime: 1 ms (97.51%)
//Memory Usage: 40.3 MB (93.61%)
class SetMatrixZeroes {
    public void setZeroes(int[][] matrix) {
        Set<Integer> hs = new HashSet<>();
        int[] zeros = new int[matrix[0].length];
        for(int i=0 ; i<matrix.length ; i++) {
            boolean ynZero = false;
            for(int j=0 ; j<matrix[0].length ; j++) {
                if(matrix[i][j]==0) {
                    hs.add(j);
                    ynZero = true;
                }
            }
            if(ynZero) matrix[i] = zeros;
        }
        for(int i=0 ; i<matrix.length ; i++) {
            if(matrix[i]!=zeros) {
                for(int j=0 ; j<matrix[0].length ; j++) {
                    if(hs.contains(j)) matrix[i][j] = 0;
                }
            }
        }
    }
}

//Runtime: 1 ms (97.51%)
//Memory Usage: 40.3 MB (99.63%)
/*
class SetMatrixZeroes {
    public void setZeroes(int[][] matrix) {
        int[] zero = new int[matrix[0].length];
        int[] chk = new int[matrix[0].length];
        for(int i=0 ; i<matrix.length ; i++) {
            boolean ynZero = false;
            for(int j=0 ; j<matrix[0].length ; j++) {
                if(matrix[i][j] == 0) {
                    chk[j] = 1;
                    ynZero = true;
                }
            }
            if(ynZero) matrix[i] = zero;
        }
        for(int i=0 ; i<matrix.length ; i++) {
            for(int j=0 ; j<matrix[0].length ; j++) {
                if(chk[j]==1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
*/