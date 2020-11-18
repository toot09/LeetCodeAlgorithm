import java.util.*;

class SlidingWindowMaximum_TIQ {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length==0 || k==0) return new int[0];
        int[] ret = new int[nums.length-k+1];
        Deque<Integer> dq = new ArrayDeque<>();
        for(int i=0 ; i<nums.length ; i++) {
            while(!dq.isEmpty() && nums[dq.peekLast()]<nums[i]) {
                dq.pollLast();
            }
            dq.offerLast(i);
            while(!dq.isEmpty() && dq.peekFirst() < i-k+1) {
                dq.pollFirst();
            }
            if(i+1 >= k) {
                ret[i-k+1] = nums[dq.peekFirst()];
            }
        }
        return ret;
    }
}