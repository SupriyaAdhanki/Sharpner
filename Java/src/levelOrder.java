import java.util.*;

import isSymmetric.TreeNode;

public class levelOrder {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

  }

  public static class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
      val = x;
    }
  }

  public List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> myList = new ArrayList<List<Integer>>();
    Queue<TreeNode> myQ = new LinkedList<levelOrder.TreeNode>();
    if (root != null) {
      myQ.add(root);
    }
    while (!myQ.isEmpty()) {
      if (myQ.poll() != null) {
        myList.add(new ArrayList<Integer>(root.val));
        myQ.add(root.left);
        myQ.add(root.right); 
      }
    }
    return myList;
  }

}
