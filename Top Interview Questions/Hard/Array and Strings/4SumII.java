import java.util.*;
class FourSumII_TIQ {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        Map<Integer, Integer> hm = new HashMap<>();
        int ret = 0;
        for(int i=0 ; i<A.length ; i++) {
            for(int j=0 ; j<B.length ; j++) {
                int sum = A[i]+B[j];
                hm.put(sum, hm.getOrDefault(sum,0)+1);
            }
        }
        for(int i=0 ; i<C.length ; i++) {
            for(int j=0 ; j<D.length ; j++) {
                int sum = C[i] + D[j];
                ret += hm.getOrDefault(sum*-1,0);
            }
        }
        return ret;
    }
}

//Time Execeed Limit
/*
class 4SumII_TIQ {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        return fourSumCountDFS(A,0,B,0,C,0,D,0);
    }
    private Set<String> fourSumCountHS = new HashSet<>();

    public int fourSumCountDFS(int[] A, int idxA, int[] B, int idxB, int[] C, int idxC, int[] D, int idxD) {
        int ret = 0;
        if(idxA < 0 || idxB < 0 || idxC < 0 || idxD < 0 || idxA >= A.length || idxB >= B.length || idxC >= C.length
        || idxD >= D.length) {
            return ret;
        }
        if(fourSumCountHS.contains("" + idxA + idxB + idxC + idxD)) {
            return ret;
        } else {
            fourSumCountHS.add("" + idxA + idxB + idxC + idxD);
        }
        if(A[idxA] + B[idxB] + C[idxC] + D[idxD] == 0) {
            ret++;
        }

        ret += fourSumCountDFS(A, idxA + 1, B, idxB, C, idxC, D, idxD);
        ret += fourSumCountDFS(A, idxA - 1, B, idxB, C, idxC, D, idxD);
        ret += fourSumCountDFS(A, idxA, B, idxB + 1, C, idxC, D, idxD);
        ret += fourSumCountDFS(A, idxA, B, idxB - 1, C, idxC, D, idxD);
        ret += fourSumCountDFS(A, idxA, B, idxB, C, idxC + 1, D, idxD);
        ret += fourSumCountDFS(A, idxA, B, idxB, C, idxC - 1, D, idxD);
        ret += fourSumCountDFS(A, idxA, B, idxB, C, idxC, D, idxD + 1);
        ret += fourSumCountDFS(A, idxA, B, idxB, C, idxC, D, idxD - 1);
        return ret;
    }
}
*/