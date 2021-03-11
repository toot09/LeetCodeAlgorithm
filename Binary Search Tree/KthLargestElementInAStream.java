// Difficulty : Easy
// Comment : Easy after you see the Answer :)
// url : https://leetcode.com/problems/kth-largest-element-in-a-stream/
import java.util.*;
class KthLargestElementInAStream {
    
    private PriorityQueue<Integer> q;
    private int k;
    
    public KthLargestElementInAStream(int k, int[] nums) {
        q = new PriorityQueue<>();
        this.k = k;
        for(int num : nums) add(num);
    }
    
    public int add(int val) {
        if(q.size()<k) {
            q.offer(val);
        } else if(q.peek()<val) {
            q.poll();
            q.offer(val);
        }
        return q.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
