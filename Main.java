import java.util.*;

class Main {
  
  public static void main(String[] args) {
    System.out.println("##### Start! #####");

    int[] nums = {1,1,1,2,2,3};
    int k = 2;
    for(int i : topKFrequent(nums,k)) {
      System.out.println(i);
    }

    System.out.println("##### Compile Complete #####");
  }

  public static int[] topKFrequent(int[] nums, int k) {
      PriorityQueue<Map.Entry<Integer, Integer>> q = new PriorityQueue<>();
      Map<Integer, Integer> hm = new HashMap<>();
      for(int num : nums) {
        hm.put(num,hm.getOrDefault(num,0)+1);
      }
      for(Map.Entry<Integer, Integer> e : hm.entrySet()) {
        q.offer(e);
        if(q.size()>k) {
          q.poll();
        }
      }
      int[] ret = new int[k];
      for(int i=0 ; i<k ; i++) {
        ret[i] = q.poll().getKey();
      }
      return ret;
  }

}


