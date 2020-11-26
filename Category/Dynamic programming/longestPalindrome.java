// Effcient code
// Just use start and end point.
// but my code use whole String data
// so my code more inefficient code than below code.
class longestPalindrome_Category {
    public String longestPalindrome(String s) {
        String ret = "";
        if(s.length() == 0 || s == null) return ret;
        for(int i = 0; i < s.length(); i++) {
            int s1 = longestPalindromeHelper(s, i, i);
            int s2 = longestPalindromeHelper(s, i, i + 1);
            int max = s1 > s2 ? s1 : s2;
            if(ret.length()<max) {
                ret = s.substring(i-(max-1)/2,i+max/2+1);
            }
        }
        return ret;
    }
    public int longestPalindromeHelper(String s, int si, int ei) {
        while(si >= 0 && ei < s.length() && s.charAt(si) == s.charAt(ei)) {
            si--;
            ei++;
        }
        return ei-si-1;
    }
}

// My code
/*
class longestPalindrome_Category {
	public static String longestPalindrome(String s) {
		String ret = "";
		if(s.length() == 0 || s == null) return ret;
		for(int i = 0; i < s.length(); i++) {
			String s1 = longestPalindromeHelper(s, i, i);
			String s2 = "";
			if(i != s.length() - 1) {
				s2 = longestPalindromeHelper(s, i, i + 1);
			}
			String max = s1.length() > s2.length() ? s1 : s2;
			ret = max.length() > ret.length() ? max : ret;
		}
		return ret;
	}
	public String longestPalindromeHelper(String s, int si, int ei) {
		while(si >= 0 && ei < s.length() && s.charAt(si) == s.charAt(ei)) {
			si--;
			ei++;
		}
		return s.substring(si + 1, ei);
	}
}
*/