import java.util.*;

class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ret = new ArrayList<>();
      
        for(int i=0 ; i<numRows ; i++) {
            Integer[] tmp = new Integer[i+1];
            // 1 초기화
            tmp[0] = 1;
            tmp[i] = 1;
            // insert
            int j = 1;
            while(j<=i-1 && i>=2) {
              tmp[j]=(ret.get(i-1).get(j-1) + ret.get(i-1).get(j));
              j++;
            }
            ret.add(Arrays.asList(tmp));
        }
        return ret;
    }
}