class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
      for(int i=0;i<n;i++){
          nums1[i+m] = nums2[i];
        }
        //sortSelect(nums1,0,m+n-1);
        sortBubble(nums1,0,m+n-1);
    }
    
    private static void sortBubble(int[] arr, int start, int end){
    if(start==end){
      return;
    }
    for(int i=0; i<end ; i++){
      if(arr[i]>arr[i+1]){
        swap(arr,i,i+1);
      }
    }
    sortBubble(arr,0,end-1);
  }
    
    private static void sortSelect(int[] arr,int start,int end){
        if(start == end){
          return;
        }
        int min_index = start;
        for(int i=start+1 ; i<=end ; i++){
          if(arr[i] < arr[min_index]){
            min_index = i;
          }
        }
        swap(arr,start,min_index);
        sortSelect(arr, start+1, end);
      }

  private static void swap(int[] arr, int a, int b){
    int tmp = arr[a];
    arr[a] = arr[b];
    arr[b] = tmp;
  }
}