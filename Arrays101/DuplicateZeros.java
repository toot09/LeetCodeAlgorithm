class DuplicateZeros {
    public void duplicateZeros(int[] arr) {
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i]==0) {
                move(arr,i,arr.length);
                i++;
            }
        }
    }
    
    private static void move(int[] arr, int idx, int len){
        for(int i = len-2 ; idx<=i ; i--){
            arr[i+1] = arr[i];
        }
        arr[idx] = 0;
    }
    
}