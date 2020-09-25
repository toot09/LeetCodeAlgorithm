import java.util.*;
/*
!!!!! ArrayList is best way to Design MinStack. !!!!!
[Queue Coding]
- Runtime: 1014 ms
- Memory Usage: 44.2 MB
[ArrayList Coding]
- Runtime: 358 ms
- Memory Usage: 40.7 MB
*/
class MinStack_TIQ {
    Queue<Integer> q1;
    Queue<Integer> q2;
    
    /** initialize your data structure here. */
    public MinStack_TIQ() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }
    
    public void push(int x) {
        if(q1.size()>0) q1.offer(x);
        else q2.offer(x);
    }
    
    public void pop() {
        if(q1.size()>0) popHelper(q1, q2);
        else popHelper(q2, q1);
    }
    
    public int top() {
        if(q1.size()>0) return getPopMinHelper(q1, q2, "top");
        else return getPopMinHelper(q2, q1, "top");
    }
    
    public int getMin() {
        if(q1.size()>0) return getPopMinHelper(q1, q2, "min");
        return getPopMinHelper(q2, q1, "min");
    }
    
    public void popHelper(Queue<Integer> q, Queue<Integer> h) {
        int size = q.size();
        for(int i=1 ; i<size ; i++) {
            h.offer(q.poll());
        }
        q.poll();
    }
    
    public int getPopMinHelper(Queue<Integer> q, Queue<Integer> h, String command) {
        int min = Integer.MAX_VALUE;
        int top = 0;
        int size = q.size();
        for(int i=1 ; i<=size ; i++) {
            int num = q.poll();
            min = Math.min(min,num);
            h.offer(num);
            if(i==size) top = num;
        }
        if(command.equals("min")) return min;    
        else return top;
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