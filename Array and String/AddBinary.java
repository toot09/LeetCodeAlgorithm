class AddBinary {
    public String addBinary(String a, String b) {
        int olim = 0;
        char[] ret = new char[Math.max(a.length(),b.length())];
        for(int i=0 ; i<=Math.max(a.length()-1,b.length()-1) ; i++) {
          int aInt = 0;
          int bInt = 0;
          if(a.length()-1-i >= 0) {
            aInt = a.charAt(a.length()-1-i) - '0';
          }
          if(b.length()-1-i >= 0) {
            bInt = b.charAt(b.length()-1-i) - '0';
          }
          ret[Math.max(a.length()-1,b.length()-1)-i] = (char)(((aInt+bInt+olim)%2)+'0');
          olim = (aInt+bInt+olim)/2;
        }
        String retString = new String(ret);
        if(olim == 1) {
          retString = "1"+retString;
        }
        return retString;
    }
}