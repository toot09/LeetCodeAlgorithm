class SquaresofaSortedArray {
    public int[] sortedSquares(int[] A) {
        
        int len = A.length;
        int[] B = new int[len];

        for(int i=0;i<len;i++){
            int x = A[i]*A[i];
            if(i==0){
                B[0] = x;
            } else {
                for(int k=0;k<i;k++){
                  boolean chk = true;
                    if(x<B[k]) {
                        for(int j=len-2;j>=k;j--){
                            B[j+1] = B[j];
                        }
                        B[k] = x;
                        chk = false;
                        break;
                    }
                  if(chk){
                    B[i] = x;
                  }
                }
            }
        }
        
        return B;
    }
}