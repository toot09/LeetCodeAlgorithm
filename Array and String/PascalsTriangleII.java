import java.util.*;

class PascalsTriangleII {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ret = new ArrayList<>();
        for(int i=0 ; i<= rowIndex ; i++) {
            ret.add(1);
            if(i>1) {
                int tmp1 = ret.get(0);
                int tmp2 = ret.get(1);
                for(int j=1 ; j<i ; j++) {
                    ret.set(j,tmp1+tmp2);
                    tmp1 = tmp2;
                    tmp2 = ret.get(j+1);
                }
            }
        }
        return ret;
    }
}