/*
// Definition for a Node.
class Node {
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
*/

class Solution {
    public Node cloneGraph(Node node) {

        if (node == null) return null;
        
        Node newNode = new Node(node.val); //new node for return
        HashMap<Integer, Node> map = new HashMap(); //store visited nodes
        
        map.put(newNode.val, newNode); //add first node to HashMap
        
        LinkedList<Node> queue = new LinkedList(); //to store **original** nodes need to be visited
        queue.add(node); //add first **original** node to queue
        
        while (!queue.isEmpty()) { //if more nodes need to be visited
            Node n = queue.pop(); //search first node in the queue
            for (Node neighbor : n.neighbors) {
                if (!map.containsKey(neighbor.val)) { //add to map and queue if this node hasn't been searched before
                    map.put(neighbor.val, new Node(neighbor.val));
                    queue.add(neighbor);
                }
                map.get(n.val).neighbors.add(map.get(neighbor.val)); //add neighbor to new created nodes
            }
        }
        
        return newNode;
    }
}
