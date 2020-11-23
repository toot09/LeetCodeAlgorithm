import java.util.*;//Runtime: 1 ms (82.13%)
//Memory Usage: 38.8 MB
class GenerateParentheses_TIQ {
    public List<String> generateParenthesis(int n) {
        List<String> ret = new ArrayList<>();
        if(n <= 0) return ret;
        String s ="";
        backtracking(ret,s,0,0,n);
        return ret;
    }
    public static void backtracking(List<String> ret, String s, int open, int close, int n) {
        if(s.length()==n*2) {
            ret.add(s);
            return;
        }
        if(open<n) backtracking(ret,s+"(",open+1,close,n);
        if(open>close) backtracking(ret,s+")",open,close+1,n);
    }
}

//Runtime: 39 ms (Out Of Lange... Shit)
//Memory Usage: 39.3 MB
/*
class GenerateParentheses_TIQ {
    public List<String> generateParenthesis(int n) {
        List<String> ret = new ArrayList<>();
        if(n == 0) {
            return ret;
        }
        ret.add("()");
        for(int i = 2; i <= n; i++) {
            int size = ret.size();
            for(int j = 0; j < size; j++) {
                String s = ret.remove(0);
                for(int k = 1; k < s.length(); k++) {
                    char c = s.charAt(k);
                    if(c == ')') {
                        String tmp = s.substring(0, k) + "()" + s.substring(k);
                        if(!ret.contains(tmp)) {
                            ret.add(tmp);
                        }
                    }
                }
                String last = s + "()";
                if(!ret.contains(last)) {
                ret.add(last);
                }
            }
        }
        return ret;
    }
}
*/
//Runtime: 407 ms (?)
//Memory Usage: 39.6 MB
/*
class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        List<String> ret = new ArrayList<>();
        if(n==0) return ret;
        ret.add("()");
        int t = 1;
        backtracking(ret, n, t);
        return ret;
    }
    public static void backtracking(List<String> ret, int n, int t) {
        if(n == t) {
            return;
        }
        String tmp = ret.remove(ret.size() - 1);
        for(int i = 1; i <= tmp.length(); i++) {
            String insert = "";
            if(i != tmp.length()) {
                char c = tmp.charAt(i);
                if(c == ')') {
                    insert = tmp.substring(0, i) + "()" + tmp.substring(i);
                }
            } else {
                insert = tmp + "()";
            }
            if(!ret.contains(insert) && insert != "") {
                ret.add(insert);
                backtracking(ret, n, t + 1);
            }
        }
    }
}
*/