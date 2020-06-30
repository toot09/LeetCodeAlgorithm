class CheckIfNandItsDoubleExist {
    public boolean checkIfExist(int[] arr) {
        return chkDouble(arr,0,arr.length-1);
    }
    
    private static boolean chkDouble(int[] arr,int index,int end) {
        if(index > end){
            return false;
        }
        for(int i=0 ; i<=end ; i++){
            if(i!=index && arr[index]*2 == arr[i]) {
                return true;
            }
        }
        return chkDouble(arr, index+1, end);
    }
    
}