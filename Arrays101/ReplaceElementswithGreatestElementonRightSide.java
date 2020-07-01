class ReplaceElementswithGreatestElementonRightSide {
    public int[] replaceElements(int[] arr) {
        int max = arr[arr.length-1];
        arr[arr.length-1] = -1;
        for(int i=arr.length-2; i>=0 ; i--) {
            int tmp = arr[i];
            arr[i] = max;
            if(tmp>max) max = tmp;
        }
        return arr;
    }
}


/** O(n**) 로 비효율적인 코딩
 ** 거꾸로 진행하면 O(n)으로 가능하다.
class ReplaceElementswithGreatestElementonRightSide {
    public int[] replaceElements(int[] arr) {
        for(int i=1 ; i<arr.length ; i++) {
            arr[i-1] = executeRight(arr,i);
        }
        arr[arr.length-1] = -1;
        return arr;
    }
    
    private static int executeRight(int[] arr, int start) {
        int max_index = start;
        for(int i=start+1 ; i<arr.length ; i++) {
            if(arr[i]>arr[max_index]) {
                max_index = i;
            }
        }
        return arr[max_index];
    }
}
*/