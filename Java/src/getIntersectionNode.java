
public class getIntersectionNode {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    ListNode node = new ListNode(1);
    ListNode node1 = new ListNode(1);
    node.next = new ListNode(2);
    node.next.next = new ListNode(3);
    node.next.next.next = new ListNode(4);
    node.next.next.next.next = new ListNode(5);
    node.next.next.next.next.next = new ListNode(6);
    node1.next=new ListNode(11);
    node1.next.next=node.next.next;
    System.out.print(getIntersectionNode(node, node1));
  }

  public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    if(headA==null || headB==null){
      return null;
  }
  
  ListNode tempA=headA,tempB=headB,prevA=new ListNode(0),prevB=new ListNode(0);
  prevA.next=headA; prevB.next=headB;
  
  while(tempA!=null){
      tempA=tempA.next;
      prevA=tempA;
      while(tempB!=null){
          tempB=tempB.next;
          prevB=tempB;
          if(prevA.val==prevB.val && prevA.next==prevB.next)
              return prevA;
          tempB=tempB.next;
          prevB=tempB;
      }
  }
  return null;
  }

  public static class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
      next = null;
    }
  }

}
