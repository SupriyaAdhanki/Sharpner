
public class findReplaceString {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    System.out.print(findReplaceString("supriya", new int[] { 0, 2 }, new String[] { "s", "priya" },
        new String[] { "UUU", "PPpp" }));
  }

  public static String findReplaceString(String S, int[] indexes, String[] sources, String[] targets) {
    String output = "";
    String[] str = new String[S.length()];
    int tempIndex = 0;
    for (int ind = 0; ind < indexes.length; ind++) {
      for (int i = tempIndex; i < indexes[ind]; i++) {
        str[i] = String.valueOf(S.charAt(i));
      }
      if (S.substring(indexes[ind], sources[ind].length() + indexes[ind] ) == sources[ind]) {

        str[indexes[ind]] = targets[ind];
        tempIndex = indexes[ind] + sources[ind].length();
      }
      for (int k = indexes[ind] + 1; k < indexes[ind] + sources[ind].length(); k++) {
        str[k] = "";
      } 
      
    }
    for (int j = tempIndex; j < S.length(); j++) {
      str[j] = S.valueOf(S.charAt(j));
    }
    for (String os : str) {
      output = output.concat(os);
    }
    return output;
  }
}
