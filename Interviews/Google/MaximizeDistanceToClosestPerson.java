// 849. Maximize Distance to Closest Person
// Difficulty : Medium
// Comment : Easy
// url : https://leetcode.com/problems/maximize-distance-to-closest-person/


import java.util.*;
class MaximizeDistanceToClosestPerson {
    public int maxDistToClosest(int[] seats) {
        int p = -1, len=0;
        for(int i=0 ; i<seats.length ; i++) {
            int seat = seats[i];
            if(seat==1) {
                if(p==-1) len = i;
                else len = Math.max(len, (i-p)/2);
                p = i;
            }
        }
        return Math.max(len, seats.length-p-1);
    }
}