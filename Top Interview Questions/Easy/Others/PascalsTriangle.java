import java.util.*;
//Runtime: 0 ms (100%)
//Memory Usage: 37.2 MB (55.51%)
class PascalsTriangle_TIQ {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ret = new ArrayList<>();
        if(numRows==0) return ret;
        ret.add(new ArrayList<Integer>());
        ret.get(0).add(1);
        for(int i=1 ; i<numRows ; i++) {
            ret.add(new ArrayList<Integer>());
            ret.get(i).add(1);
            List<Integer> pre = ret.get(i-1);
            for(int j=1 ; j<pre.size() ; j++) {
                ret.get(i).add(pre.get(j-1)+pre.get(j));
            }
            ret.get(i).add(1);
        }
        return ret;
    }
}

//Runtime: 0 ms (100%)
//Memory Usage: 36.8 MB (95.39%)
/*
class PascalsTriangle_TIQ {
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
*/