import java.util.*;
//Runtime: 7 ms (23.48%)
//Memory Usage: 39 MB
class LongestConsecutiveSequence_TIQ {
    public int longestConsecutive(int[] nums) {
        if(nums.length<=1) return nums.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->{
            return a-b;
        });
        for(int num : nums) pq.offer(num);
        int ret=1, tmp=1, bef=pq.poll();
        while(!pq.isEmpty()) {
            int n = pq.poll();
            if(n==bef) {
                continue;
            } else if(n == bef+1) {
                tmp++;
            } else {
                tmp = 1;
            }
            bef = n;
            ret = Math.max(ret,tmp);
        }
        return ret;
    }
}
/*
class LongestConsecutiveSequence_TIQ {
    public int longestConsecutive(int[] nums) {
        Set<Integer> hs = new HashSet<>();
        for(int num : nums) {
            hs.add(num);
        }
        int ret = 0;
        for(int num : nums) {
            int len = 1;
            int tmp = num;
            while(hs.contains(tmp+1)) {
                len += 1;
                tmp += 1;
            }
            ret = Math.max(ret,len);
        }
        return ret;
    }
}
*/