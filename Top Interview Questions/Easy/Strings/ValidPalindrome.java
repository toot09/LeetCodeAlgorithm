//Runtime: 2 ms (97.77%)
//Memory Usage: 39.7 MB (63.44%)
class ValidPalindrome {
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length()-1;
        while(start<=end) {
            char sc = s.charAt(start);
            char ec = s.charAt(end);
            if(!Character.isLetterOrDigit(sc)) {
                start++;
                continue;
            }
            if(!Character.isLetterOrDigit(ec)) {
                end--;
                continue;
            }
            sc = Character.toLowerCase(sc);
            ec = Character.toLowerCase(ec);
            if(sc!=ec) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}

//Runtime: 2 ms (97.77%)
//Memory Usage: 40.3 MB (39.79%)
/*
class ValidPalindrome {
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length()-1;

        while(start<end) {
            char sc = s.charAt(start);
            char ec = s.charAt(end);
            if(!('a' <= sc && sc <= 'z') && !('A' <= sc && sc <= 'Z') && !('0' <= sc && sc <= '9')) {
                start++;
                continue;
            }
            if(!('a' <= ec && ec <= 'z') && !('A' <= ec && ec <= 'Z') && !('0' <= ec && ec <= '9')) {
                end--;
                continue;
            }
            int si = 0;
            int ei = 0;
            if('a'<=sc && sc<='z') {
                si = sc-'a';
            } else if ('A'<=sc && sc<='Z'){
                si = sc-'A';
            } else {
                si = sc-'0'+26;
            }
            if('a'<=ec && ec<='z') {
                ei = ec-'a';
            } else if('A'<=ec && ec<='Z') {
                ei = ec-'A';
            } else {
                ei = ec-'0'+26;
            }
            if(si!=ei) {
              return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
*/