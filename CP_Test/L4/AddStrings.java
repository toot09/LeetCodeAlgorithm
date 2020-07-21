//415. Add Strings
class AddStrings {
    public String addStrings(String num1, String num2) {
        String ret = "";
        int len1 = num1.length()-1;
        int len2 = num2.length()-1;
        int tmp1 = 0;
        int tmp2 = 0;
        boolean olim = false;
        while(len1 >= 0 || len2 >= 0) {
            if(len1 >= 0) {
                tmp1 = Character.getNumericValue(num1.charAt(len1));
                len1--;
                if(olim) {
                    tmp1++;
                    olim = false;
                }
            }
            if(len2 >= 0) {
                tmp2 = Character.getNumericValue(num2.charAt(len2));
                len2--;
                if(olim) {
                    tmp2++;
                    olim = false;
                }
            }
            if(tmp1 + tmp2 >= 10) {
                ret = ((tmp1 + tmp2)%10) + ret;
                olim = true;
            } else {
                ret = (tmp1 + tmp2) + ret;
            }
            tmp1 = 0;
            tmp2 = 0;
        }
        if(olim) {
            ret = 1 + ret;
        }
        return ret;        
    }
}