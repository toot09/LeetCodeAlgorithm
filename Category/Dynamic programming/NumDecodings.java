// Basic of dp
// make +1 length array. and Thinking about making zero index data is kick in my opinion.
class NumDecodings_category {
  public int numDecodings(String s) {
    if(s.length() == 0 || s == null) return 0;
    int[] dp = new int[s.length() + 1];
    dp[0] = 1;
    dp[1] = s.charAt(0) == '0' ? 0 : 1;
    for(int i = 2; i <= s.length(); i++) {
      int one = Integer.valueOf(s.substring(i - 1, i));
      int two = Integer.valueOf(s.substring(i - 2, i));
      if(0 < one && one < 10) {
        dp[i] += dp[i - 1];
      }
      if(10 <= two && two <= 26) {
        dp[i] += dp[i - 2];
      }
    }
    return dp[dp.length - 1];
  }
}