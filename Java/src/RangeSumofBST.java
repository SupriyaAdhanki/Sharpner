
public class RangeSumofBST {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Solution s;
    TreeNode t=new TreeNode(2);
//    s.rangeSumBST(root, 1, R);
  }

  
  public static class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int x) {
      val = x;
    }
  }
  public static class Solution {

   

    public int rangeSumBST(TreeNode root, int L, int R) {
      if (root == null)
        return 0;
      else if (L <= root.val && root.val <= R)
        return root.val + rangeSumBST(root.left, L, R) + rangeSumBST(root.right, L, R);
      else
        return 0;
    }
  }

}
