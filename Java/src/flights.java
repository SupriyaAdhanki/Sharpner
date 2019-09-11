
public class flights {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int[] bookingArray = new int[10];
  }
  
  public int[] corpFlightBookings(int[][] bookings, int n) {
    int[] bookingArray = new int[n];
    for(int i=0;i<bookings.length;i++) {
      for(int j=bookings[i][0];j<=bookings[i][1];j++) {
        bookingArray[j-1]=bookingArray[j-1]+bookings[i][2];
      }
    }
    return bookingArray;
  }

}
