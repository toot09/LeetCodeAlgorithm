
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