class StringToInteger {
    public int myAtoi(String str) {
        int idx = 0;
        int sign = 1;
        int ret = 0;
        if(str.length() == 0) return 0;
        while(idx < str.length() && str.charAt(idx) == ' ') {
            idx++;
            if(idx == str.length()) return ret;
        }
        
        if(str.charAt(idx) == '-' || str.charAt(idx) == '+') {
            if(str.charAt(idx) == '-') sign *= -1;
            idx++;
        }
        while(idx < str.length() && Character.isDigit(str.charAt(idx))) { 
            int tmp = ret;
            ret *= 10;
            ret += str.charAt(idx)-'0';
            if(ret/10 != tmp) {
              if(sign<0) {
                return Integer.MIN_VALUE;
              } else {
                return Integer.MAX_VALUE;
              }
            }
            idx++;
        }
        return (ret*sign);
    }
}