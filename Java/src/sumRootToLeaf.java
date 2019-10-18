
public class sumRootToLeaf {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

  }
  
  public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

  
  
    
  public static int sumRootToLeaf(TreeNode root) {
    return computesum(root, 0);
  }
  
  public static int computesum(TreeNode root, int val) {
    if(root==null)
      return 0;
    if(root.left==null && root.right==null){
      return root.val;
    }
    val=val*10+root.val;
    return computesum(root.right, val)+computesum(root.left, val);
  }

}



