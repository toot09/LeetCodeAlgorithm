import java.util.*;
class FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        Queue<int[]> q = new LinkedList<>();
        int orgColor = image[sr][sc];
        if(orgColor == newColor) return image;
        q.add(new int[]{sr,sc});
        while(q.size() > 0) {
            int[] tmp = q.poll();
            if(tmp[0]>=0 && tmp[0] < image.length && tmp[1]>=0 && tmp[1] < image[0].length && image[tmp[0]][tmp[1]] == orgColor) {
                image[tmp[0]][tmp[1]] = newColor;
                q.add(new int[]{tmp[0]+1,tmp[1]});
                q.add(new int[]{tmp[0]-1,tmp[1]});
                q.add(new int[]{tmp[0],tmp[1]+1});
                q.add(new int[]{tmp[0],tmp[1]-1});
            }
        }
        return image;
    }
}