
public class trailingZeroes {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

  }

  public static int trailingZeroes(int n) {
    int noOfZeros=0;
    while(n!=0){
        noOfZeros =noOfZeros + n/5;
        n=n/5;
    }
    return noOfZeros;
  }
}
