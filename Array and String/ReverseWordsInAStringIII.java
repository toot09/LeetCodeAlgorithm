class ReverseWordsInAStringIII {
    public String reverseWords(String s) {
        String[] tmp = s.split(" ");
        StringBuilder ret = new StringBuilder();
        for(int i=0 ; i<tmp.length ; i++) {
            if(!tmp[i].isEmpty()) {
                for(int j=tmp[i].length()-1 ; j>=0 ; j--) {
                    ret.append(tmp[i].charAt(j));
                }
                ret.append(" ");
            }
        }
        return ret.length() == 0 ? "" : ret.substring(0,ret.length()-1);
    }
}