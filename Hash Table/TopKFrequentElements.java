import java.util.*;

class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> hm = new HashMap<>();
      List<Integer>[] arr = new ArrayList[nums.length+1];
      int[] ret = new int[k];

      for(int num : nums) {
          hm.put(num,hm.getOrDefault(num,0)+1);
      }
      for(Map.Entry<Integer, Integer> e : hm.entrySet()) {
          if(arr[e.getValue()] == null) {
              arr[e.getValue()] = new ArrayList<Integer>();
          }
          arr[e.getValue()].add(e.getKey());
      }
      int len = 0;
      for(int i=arr.length-1 ; i>=0 ; i--) {
          if(arr[i] == null) continue;
          for(int j=0 ; j<arr[i].size() && len < k ; j++) {
              ret[len++] = arr[i].get(j);
          }
          if(len == k) break;
      }
      return ret;
    }
}