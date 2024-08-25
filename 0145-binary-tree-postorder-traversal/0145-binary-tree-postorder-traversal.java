/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNode> st=new Stack<>();
        List<Integer> l=new ArrayList<>();
        while(true)
        {
            while(root!=null)
            {
                st.push(root);
                st.push(root);
                root=root.left;
            }
            if(st.isEmpty())
                return l;
            if(!st.isEmpty())
            {
                root=st.pop();
            }
            if(!st.isEmpty() && st.peek()==root)
                root=root.right;
            else
            {
                l.add(root.val);
                root=null;
            }
        }
        
    }
}