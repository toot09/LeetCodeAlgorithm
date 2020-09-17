class CountPrimes {
    public int countPrimes(int n) {
        boolean[] prime = new boolean[n];
        int ret = 0;
        for(int i=2 ; i<n ; i++) {
            if(!prime[i]) {
                ret++;
                for(int j=1; j*i<n ; j++) {
                    prime[i*j] = true;
                }
            }
        }
        return ret;
    }
}