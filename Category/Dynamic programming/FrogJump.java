// 403. Frog Jump
// Difficulty : Hard
// Comment : HashMap is not Guilty!
// url : https://leetcode.com/problems/frog-jump/
import java.util.*;
class FrogJump_category {
    public boolean canCross(int[] stones) {
        Map<Integer, Set<Integer>> hm = new HashMap<>();
        for(int stone : stones) hm.put(stone, new HashSet<Integer>());
        hm.get(stones[0]).add(1);
        for(int stone : stones) {
            Set<Integer> hs = hm.get(stone);
            for(int step : hs) {
                for(int i=-1 ; i<=1 ; i++) {
                    if(stone==0 && i!=0) continue;
                    if(stone+step+i==stones[stones.length-1]) return true;
                    if(hm.containsKey(stone+step+i) && stone!=(stone+step+i)) {
                        hm.get(stone+step+i).add(step+i);
                    }
                }
            }
        }
        return false;
    }
}