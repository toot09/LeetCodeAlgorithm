import java.util.*;

class PerfectSquares {
    public int numSquares(int n) {
        Queue<Integer> q = new LinkedList<>();
        Set<Integer> visit = new HashSet<>();
        int ret = 1;
        for(int i=1 ; i*i <= n ; i++) {
          q.offer(i*i);
          visit.add(i*i);
        }
        while(q.size()>0) {
          int size = q.size();
          while(size>0) {
            int tmp = q.poll();
            if(tmp == n) {
              return ret;
            }
            for(int i=1 ; i*i <= n ; i++) {
              if(tmp+i*i <= n && !visit.contains(tmp+i*i)) {
                q.offer(tmp+i*i);
                visit.add(tmp+i*i);
              }
            }
            size--;
          }
          ret++;
        }
        return 0;
    }
}