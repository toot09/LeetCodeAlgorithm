import java.util.*;

class KeysAndRooms {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        if(rooms.size() == 0) return false;
        int[] visit = new int[rooms.size()];
        Queue<Integer> q = new LinkedList<>();
        visit[0] = 1;
        int cnt = 1;
        for(int key : rooms.get(0)) {
            q.offer(key);
            if(visit[key] == 0) {
                cnt++;
                visit[key] = 1;
            }
        }
        while(q.size() > 0) {
            int num = q.poll();
                for(int key : rooms.get(num)) {
                     if(visit[key]==0) {
                        q.offer(key);
                        if(visit[key] == 0) {
                            cnt++;
                            visit[key] = 1;
                        }
                     }
                }
        }
        return cnt == visit.length ? true : false;
    }
}