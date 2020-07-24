class DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] matrix) {
        int M = matrix.length;
        if(M==0) {
            return new int[0];
        }
        int N = matrix[0].length;
        int[] ret = new int[M*N];
        int sum = 0;
        int insert = 0;
        while(sum <= M + N - 2) {
            if(sum%2==0) {
                //Go UP
                int i = Math.min(sum,M-1);
                int j = sum - i;
                while(i >= 0 && i < M && j >= 0 && j < N) {
                    ret[insert++] = matrix[i--][j++];
                }
            } else {
                //Go Down
                int j = Math.min(sum,N-1);
                int i = sum - j;
                while(i >= 0 && i < M && j >= 0 && j < N) {
                    ret[insert++] = matrix[i++][j--];
                }
            }
            sum++;
        }
        return ret;
    }
}