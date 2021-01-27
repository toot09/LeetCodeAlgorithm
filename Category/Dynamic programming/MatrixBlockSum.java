// 1314. Matrix Block Sum
// Difficulty : Medium
// Comment : I think it is not good prob.
// url : https://leetcode.com/problems/matrix-block-sum/submissions/
class MatrixBlockSum_category {
    public int[][] matrixBlockSum(int[][] mat, int K) {
        int r=mat.length, l=mat[0].length;
        int[][] ret = new int[r][l];
        for(int i=0 ; i<r ; i++) {
            for(int j=1 ; j<l ; j++) {
                mat[i][j] += mat[i][j-1];
            }
        }
        for(int i=0 ; i<r ; i++) {
            for(int j=0 ; j<l ; j++) {
                for(int n=Math.max(i-K,0) ; n<r && n<=i+K ; n++) {
                    ret[i][j] += (j+K>=l?mat[n][l-1]:mat[n][j+K]) - (j-K-1<0?0:mat[n][j-K-1]);
                }
            }
        }
        return ret;
    }
}