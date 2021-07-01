class OneEditDistanceFacebook {
    public boolean isOneEditDistance(String s, String t) {
        if(t.length()>s.length()) return isOneEditDistance(t,s);
        if(s.length()-t.length()>1) return false;
        if(t.equals(s)) return false;
        boolean diff=false;
        int i=0, j=0;
        while(i<s.length() && j<t.length()) {
            if(s.charAt(i)!=t.charAt(j)) {
                if(diff) return false;
                i++;
                if(s.length()==t.length()) {
                    j++;
                }
                diff = true;
            } else {
                i++;
                j++;
            }
        }
        return true;
    }
}