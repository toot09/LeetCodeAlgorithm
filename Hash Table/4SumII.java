import java.util.*;
//Runtime: 66 ms (73.17%)
//Memory Usage: 58.4 MB (86.23%)
class FourSumII {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        Map<Integer, Integer> hmAB = new HashMap<>();
        //Map<Integer, Integer> hmCD = new HashMap<>();
        int ret = 0;
        for(int i=0 ; i<A.length ; i++) {
            for(int j=0 ; j<B.length ; j++) {
                hmAB.put(A[i]+B[j], hmAB.getOrDefault(A[i]+B[j],0)+1);
            }
        }
        for(int i=0 ; i<C.length ; i++) {
            for(int j=0 ; j<D.length ; j++) {
                //hmAB.put(C[i]+D[j], hm.getOrDefault(A[i]+B[j],0)+1);
                int key = (C[i]+D[j])*-1;
                ret += hmAB.getOrDefault(key,0);
            }
        }
        return ret;
    }
}