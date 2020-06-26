class SquaresofaSortedArray {
    public int[] sortedSquares(int[] A) {
        squared(A);
        //sortSelect(A,0,A.length-1);
        sortBubble(A,0,A.length-1);
        return A;
    }
    
  private static void squared(int[] A) {
    for(int i = 0 ; i < A.length ; i++){
      A[i] = A[i]*A[i];
    }
  }

  private static void swap(int[] A, int start, int min_index) {
    int tmp = A[start];
    A[start] = A[min_index];
    A[min_index] = tmp;
  }

  private static void sortSelect (int[] A, int start, int end){
    if(start==end) {
      return;
    }
    int min_index = start;
    for(int i = start+1 ; i<=end ; i++){
      if(A[i] < A[min_index]) {
        min_index = i;
      }
    }
    swap(A,start,min_index);
    sortSelect(A,start+1,end);
  }

  private static void sortBubble(int[] A, int start, int end){
    if(start==end) {
      return;
    }
    for(int i = start ; i < end ; i++) {
      if(A[i]>A[i+1]) {
        swap(A,i,i+1);
      }
    }
    sortBubble(A,start,end-1);
  }
}