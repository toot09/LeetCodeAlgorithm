class Solution {
    public int[] dailyTemperatures(int[] T) {
        int[] ret = new int[T.length];
        int[] tmp = new int[T.length];
        int idx = -1;
        for(int i=0 ; i<T.length ; i++) {
            while(idx >= 0 && T[i] > T[tmp[idx]]) {
                ret[tmp[idx]] = i - tmp[idx];
                idx--;
            }
            tmp[++idx] = i;
        }
        return ret;
    }
}
/*
class DailyTemperatures {
    public int[] dailyTemperatures(int[] T) {
        if(T.length == 0) return null;
        for(int i=0 ; i<T.length ; i++) {
            for(int j=i+1 ; j<T.length ; j++) {
                if(T[j]>T[i]) {
                    T[i] = -1*(j-i);
                    break;
                }
            }
            T[i] = Math.min(T[i],0);
            T[i] *= -1;
        }
        return T;
    }
}
*/