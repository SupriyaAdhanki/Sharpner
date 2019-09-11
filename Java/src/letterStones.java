
public class letterStones {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    System.out.print(numJewelsInStones("aA", "aAAbbbb"));
  }

  public static int numJewelsInStones(String J, String S) {
    char[] jstr = J.toCharArray();
    String temp;
    int count = 0;
    for (char j : jstr) {
      temp = String.valueOf(j);
      while (S.contains(temp)) {
        S = S.substring(0, S.indexOf(j)) + '_' + S.substring(S.indexOf(j) + 1, S.length());
        count++;
      }
    }
    return count;
  }

}
