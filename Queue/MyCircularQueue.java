// Runtime: 8 ms
// Memory Usage: 45.4 MB
// Using Array
class MyCircularQueue {

	private int[] data;
	private int start;
	private int end;
	private int size;

	/** Initialize your data structure here. Set the size of the queue to be k. */
	public MyCircularQueue(int k) {
		data = new int[k];
		size = k;
		start = -1;
		end = -1;
	}

	/** Insert an element into the circular queue. Return true if the operation is successful. */
	public boolean enQueue(int value) {
		if(isFull()) {
			return false;
		}
		end = (end + 1) % size;
		data[end] = value;
		if(start == -1) {
			++start;
		}
		return true;
	}

	/** Delete an element from the circular queue. Return true if the operation is successful. */
	public boolean deQueue() {
		if(isEmpty()) {
			return false;
		}
		if(start == end) {
			start = -1;
			end = -1;
		} else {
			start = (start + 1) % size;
		}
		return true;
	}

	/** Get the front item from the queue. */
	public int Front() {
		return (start == -1 ? start : data[start]);
	}

	/** Get the last item from the queue. */
	public int Rear() {
		return (end == -1 ? end : data[end]);
	}

	/** Checks whether the circular queue is empty or not. */
	public boolean isEmpty() {
		return (end == -1 ? true : false);
	}

	/** Checks whether the circular queue is full or not. */
	public boolean isFull() {
		if(start > end) {
			return (size - start + end + 1 == size ? true : false);
		} else {
			return (end - start + 1 == size ? true : false);
		}
	}
  
}


//Runtime: 6 ms
//Memory Usage: 39.6 MB
/* Using Doubly Linked List
class MyCircularQueue {

    Node head;
    Node tail;
    
    private class Node {
        private int val;
        private Node next;
        private Node prev;
        public Node(int val) {
            this.val = val;
            this.next = null;
            this.prev = null;
        }
    }
    
    // Initialize your data structure here. Set the size of the queue to be k.
    public MyCircularQueue(int k) {
        head = new Node(-1);
        Node tmp = head;
        for(int i = 2 ; i<=k ; i++) {
            Node node = new Node(-1);
            node.prev = tmp;
            tmp.next = node;
            tmp = node;
        }
        tmp.next = head;
        head.prev = tmp;
        tail = head.prev;
    }
    
    // Insert an element into the circular queue. Return true if the operation is successful. 
    public boolean enQueue(int value) {
        if(isFull()) return false;
        tail = tail.next;
        tail.val = value;
        return true;
    }
    
    // Delete an element from the circular queue. Return true if the operation is successful. 
    public boolean deQueue() {
        if(isEmpty()) return false;
        head.val = -1;
        head = head.next;
        return true;
    }
    
    // Get the front item from the queue. 
    public int Front() {
        return (isEmpty() ? -1 : head.val);
    }
    
    // Get the last item from the queue. 
    public int Rear() {
        return (isEmpty() ? -1 : tail.val);
    }
    
    // Checks whether the circular queue is empty or not. 
    public boolean isEmpty() {
        return (tail.next == head && head.val == -1 ? true : false);
    }
    
    // Checks whether the circular queue is full or not. 
    public boolean isFull() {
        return (tail.next == head && head.val != -1 ? true : false);
    }
}


 
 */
//Runtime: 8 ms
//Memory Usage: 45.1 MB
/* Using ArrayList
import java.util.*;
class MyCircularQueue {

    List<Integer> data;
    int head = 0;
    int tail = 0;
    int len = 0;
    boolean empty = true;
    
    // Initialize your data structure here. Set the size of the queue to be k.
    public MyCircularQueue(int k) {
        data = Arrays.asList(new Integer[k]);
        len = k;
        tail = len - 1;
    }
    
    // Insert an element into the circular queue. Return true if the operation is successful.
    public boolean enQueue(int value) {
        if(isFull()) {
            return false;
        }
        tail = (tail+1)%len;
        data.set(tail,value);
        if(empty) {
            empty = false;
        }
        return true;
    }
    
    // Delete an element from the circular queue. Return true if the operation is successful.
    public boolean deQueue() {
        if(isEmpty()) {
            return false;
        }
        empty = (head == tail ? true : false);
        head = (head+1)%len;
        return true;
    }
    
    // Get the front item from the queue. 
    public int Front() {
        if(empty) return -1;
        return data.get(head);
    }
    
    // Get the last item from the queue.
    public int Rear() {
        if(empty) return -1;
        return data.get(tail);
    }
    
    // Checks whether the circular queue is empty or not.
    public boolean isEmpty() {
        return empty;
    }
    
    // Checks whether the circular queue is full or not.
    public boolean isFull() {
        return head==(tail+1)%len && !empty ? true : false;
    }
}
*/