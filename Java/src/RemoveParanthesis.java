import java.util.*;
import java.util.Stack;

public class RemoveParanthesis {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    System.out.print(removeOuterParentheses("(())((())()()())"));
  }

  public static String removeOuterParentheses(String S) {
    Queue storage = new LinkedList();
    StringBuilder output = new StringBuilder();
    int inpar = 0, outpar = 0;
    for (int i = 0; i < S.length(); i++) {
      if (S.charAt(i) == '(') {
        inpar++;
      } else if (S.charAt(i) == ')') {
        outpar++;
      }
      storage.add(S.charAt(i));
      if (inpar == outpar) {
        storage.remove();
        while (storage.size()>1) {
          output.append(storage.remove());
        }
        storage.remove();
        inpar = 0;
        outpar = 0;
      }
    }
    return output.toString();
  }

}
