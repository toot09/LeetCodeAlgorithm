//Runtime: 1 ms
//Memory Usage: 42.4 MB
class TwoSumII { //Two Sum II - Input array is sorted
    public int[] twoSum(int[] numbers, int target) {
        int[] ret = new int[2];
        int start = 0;
        int end = numbers.length-1;
        while(start < end) {
            if(numbers[start]+numbers[end]==target) {
                ret[0] = ++start;
                ret[1] = ++end;
                break;
            } else if(numbers[start]+numbers[end]<target) {
                start++;
            } else {
                end--;
            }
        }
        return ret;
    }
}

//Runtime: 1 ms
//Memory Usage: 42.1 MB
/*
class TwoSumII {
    public int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length-1;
        while(numbers[start]+numbers[end]!=target) {
            if(numbers[start]+numbers[end]<target) {
                start++;
            } else {
                end--;
            }
        }
        return new int[]{++start,++end};
    }
}
*/