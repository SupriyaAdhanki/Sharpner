
public class maxProfit {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

  }

  public int maxProfit(int[] prices) {
    int temp = 0, max = 0;
    for (int i = 0; i < prices.length; i++) {
      temp = prices[i];
      for (int j = i + 1; j < prices.length; j++) {
        if (prices[j] - temp > max)
          max = prices[j] - temp;
      }
    }
    return max;
  }

}
