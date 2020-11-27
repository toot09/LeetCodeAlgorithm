// Difficulty : Medium
// Code myself. but this is not efficient.
import java.util.*;
class Triangle_category {
    public int minimumTotal(List<List<Integer>> triangle) {
        if(triangle.size()==0) return 0;
        if(triangle.size()==1) return triangle.get(0).get(0);
        int ret = Integer.MAX_VALUE;
        for(int i=1 ; i<triangle.size() ; i++) {
            List<Integer> list = triangle.get(i);
            for(int j=0 ; j<list.size() ; j++) {
                if(j==0) list.set(j,  list.get(j) + triangle.get(i-1).get(0));
                else if(j==list.size()-1) list.set(j, list.get(j)+triangle.get(i-1).get(list.size()-2));
                else list.set(j, list.get(j)+Math.min(triangle.get(i-1).get(j),triangle.get(i-1).get(j-1)));
                if(i==triangle.size()-1) ret = Math.min(ret,list.get(j));   
            }
        }
        return ret;
    }
}