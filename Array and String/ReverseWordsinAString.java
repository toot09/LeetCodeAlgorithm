class ReverseWordsinAString {
    public String reverseWords(String s) {
        String[] tmp = s.split(" ");
        StringBuilder ret = new StringBuilder();
        for(int i = tmp.length-1 ; i>=0 ; i--) {
            if(!tmp[i].isEmpty()) {
                ret.append(tmp[i]+" ");
            }
        }
        return ret.length() == 0 ? "" : ret.substring(0,ret.length()-1);
    }
}

// Runtime: 6 ms
// Memory Usage: 41 MB
/*
class ReverseWordsinAString {
    public String reverseWords(String s) {
        if(s.length() == 0) return s;
        StringBuilder ret = new StringBuilder();
        StringBuilder tmp = new StringBuilder();
        for(int i = s.length() - 1 ; i >= 0 ; i--) {
            if(s.charAt(i) != ' ') {
                tmp.append(s.charAt(i));
            } else {
                if(tmp.length() > 0) {
                    help(ret, tmp);
                }
            }
        }
        if(tmp.length() > 0) {
            help(ret, tmp);
        }
        if(ret.length() > 0) {
            ret.delete(ret.length()-1 , ret.length());
        }
        return ret.toString();
    }
    public static void help (StringBuilder ret, StringBuilder tmp) {
        tmp.reverse().append(' ');
        ret.append(tmp);
        tmp.delete(0, tmp.length());
    }
    
}
*/