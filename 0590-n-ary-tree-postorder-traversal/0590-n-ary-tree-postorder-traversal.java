/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> postorder(Node root) {
        Stack<Node> st=new Stack<>();
      List<Integer> l=new ArrayList<>();
      //Queue<Node> st=new LinkedList<>();
      //List<Node> ll=root.children;
      //for(Node v:ll)
      //System.out.println(v.val);
      
      Stack<Integer> ress=new Stack<>();
      st.add(root);
      while(!st.isEmpty())
      {
        Node tmp=st.pop();
        
        
        if(tmp==null)
          continue;
        
        l.add(tmp.val);
        
        for(Node n:tmp.children)
          st.add(n);
        //for(Node xx:st)
         //System.out.print(xx.val+" ");
       // System.out.println();
      }
      
     Collections.reverse(l);
      return l;
      
    }
}