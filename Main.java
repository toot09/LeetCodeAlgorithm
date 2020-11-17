import java.util.*;

class Main {
  public static void main(String[] args) {

    //nums = [1,3,-1,-3,5,3,6,7], k = 3
    //for(int n : maxSlidingWindow(new int[]{1,-1},1)) {
    /*
    for(int n : maxSlidingWindow(new int[]{1,3,-1,-3,5,3,6,7},1)) {
      System.out.println(n);
    }
    */
    
    Deque<Integer> dq = new ArrayDeque<>();
    dq.addFirst(1);
    dq.addFirst(2);
    dq.addFirst(3);

    System.out.println(dq.pollFirst());
    System.out.println(dq.pollLast());
    System.out.println(dq.poll());

    System.out.println("##### Compile Complete #####"); 
	}

  public static int[] maxSlidingWindow(int[] nums, int k) {
      Map<Integer, Integer> hm = new HashMap<>();
      int[] ret = new int[nums.length-k+1];
      PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->{
        return b-a;
      });
      for(int i=0 ; i<k-1 ; i++) {
        pq.offer(nums[i]);
        hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
      }
      for(int i=0 ; i<=nums.length-k ; i++) {
          pq.offer(nums[i+k-1]);
          hm.put(nums[i+k-1],hm.getOrDefault(nums[i+k-1],0)+1);
          int max = pq.poll();

          System.out.println("max : "+max);
          System.out.println("hm.get(max) : "+hm.get(max));
          
          while(hm.get(max)==0) {
              max = pq.poll();
              hm.put(max,hm.get(max)-1);
          }
          ret[i] = max;
          if(nums[i]!=max) {
            pq.offer(max);
            hm.put(max,hm.get(max)+1);
          }
      }
      return ret;
  }

}