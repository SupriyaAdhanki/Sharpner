import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class numMovesStones {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    numMovesStones(4, 3, 2);
  }

  public static int[] numMovesStones(int a, int b, int c) {
    int[] moves = new int[2];
    int temp;
    List myList = new ArrayList<Integer>();
    myList.add(a);
    myList.add(b);
    myList.add(c);
    a=(int) myList.get(0);
    b=(int) myList.get(1);
    c=(int) myList.get(2);
    
    int diffa = b - a;
    int diffb = c - b;
    if (diffa == 2 || diffb == 2) {
      moves[0] = 1;
    } else {
      if ((b - a) == 1) {
        moves[0] = 0;
      } else {
        moves[0] = 1;
      }
      if ((c - b) == 1) {
        moves[0] += 0;
      } else {
        moves[0] += 1;
      }

     // moves[0] = ((b - a) == 1) ? 0 : 1 + (((c - b) == 1) ? 0 : 1);
    }
    moves[1] = c - b - 1 + b - a - 1;
    return moves;

  }
}
