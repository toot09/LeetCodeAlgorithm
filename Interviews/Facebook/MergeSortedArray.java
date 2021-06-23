// Difficulty : Easy
// Comment : Easy
// url : https://leetcode.com/explore/interview/card/facebook/5/array-and-strings/309/


class MergeSortedArrayFacebook {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        m--;
        n--;
        while(m>=0 && n>=0) {
            if(nums1[m]>nums2[n]) nums1[m+n+1] = nums1[m--];
            else nums1[m+n+1] = nums2[n--];
        }
        while(n>=0) nums1[n] = nums2[n--];
    }
}