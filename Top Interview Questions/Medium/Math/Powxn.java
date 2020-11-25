class Powxn_TIQ {
    public double myPow(double x, int n) {
		if(n == Integer.MIN_VALUE && x > 1) return 0;
        if(n==0) return 1;
        if(n<0) {
            n*=-1;
            x=1/x;
        }
        // Key : x*myPow is real return data
        // The "n=1" case is definitely at the end
        return n%2==0?myPow(x*x,n/2):x*myPow(x*x,n/2);
    }
}