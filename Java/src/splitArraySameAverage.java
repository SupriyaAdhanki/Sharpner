
public class splitArraySameAverage {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

  }

  public boolean splitArraySameAverage(int[] A) {
    int[] B = new int[A.length];
    int[] C = new int[A.length];
    int i = 0, j = A.length - 1;
    float sum = 0, avg = 0;
    int ignore=0, best=0,tempsum=0;
    for (int k = 0; k < A.length; k++)
      sum = sum + A[k];
    avg = sum / A.length;
    tempsum=tempsum+A[i]+A[j];
    while (i <= j) {
      if((float)(tempsum/2)!= avg) {
        i++;
      }
      
        
    }
    return false;
  }

}
