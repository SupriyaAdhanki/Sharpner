import java.util.*;

public class Treepractice {

  int val;
  Treepractice left;
  Treepractice right;

  Treepractice(int x) {
    val = x;
  }

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    Treepractice mytree = new Treepractice(1);
    mytree.left = new Treepractice(2);
    mytree.right = new Treepractice(3);
    mytree.left.left = new Treepractice(4);
    mytree.left.right = new Treepractice(5);
    mytree.right.left = new Treepractice(6);
    mytree.right.right = new Treepractice(7);
    List<Integer> thelist = new ArrayList<Integer>();
    thelist = mytree.preorderTraversal(mytree);
    for (int nt : thelist) {
      System.out.println(nt);
    }
  }

  public List<Integer> preorderTraversal(Treepractice root) {
    List<Integer> mylist = new ArrayList<Integer>();
    if (root != null) {
      mylist.add(root.val);
      mylist.addAll(preorderTraversal(root.left));
      mylist.addAll(preorderTraversal(root.right));
    }
    return mylist;
  }

  public List<Integer> post(Treepractice root) {
    // TODO Auto-generated method stub
    Stack<Treepractice> mystack = new Stack<Treepractice>();
    Stack<Treepractice> mymirrorstack = new Stack<Treepractice>();
    List<Integer> myList = new ArrayList<Integer>();
    Treepractice item = root;
    mystack.add(root);
    while (!mystack.isEmpty()) {
      item = mystack.pop();
      mymirrorstack.push(item);
      if (item != null) {
        if (item.right != null)
          mystack.push(item.right);
        if (item.left != null)
          mystack.push(item.left);
      }
    }
    while (!mymirrorstack.isEmpty()) {
      item = mymirrorstack.pop();
      if (item != null)
        myList.add(item.val);
    }
    return myList;
  }

}



// pre...
//class Solution {
//  public List<Integer> preorderTraversal(TreeNode root) {
//      Stack<TreeNode> mystack = new Stack<TreeNode>();
//  List<Integer> myList = new ArrayList<Integer>();
//  TreeNode item = root;
//      mystack.add(root);
//  
//  while (!mystack.isEmpty()) {
//    item = mystack.pop();
//      if(item!=null){
//    myList.add(item.val);
//    if(item.right!=null)
//      mystack.push(item.right);
//    if(item.left!=null)
//      mystack.push(item.left);
//      }
//  }
//
//  return myList;
//
//  }
//}
