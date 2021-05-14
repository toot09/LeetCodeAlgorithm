class PeakIndexInAMountainArray {
    public int peakIndexInMountainArray(int[] arr) {
        int s=0, e=arr.length-1;
        while(s<e) {
            int mid=s+(e-s)/2;
            if(arr[mid-1]<arr[mid] && arr[mid]>arr[mid+1]) {
                return mid;
            } else if(arr[mid-1]>arr[mid]){
                e = mid;
            } else {
                s = mid;
            }
        }
        return arr[s]>arr[e]?s:e;
    }
}