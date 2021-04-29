// Difficulty : Hard
// Comment : Confused to solving it but I rememebered it quickly
// url : https://leetcode.com/problems/median-of-two-sorted-arrays/


class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1=nums1.length, len2=nums2.length;
        int i1=0, i2=0;
        int[] arr = new int[(len1+len2)/2+1];
        for(int i=0 ; i<arr.length ; i++) {
            if(i1<nums1.length && i2<nums2.length) {
                if(nums1[i1]<=nums2[i2]) {
                    arr[i] = nums1[i1++];
                } else {
                    arr[i] = nums2[i2++];
                }
            } else {
                if(i1<nums1.length) {
                    arr[i] = nums1[i1++];
                } else {
                    arr[i] = nums2[i2++];
                }
            }
        }
        return (arr[(len1+len2-1)/2] + arr[(len1+len2)/2])/2.0;
    }
}