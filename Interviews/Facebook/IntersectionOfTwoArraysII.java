// Difficulty : Medium
// Comment : Easy
// url : https://leetcode.com/explore/interview/card/facebook/54/sorting-and-searching-3/270/

import java.util.*;
class IntersectionOfTwoArraysIIFacebook {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> list = new ArrayList<>();
        int i=0, j=0;
        while(i<nums1.length && j<nums2.length) {
            if(nums1[i]<nums2[j]) {
                i++;
            } else if(nums1[i]>nums2[j]) {
                j++;
            } else {
                list.add(nums1[i]);
                i++;
                j++;
            }
        }
        int[] ret = new int[list.size()];
        for(int idx=0 ; idx<list.size() ; idx++) {
            ret[idx] = list.get(idx);
        }
        return ret;
    }
}