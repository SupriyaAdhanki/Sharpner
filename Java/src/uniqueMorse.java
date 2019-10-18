import java.util.ArrayList;

public class uniqueMorse {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    String[] str = new String[5];
    str[0] = "abc";
    str[2] = "veg";
    str[3] = "vdeg";
    str[4] = "veg";
    str[1] = "veg";
    System.out.println(uniqueMorseRepresentations(str));
  }

  public static int uniqueMorseRepresentations(String[] words) {
    String[] codes = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.",
        "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };
    
    ArrayList<String> encArr = new ArrayList<String>();
    for (int i = 0; i < words.length; i++) {
      String enc = "";
      for (int j = 0; j < words[i].length(); j++) {
        enc = enc + codes[words[i].charAt(j) - 97];
      }
      if (!encArr.contains(enc))
        encArr.add(enc);
    }
    return encArr.size();

  }

}
