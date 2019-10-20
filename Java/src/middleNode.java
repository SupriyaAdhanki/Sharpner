
public class middleNode {

  public static class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
    }
  }

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    ListNode node = new ListNode(1);
    node.next = new ListNode(2);
    node.next.next = new ListNode(3);
    node.next.next.next = new ListNode(4);
    node.next.next.next.next = new ListNode(5);
    node.next.next.next.next.next = new ListNode(6);
    System.out.print(middleNode(node).val);

  }

  public static ListNode middleNode(ListNode head) {
    ListNode temp;
    ListNode ending;
    temp = head;
    ending = head;
    while (ending != null && ending.next!=null) {
      if (ending.next != null)
        ending = ending.next.next;
      if (temp != null)
        temp = temp.next;
    }

    return temp;
  }

}
