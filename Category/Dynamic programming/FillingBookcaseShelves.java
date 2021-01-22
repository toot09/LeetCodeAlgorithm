//1105. Filling Bookcase Shelves
// Difficulty : Medium
// Comment : I did it on my own
// url : https://leetcode.com/problems/filling-bookcase-shelves/
class FillingBookcaseShelves_category {
    public int minHeightShelves(int[][] books, int shelf_width) {
        // 0:thickness / 1:height
        int len = books.length;
        int[] dp = new int[len];
        for(int i=0 ; i<len ; i++) {
            dp[i] = Integer.MAX_VALUE;
            int w=0, h=0;
            for(int j=i ; j>=0 ; j--) {
                w += books[j][0];
                h = Math.max(h, books[j][1]);
                if(w>shelf_width) break;
                dp[i] = Math.min(dp[i], (j-1<0?0:dp[j-1])+h);
            }
        }
        return dp[len-1];
    }
}