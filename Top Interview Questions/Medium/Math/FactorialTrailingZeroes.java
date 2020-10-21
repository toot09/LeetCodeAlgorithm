//Runtime: 0 ms
//Memory Usage: 35.7 MB
class FactorialTrailingZeroes_TIQ {
    public int trailingZeroes(int n) {
        int cnt = 0;
        while(n>0){
            cnt += n/5;
            n/=5;
        }
        return cnt;
    }
}