//Difficulty : Medium
//Comment : I made two version
//url : https://leetcode.com/problems/push-dominoes/submissions/

//Runtime: 5 ms, faster than 86.92%
//Memory Usage: 40 MB
class PushDominoes_catogory {
    public String pushDominoes(String dominoes) {
        char[] c = dominoes.toCharArray();
        for(int i=0 ; i<c.length ; i++) {
            if(c[i]=='R') {
                int s = i+1;
                int e = s;
                while(e<c.length && c[e]=='.') {
                    e++;
                }
                if(e<c.length && c[e]=='L') {
                    helper(c, s, e-1);
                } else {
                    helper(c, s, e-1, 'R');
                }
            } else if(c[i]=='L') {
                int e = i-1;
                int s = e;
                while(s>=0 && c[s]=='.') {
                    s--;
                }
                if(s>=0 && c[s]=='R') {
                    helper(c, s+1, e);
                } else {
                    helper(c, s+1, e, 'L');
                }
            }
        }
        return String.valueOf(c);
    }
    
    public void helper(char[] c, int s, int e) {
        while(s<e) {
            c[s] = 'R';
            c[e] = 'L';
            s++;
            e--;
        }
    }
    
    public void helper(char[] c, int s, int e, char d) {
        for(int i=s ; i<=e ; i++) {
            c[i] = d;
        }
    }
}

//Runtime: 32 ms, faster than 16.67%
//Memory Usage: 40.5 MB
/*
class PushDominoes_LowEfficiency {
    public String pushDominoes(String dominoes) {
        if(dominoes.length()<=1) return dominoes;
        char[] c = dominoes.toCharArray();
        int cnt = c.length;
        while(cnt!=0) {
            cnt = 0;
            char[] tmp = c.clone();
            for(int i=0 ; i<c.length ; i++) {
                if(c[i]=='.') {
                    if(i==0) {
                        if(tmp[i+1]=='L') {
                            c[i] = tmp[i+1];
                            cnt++;
                        }
                    } else if(i==c.length-1) {
                        if(tmp[i-1]=='R') {
                            c[i] = tmp[i-1];
                            cnt++;
                        }
                    } else {
                        if(tmp[i-1]=='R' && tmp[i+1]=='L') {
                            continue;
                        } else if(tmp[i-1]=='R' || tmp[i+1]=='L') {
                            c[i] = tmp[i-1]=='.'?tmp[i+1]:tmp[i-1];
                            cnt++;
                        }
                    }
                }
            }
        }
        return String.valueOf(c);
    }
}
*/