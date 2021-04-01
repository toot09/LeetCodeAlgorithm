// 253. Meeting Rooms II
// Difficulty : Hard
// Comment : Squeeeeeeeeze brain!!!!
// url : https://leetcode.com/problems/meeting-rooms-ii/

import java.util.*;
class MeetingRoomsII {
    public int minMeetingRooms(int[][] intervals) {
        int len = intervals.length, ret=0;
        int[] s=new int[len], e=new int[len];
        for(int i=0 ; i<len ; i++) {
            s[i] = intervals[i][0];
            e[i] = intervals[i][1];
        }
        Arrays.sort(s);
        Arrays.sort(e);
        int idx=0;
        for(int i=0 ; i<len ; i++) {
            while(idx<=i && e[idx]<=s[i]) idx++;
            ret = Math.max(ret, i-idx+1);
        }
        return ret;
    }
}