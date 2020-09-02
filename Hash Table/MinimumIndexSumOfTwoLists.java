import java.util.*;

class MinimumIndexSumOfTwoLists {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> hm = new HashMap<>();
        for(int i=0 ; i<list1.length ; i++) {
            hm.put(list1[i],i);
        }
        ArrayList<String> menu = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        for(int i=0 ; i<list2.length ; i++) {
            if(hm.containsKey(list2[i])) {
                if(hm.get(list2[i])+i < min) {
                    menu.clear();
                    min = hm.get(list2[i]) + i;
                    menu.add(list2[i]);
                } else if(hm.get(list2[i])+i == min) {
                    menu.add(list2[i]);
                }
            }
        }
        String[] ret = new String[menu.size()];
        for(int i=0 ; i<menu.size() ; i++) {
            ret[i] = menu.get(i);
        }
        return ret;
    }
}