import java.util.*;

class ImplementStackUsingQueues {

    Queue<Integer> q1;
    Queue<Integer> q2;
    
    
    /** Initialize your data structure here. */
    public ImplementStackUsingQueues() {
        q1 =  new LinkedList<>();
        q2 =  new LinkedList<>();
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        if(q1.size() > 0) {
            q1.add(x);
        } else {
            q2.add(x);
        }
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        if(q1.size() > 0) {
            while(q1.size() > 1) {
                q2.add(q1.poll());
            }
            return q1.poll();
        } else {
            while(q2.size() > 1) {
                q1.add(q2.poll());
            }
            return q2.poll();
        }
    }
    
    /** Get the top element. */
    public int top() {
        if(q1.size() > 0) {
            while(q1.size() > 1) {
                q2.add(q1.poll());
            }
            int ret = q1.peek();
            q2.add(q1.poll());
            return ret;
        } else {
            while(q2.size() > 1) {
                q1.add(q2.poll());
            }
            int ret = q2.peek();
            q1.add(q2.poll());
            return ret;
        }
        
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return q1.size() == 0 && q2.size() == 0 ? true : false;
    }
}

/**
 * Your ImplementStackUsingQueues object will be instantiated and called as such:
 * ImplementStackUsingQueues obj = new ImplementStackUsingQueues();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */