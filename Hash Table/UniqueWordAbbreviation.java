import java.util.*;

class UniqueWordAbbreviation {
    public boolean UniqueWordAbbreviation(String[] dictionary, String word) {

        Set<String> hs = new HashSet<>();

        for(String s : dictionary) {
          hs.add(transAbb(s));
        }
        return !hs.contains(transAbb(word));
    }

    public String transAbb(String s) {
        return s.charAt(0)+String.valueOf(s.length()-2)+s.charAt(s.length()-1);
    }

}