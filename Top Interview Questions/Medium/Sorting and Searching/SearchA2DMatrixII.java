class SearchA2DMatrixII_TIQ {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0) return false;
        int r = 0;
        int c = matrix[0].length-1;
        while(c>=0 && r<matrix.length) {
            if(matrix[r][c] == target) {
                return true;
            } else if(matrix[r][c] > target) {
                c--;
            } else {
                r++;
            }
        }
        return false;
    }
}