//Clockwise
class RotateImage {
    public void rotate(int[][] matrix) {
        int len = matrix.length;
        for(int i=0 ; i<len ; i++) {
            for(int j=i+1 ; j<len ; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }
        for(int i=0 ; i<len ; i++) {
            for(int j=0 ; j<len/2 ; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[i][len-1-j];
                matrix[i][len-1-j] = tmp;
            }
        }
    }
}

//CounterClockwise
/*
class RotateImage {
    public void rotate(int[][] matrix) {
        int len = matrix.length;
        for(int i=0 ; i<len ; i++) {
            for(int j=0 ; j<len-i ; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[len-1-j][len-1-i];
                matrix[len-1-j][len-1-i] = tmp;
            }
        }
        for(int i=0 ; i<len ; i++) {
            for(int j=0 ; j<len/2 ; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[i][len-1-j];
                matrix[i][len-1-j] = tmp;
            }
        }
    }
}
*/