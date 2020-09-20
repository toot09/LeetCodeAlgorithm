import java.util.*;
//Runtime: 6 ms (42.57%)
//Memory Usage: 38.7 MB (52.55%)
class CountAndSay {
    public String countAndSay(int n) {
        Queue<String> q = new LinkedList<>();
        q.offer("1");
        for(int i=2 ; i<=n ; i++) {
            String num = q.poll();
            int cnt = 1;
            int size = q.size();
            for(int j=1 ; j<=size ; j++) {
                String tmp = q.poll();
                if(!tmp.equals(num)) {
                    q.offer(String.valueOf(cnt));
                    q.offer(num);
                    num = tmp;
                    cnt = 1;
                } else {
                    cnt++;
                }
            }
            q.offer(String.valueOf(cnt));
            q.offer(num);
        }
        StringBuilder sb = new StringBuilder();
        while(q.size()>0) {
            sb.append(q.poll());
        }
        return sb.toString();
    }
}