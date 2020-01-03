import java.util.*;

import javax.print.attribute.HashAttributeSet;

public class compress {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    char[] chrs = { 'a', 'a', 'a', 'b', 'b', 'a', 'a' };
    System.out.print(compress(chrs));
    System.out.println(chrs);
    int a = 0;
    System.out.println(++a);
    System.out.println(a);
    System.out.println(a++);
    System.out.println(a);
    char[] chrss = { 'a', 'a', 'a', 'b', 'b', 'a', 'a' };
    System.out.println(compresss(chrss));
    System.out.println((chrss));
  }

  public static int compress(char[] chars) {
    Set<String> mySet = new HashSet<String>();
    int count = 1;
    int arrayPointer = 0;
    for (int i = 0; i < chars.length; i++) {
      if (mySet.add(chars[i] + "")) {
        chars[arrayPointer] = chars[i];
        arrayPointer++;
        if (count > 1) {
          mySet.remove(chars[i - 2] + "");
          char temp = chars[arrayPointer - 1];
          arrayPointer--;
          // chars[arrayPointer]=chars[arrayPointer-1];
          for (int k = 0; k < Integer.toString(count).length(); k++) {
            chars[arrayPointer] = Integer.toString(count).charAt(k);
            arrayPointer++;
          }
          chars[arrayPointer] = temp;
          count = 1;
          arrayPointer++;
        }
      } else {
        count++;
      }
    }
    if (count > 1) {
      for (int k = 0; k < Integer.toString(count).length(); k++) {
        chars[arrayPointer] = Integer.toString(count).charAt(k);
        arrayPointer++;
      }
    }

    return arrayPointer;
  }

  public static int compresss(char[] chars) {
    int arraypointer = 0, tempCount = 1;
    char goingChar;
    Set<Character> mySet = new HashSet<Character>();
    for (char ch : chars) {
      if (mySet.add(ch)) {
        mySet.removeAll(mySet);
        mySet.add(ch);
        if (tempCount > 1 && arraypointer != 0) {
          for (int k = 0; k < Integer.toString(tempCount).length(); k++) {
            chars[arraypointer++] = Integer.toString(tempCount).charAt(k);
//            chars[arraypointer++] = Integer.toString(tempCount).charAt(0);
          }
        }
        tempCount = 1;
        chars[arraypointer++] = ch;

      } else {
        tempCount++;
      }
    }
    if (tempCount > 1)
      for (int k = 0; k < Integer.toString(tempCount).length(); k++) {
        chars[arraypointer++] = Integer.toString(tempCount).charAt(k);}
//      chars[arraypointer++] = Integer.toString(tempCount).charAt(0);
    return arraypointer;
  }

}
