

public class isSymmetric {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    TreeNode k = new TreeNode(0);
    
    TreeNode p = new TreeNode(1);
    p.left = new TreeNode(2);
    p.right = new TreeNode(3);
    p.left.left = new TreeNode(4);
//    p.left.right = new TreeNode(5);
//     p.right.left=new TreeNode(8);
//    p.right.right = new TreeNode(7);

    TreeNode q = new TreeNode(1);
    q.left = new TreeNode(2);
    q.right = new TreeNode(3);
    q.left.left = new TreeNode(4);
//    q.left.right = new TreeNode(5);
//    q.right.left = new TreeNode(6);
//    q.right.right = new TreeNode(7);
    k.left=p;
    k.right=q;
    
    System.out.print(isSymmetric(k));
  }


  public static class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
      val = x;
    }
  }
  public static boolean isSymmetric(TreeNode root) {
      return (isMirror(root, root));

  }

  public static boolean isMirror(TreeNode p, TreeNode q) {
    if(p==null && q==null) return true;
    if(p==null || q==null) return false;
    if(p.val==q.val) {
      return isMirror(p.left, q.right) && isMirror(p.right, q.left);
    }
    return false;
  }

}
