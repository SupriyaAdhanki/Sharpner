import java.util.*;

public class isValid {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

  }
  public boolean isValid(String s) {
    Stack myStack = new Stack();
    for(Character ch : s.toCharArray()) {
      if(ch=='(' || ch=='{' || ch=='[') {
        myStack.add(ch);
      }else {
        switch(ch) {
        case '}':ch='{';break;
        case ']':ch='[';break;
        case ')':ch='(';break;
        default:ch='_';break;
        }
        if(!myStack.isEmpty())
        if(ch==myStack.pop()) {
          continue;
        }
        return false;
      }
        
    }
    if(myStack.size()==0) {
      return true;
    }
    return false;
  }

}
