import java.util.ArrayList;
import java.util.List;

import sun.reflect.generics.tree.Tree;

public class isSameTree {
  static List lp = new ArrayList<Integer>();
  static List lq = new ArrayList<Integer>();

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    TreeNode p = new TreeNode(1);
    p.left = new TreeNode(2);
    p.right = new TreeNode(3);
    p.left.left = new TreeNode(4);
    p.left.right = new TreeNode(5);
     p.right.left=new TreeNode(6);
    p.right.right = new TreeNode(7);

    TreeNode q = new TreeNode(1);
    q.left = new TreeNode(2);
    q.right = new TreeNode(3);
    q.left.left = new TreeNode(4);
    q.left.right = new TreeNode(5);
    q.right.left = new TreeNode(6);
    q.right.right = new TreeNode(7);

    if (isSameTree(p, q))
      System.out.print("Same");
  }

  public static class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
      val = x;
    }
  }
  
  public static boolean isSameTree(TreeNode p,TreeNode q) {
    if(p!=null && q!=null) {
      if(p.val==q.val) {
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
      }else {
        return false;
      }
    }return true;
  }

  public static boolean isSameTree1(TreeNode p, TreeNode q) {
    preOrderp(p);
    preOrderq(q);
    System.out.println(lp.toString());
    System.out.println(lq.toString());
    if(lp.toString().compareTo(lq.toString())==0) {
      return true;
    }
    return false;
  }

  public static void preOrderp(TreeNode p) {
    if (p != null) {
      lp.add(p.val);
      preOrderp(p.left);
      preOrderp(p.right);
    }
    else {
      lp.add(null);
    }
  }
  
  
  public static void preOrderq(TreeNode p) {
    if (p != null) {
      lq.add(p.val);
      preOrderq(p.left);
      preOrderq(p.right);
    }
    else {
      lq.add(null);
    }
  }

}
