import java.util.HashSet;
import java.util.Set;

public class numUniqueEmails {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    System.out.println(numUniqueEmails(new String[] {"test.email+alex@leetcode.com","test.email.leet+alex@code.com"}));
  }

  public static int numUniqueEmails(String[] emails) {
    Set<String> mySet = new HashSet();
    String tempStrin = "";
    int indexodAT = 0, indexofDOT = 0;

    for (String email : emails) {
      indexodAT = email.indexOf('@');
      tempStrin = email.substring(0, indexodAT);
      if (tempStrin.indexOf('+') >0)
        tempStrin = tempStrin.substring(0, tempStrin.indexOf('+'));
      while (tempStrin.contains(".")) {
        indexofDOT = tempStrin.indexOf('.');
        tempStrin = (String) tempStrin.subSequence(0, indexofDOT)
            + tempStrin.substring(indexofDOT + 1, tempStrin.length());
      }
      mySet.add(tempStrin + email.substring(indexodAT, email.length()));
    }
    return mySet.size();
  }

}
