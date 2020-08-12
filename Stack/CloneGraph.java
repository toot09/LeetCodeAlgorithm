import java.util.*;

class CloneGraph {
    public Node cloneGraph(Node node) {
        if(node == null) return node;
        ArrayList<Node> orgNodes = new ArrayList<>();
        ArrayList<Node> newNodes = new ArrayList<>();
        
        Stack<Node> s = new Stack<>();
        s.push(node);
        
        while(s.size() > 0) {
            Node tmpNode = s.pop();
            Node newNode;
            if(!orgNodes.contains(tmpNode)) {
                Node newInput = new Node(tmpNode.val);
                newNode = newInput;
                newNodes.add(newInput);
                orgNodes.add(tmpNode);
            } else {
                newNode = newNodes.get(orgNodes.indexOf(tmpNode));
            }
            
            if(newNode.neighbors.size() == 0) {
                ArrayList<Node> newAL = new ArrayList<>();
                for(int i=0 ; i<tmpNode.neighbors.size() ; i++) {
                    if(!orgNodes.contains(tmpNode.neighbors.get(i))) {
                        s.push(tmpNode.neighbors.get(i));
                        Node newInput = new Node(tmpNode.neighbors.get(i).val);
                        orgNodes.add(tmpNode.neighbors.get(i));
                        newNodes.add(newInput);
                        newAL.add(newInput);
                    } else {
                        newAL.add(newNodes.get(orgNodes.indexOf(tmpNode.neighbors.get(i))));
                    }
                }
                newNode.neighbors = newAL;
            }
        }
        return newNodes.get(0);
    }
	
	// Definition for a Node.
	public class Node {
		public int val;
		public List<Node> neighbors;
		
		public Node() {
			val = 0;
			neighbors = new ArrayList<Node>();
		}
		
		public Node(int _val) {
			val = _val;
			neighbors = new ArrayList<Node>();
		}
		
		public Node(int _val, ArrayList<Node> _neighbors) {
			val = _val;
			neighbors = _neighbors;
		}
	}
	
}