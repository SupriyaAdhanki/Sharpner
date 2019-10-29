
public class numSubarraysWithSum {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
System.out.print(numSubarraysWithSum(new int[] {0,0,1,0,1}, 0));
  }

  public static int numSubarraysWithSum(int[] A, int S) {
    int firstPointer = 0, secondPointer = 0;
    int counter = 0, tempSum = 0;
    while (tempSum < S && secondPointer < A.length) {
      tempSum = tempSum + A[secondPointer];
      secondPointer++;
    }
    if (tempSum == S)
      counter++;

    for (; secondPointer < A.length;) {
      if (secondPointer + 1 < A.length) {
        if (A[secondPointer + 1] == 0) {
          counter++;
          secondPointer++;
          continue;
        } else {
          while (firstPointer<A.length && A[firstPointer] == 0) {
            firstPointer++;
            counter++;
          }
          firstPointer++;
          secondPointer++;
          counter++;
        }
      } else {
        while (firstPointer<A.length && A[firstPointer] == 0) {
          firstPointer++;
          counter++;
        }
        secondPointer++;
        counter++;
      }
    }
    return counter;
  }
}
