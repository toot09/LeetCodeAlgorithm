import java.util.*;

class ImplementQueueUsingStacks {

    private Stack<Integer> s;
    private Stack<Integer> tmp;
    
    /** Initialize your data structure here. */
    public ImplementQueueUsingStacks() {
        s = new Stack<>();
        tmp = new Stack<>();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        if(s.size() == 0 && tmp.size() > 0) {
            forwardMove();
        }
        s.push(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(tmp.size() == 0 && s.size() > 0) {
            reverseMove();
        }
        return tmp.pop();
        
    }
    
    /** Get the front element. */
    public int peek() {
        if(tmp.size() == 0 && s.size() > 0) {
            reverseMove();
        }
        return tmp.peek();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return s.size() == 0 && tmp.size() == 0 ? true : false;
    }
    
    public void forwardMove() {
        while(tmp.size() > 0) {
            s.push(tmp.pop());
        }
    }
    
    public void reverseMove() {
        while(s.size() > 0) {
            tmp.push(s.pop());
        }
    }
}

/**
 * Your ImplementQueueUsingStacks object will be instantiated and called as such:
 * ImplementQueueUsingStacks obj = new ImplementQueueUsingStacks();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */