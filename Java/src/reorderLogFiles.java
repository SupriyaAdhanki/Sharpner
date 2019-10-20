import java.util.*;

public class reorderLogFiles {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    String[] out = reorderLogFiles(
        new String[] { "dig1 8 1 5 1", "let1 art can", "dig2 3 6", "let2 own kit dig", "let3 art zero" });
  }

  public static String[] reorderLogFiles(String[] logs) {
    List letterLog = new ArrayList<>();
    List digiLog = new ArrayList<>();
    int spaceIndex = 0;
    String numberString = "0123456789";
    for (String str : logs) {
      spaceIndex = str.indexOf(" ", 0);
      if (numberString.contains(String.valueOf(str.charAt(spaceIndex + 1)))) {
        digiLog.add(str);
      } else {
        letterLog.add(str.substring(spaceIndex, str.length()) + " "+str.substring(0, spaceIndex));
      }
    }
    letterLog.sort(null);
    List lletr  = new ArrayList<>();
    for(int i=0;i<letterLog.size();i++) {
      lletr.add(letterLog.get(i).toString().substring(letterLog.get(i).toString().lastIndexOf(" ")+1)+letterLog.get(i).toString().substring(0, letterLog.get(i).toString().lastIndexOf(" ")));
    }
    lletr.addAll(digiLog);
    String[] out = (String[]) lletr.toArray(new String[lletr.size()]);
    return out;
  }

}
