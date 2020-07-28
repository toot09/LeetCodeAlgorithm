class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        StringBuilder tmp = new StringBuilder();
        tmp.append(strs[0]);
        for(String str : strs) {
            int i =0;
            for(;i<str.length() && i<tmp.length();i++) {
                if(str.charAt(i) != tmp.charAt(i)) {
                    break;
                }
            }
            tmp.delete(i,tmp.length());
        }
        return tmp.toString();
    }
}