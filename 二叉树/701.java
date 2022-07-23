
//  Definition for a binary tree node.
  public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
         this.left = left;
          this.right = right;
      }
  }

class Solution {
    //迭代法
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null ){
            TreeNode node = new TreeNode(val);
            return node;
        }
        TreeNode cur = root;
        TreeNode parent = root;
        //找到最底层节点
        while (cur != null){
            parent = cur;
            if(cur.val > val) cur = cur.left;
            else cur = cur.right;
        }
        // System.out.println(parent.val);
        // System.out.println(cur);
        //此时cur为要插入的位置,==null
        TreeNode node = new TreeNode(val);
        if(parent.val > val){
            parent.left = node;
        }else{
            parent.right = node;
        }
        return root;
    }
}
