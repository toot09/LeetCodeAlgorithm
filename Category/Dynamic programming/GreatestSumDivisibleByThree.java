// 1262. Greatest Sum Divisible by Three
// Difficulty : Medium
// Comment : Kick is Arrays.copyOf
// url : https://leetcode.com/problems/greatest-sum-divisible-by-three/
import java.util.*;
class GreatestSumDivisibleByThree_category {
    public int maxSumDivThree(int[] nums) {
        int[] mod = new int[3];
        for(int num : nums) {
            for(int m : Arrays.copyOf(mod, mod.length)) {
                mod[(m+num)%3] = Math.max(mod[(m+num)%3], m+num);
            }
        }
        return mod[0];
    }
}