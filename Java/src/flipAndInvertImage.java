
public class flipAndInvertImage {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

  }

  public int[][] flipAndInvertImage(int[][] A) {
    int[][] B = new int[A.length][A[0].length];
    for (int i = 0; i < A.length; i++) {
      for (int j = 0; j < A[i].length; j++) {
        B[i][j] = A[i][A[i].length - 1 - j] == 0 ? 1 : 0;
      }
    }
    return B;
  }
}
