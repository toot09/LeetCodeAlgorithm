import java.util.*;
//Runtime: 1 ms
//Memory Usage: 38 MB
class JewelsAndStones {
    public int numJewelsInStones(String J, String S) {
        Set<Character> hs = new HashSet<>();
        int ret = 0;
        for(char c : J.toCharArray()) {
            hs.add(c);
        }
        for(int i=0 ; i<S.length() ; i++) {
            if(hs.contains(S.charAt(i))) {
                ret++;
            }
        }
        return ret;
    }
}
/*
//Runtime: 6 ms
//Memory Usage: 39.8 MB
class JewelsAndStones {
    public int numJewelsInStones(String J, String S) {
        Set<String> hs = new HashSet<>();
        int ret = 0;
        for(String s : J.split("")) {
            if(!s.equals("")) {
                hs.add(s);
            }
        }
        for(String s : S.split("")) {
            if(hs.contains(s)) {
                ret++;
            }
        }
        return ret;
    }
}
*/