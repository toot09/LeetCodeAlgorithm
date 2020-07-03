
class Main {
  public static void main(String[] args) {
  
    int[] A = {1,1,4,2,1,3};
    System.out.print(heightChecker(A));
    
    
  }

   private static int heightChecker(int[] heights) {
        int[] arr = new int[heights.length];
        arr = heights;
        sortArray(arr,0,heights.length-1);
        return result(heights,arr);
    }
    private static void sortArray(int[] A,int start, int end) {
        if(start == end) {
            return;
        }
        int min_index = start;
        for(int i=start+1;i<=end;i++) {
            if(A[i]<A[min_index]) {
                min_index = i;
            }
        }
        swap(A,min_index,start);
        sortArray(A, start+1, end);
    }
    private static void swap(int[] A, int min_index, int start) {
        int tmp = A[min_index];
        A[min_index] = A[start];
        A[start] = tmp;
    }
    private static int result(int[] A, int[] B) {
        int cnt = 0;
        for(int i=0;i<A.length;i++) {
          System.out.println("@@ : "+A[i]);
          System.out.println("## : "+B[i]);
            if(A[i]!=B[i]) {
                cnt++;
            }
        }
        return cnt;
    }

}