// 1277. Count Square Submatrices with All Ones
// Difficulty : Medium
// Comment : Squeeze brain
// url : https://leetcode.com/problems/count-square-submatrices-with-all-ones/
class CountSquareSubmatricesWithAllOnes_category {
    public int countSquares(int[][] matrix) {
        int r=matrix.length, l=matrix[0].length, ret =0;
        for(int i=0 ; i<r ; i++) {
            for(int j=0 ; j<l ; j++) {
                if(i>0 && j>0 && matrix[i][j]>0 && matrix[i-1][j-1]>0 && matrix[i-1][j]>0 && matrix[i][j-1]>0) {
                    matrix[i][j] = Math.min(matrix[i-1][j-1], Math.min(matrix[i-1][j], matrix[i][j-1]))+1;
                }
                ret+=matrix[i][j];
            }
        }
        return ret;
    }
}