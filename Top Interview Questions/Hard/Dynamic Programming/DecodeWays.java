//Runtime: 1 ms (96.17%)
//Memory Usage: 37.5 MB
class DecodeWays_TIQ {
    public int numDecodings(String s) {
        if(s==null || s.length()==0) return 0;
        int[] dp = new int[s.length()+1];
        dp[0] = 1;
        dp[1] = s.charAt(0)=='0'?0:1;
        for(int i=2 ; i<=s.length() ; i++) {
            int first = Integer.valueOf(s.substring(i-1,i));
            int second = Integer.valueOf(s.substring(i-2,i));
            if(first>0) dp[i] = dp[i-1];
            if(second<=26 && 10<=second) dp[i] += dp[i-2];
        }
        return dp[dp.length-1];
    }
}