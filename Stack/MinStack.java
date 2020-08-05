import java.util.*;

class MinStack {

    private ArrayList<Integer> data;

    /** initialize your data structure here. */
    public MinStack() {
        data = new ArrayList<>();
    }
    
    public void push(int x) {
        data.add(x);
    }
    
    public void pop() {
        data.remove(data.size()-1);
    }
    
    public int top() {
        return data.get(data.size()-1);
    }
    
    public int getMin() {
        int ret = data.get(0);
        for(int i=1 ; i<data.size() ; i++) {
          ret = Math.min(ret,data.get(i));
        }
        return ret;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */