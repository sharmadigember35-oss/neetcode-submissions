/*
Definition for a Node.
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
        // in this we have integer value and ArrayList neibgher 
        if(node == null){
            return null;
        }
        HashMap<Node,Node> hash = new HashMap<>();
        return dfs_traversal(node,hash);

        
    }
    public Node dfs_traversal(Node node , HashMap<Node,Node> hash){
        // now this the 
        Node clone = new Node(node.val);
        if(hash.containsKey(node)){
            return hash.get(node);
        }
        hash.put(node,clone);
        for(Node i : node.neighbors){
            clone.neighbors.add(dfs_traversal(i,hash));
        }
        return clone;
    }
}