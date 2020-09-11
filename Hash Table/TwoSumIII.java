import java.util.*;

class TwoSumIII {
  
  Set<Integer> hs;

  /** Initialize your data structure here. */
  public TwoSumIII() {
      hs = new HashSet<>();
  }

  public void add(int number) {
      List<Integer> list = new ArrayList<>();
      Iterator<Integer> it = hs.iterator();
      while(it.hasNext()) {
         int num = it.next();
         list.add(num+number);
      }
      for(int i : list) {
        hs.add(i);
      }
  }

  /** Find if there exists any pair of numbers which sum is equal to the value **/
  public boolean find(int value) {
      return hs.contains(value);
  }

}