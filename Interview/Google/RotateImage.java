// 48. Rotate Image
// Diffculty : Medium
// Comment : I remembered how to solve it!
// url : https://leetcode.com/problems/rotate-image/

class RotateImageGoogle {
    public void rotate(int[][] matrix) {
        int len = matrix.length;
        for(int i=0 ; i<len ; i++) {
            for(int j=0 ; j<len/2 ; j++) {
                swap(matrix, i, j, i, len-j-1);
            }
        }
        for(int i=0 ; i<len-1 ; i++) {
            for(int j=0 ; j<len-i-1 ; j++) {
                swap(matrix, i, j, len-1-j, len-1-i);
            }
        }
    }
    public void swap(int[][] matrix, int i1, int j1, int i2, int j2) {
        int tmp = matrix[i1][j1];
        matrix[i1][j1] = matrix[i2][j2];
        matrix[i2][j2] = tmp;
    }
}