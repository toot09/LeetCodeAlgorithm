// 167. Two Sum II - Input array is sorted
// Difficulty : Easy
// Comment : Easy but can't think about more efficient method
// url : https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

class TwoSumII_binarySearch {
    public int[] twoSum(int[] numbers, int target) {
        int[] ret = new int[2];
        int s=0, e=numbers.length-1;
        while(s<e) {
            int sum = numbers[s]+numbers[e];
            if(sum==target) {
                ret[0] = s+1;
                ret[1] = e+1;
                break;
            } else if(sum<target) {
                s++;
            } else {
                e--;
            }
        }
        return ret;
    }
}
/*
class TwoSumII {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> hm = new HashMap<>();
        int[] ret = new int[2];
        for(int i=0 ; i<numbers.length ; i++) {
            if(hm.containsKey(target-numbers[i])) {
                ret[0] = hm.get(target-numbers[i])+1;
                ret[1] = i+1;
                break;
            }
            hm.put(numbers[i],i);
        }
        return ret;
    }
}
*/