
public class isRectangleOverlap {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
System.out.print(isRectangleOverlap(new int[] {7,8,13,15},new int[] {10,8,12,20}));
  }

  public static boolean isRectangleOverlap(int[] rec1, int[] rec2) {
//    int midxrec1 = (rec1[0] + rec1[2]) / 2;
//    int midyrec1 = (rec1[1] + rec1[3]) / 2;
//    int midxrec2 = (rec2[0] + rec2[2]) / 2;
//    int midyrec2 = (rec2[1] + rec2[3]) / 2;
//    double midDist = Math.sqrt(Math.pow((midxrec1 - midxrec2), 2) + Math.pow(midyrec1 - midyrec2,2));
//    double halfdiagonalrec1 = Math.sqrt(Math.pow(midxrec1 - rec1[0], 2) + Math.pow(midyrec1 - rec1[1], 2));
//    double halfdiagonalrec2 = Math.sqrt(Math.pow(midxrec2 - rec2[0], 2) + Math.pow(midyrec2 - rec2[1],2));
//    if (midDist < halfdiagonalrec1 + halfdiagonalrec2)
//      return true;

    return !(rec1[2]<=rec2[0]||rec1[3]<=rec2[1]||rec1[0]>=rec2[2]|| rec1[1]>=rec2[3]);
    
  }
}
