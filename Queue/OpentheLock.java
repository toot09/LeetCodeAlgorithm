import java.util.*;

class OpentheLock {
    public int openLock(String[] deadends, String target) {
        int ret = 0;
        Queue<String> q = new LinkedList<>();
        Set<String> visit = new HashSet<>();
        Set<String> deadEnd = new HashSet<>(Arrays.asList(deadends));
        q.offer("0000");
        visit.add("0000");
        if(deadEnd.contains("0000")) {
            return -1;
        }
        while(q.size()>0) {
          int size = q.size();
          while(size>0) {
            String s = q.poll();
            if(s.equals(target)) {
              return ret;
            }
            StringBuilder sb = new StringBuilder(s);
            for(int i=0 ; i<4 ; i++) {
              char c = s.charAt(i);
              // Up
              String s1 = s.substring(0, i) + (c == '9' ? 0 : c - '0' + 1) + s.substring(i+1);
              // Donw
              String s2 = s.substring(0, i) + (c == '0' ? 9 : c - '0' - 1) + s.substring(i+1);
              if(!visit.contains(s1) && !deadEnd.contains(s1)) {
                visit.add(s1);
                q.offer(s1);
              }
              if(!visit.contains(s2) && !deadEnd.contains(s2)) {
                visit.add(s2);
                q.offer(s2);
              }
            }
            size--;
          }
          ret++;
        }
      return -1;
    }
}