class HeightChecker {
    public int heightChecker(int[] heights) {
        int[] arr = new int[heights.length];
        // 다 입력해준다.
        // arr = heigth 하면 주소값을 입력하기 때문에 같은 array
        for(int i=0 ; i<arr.length ; i++) {
            arr[i] = heights[i];
        }
        sortArray(arr,0,arr.length-1);
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
    private int result(int[] A, int[] B) {
        int cnt = 0;
        for(int i=0;i<A.length;i++) {
            if(A[i]!=B[i]) {
                cnt++;
            }
        }
        return cnt;
    }
}