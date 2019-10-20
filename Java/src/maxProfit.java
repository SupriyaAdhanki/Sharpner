
public class maxProfit {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

  }

  public int maxProfit(int[] prices) {
    int temp = 0, diff = 0,min=Integer.MAX_VALUE;
    for (int i = 0; i < prices.length; i++) {
      if(prices[i]<min) {
        min=prices[i];
      }else {
        if(prices[i]-min > diff) {
          diff = prices[i]-min;
        }
      }
    }
    return diff;
  }
  
  
  //multiple transations
  
  public int maxProfits(int[] prices) {
    int temp = 0, diff = 0,min=Integer.MAX_VALUE,maxStock=0;
    for (int i = 0; i < prices.length; i++) {
      if(prices[i]<min) {
        min=prices[i]; //buy
      }else {
        if(prices[i]-min > diff) {
          diff = prices[i]-min;
        }else {
          maxStock=maxStock+diff;
          diff=0;
          min=Integer.MAX_VALUE;
        }
      }
    }
    return diff;
  }

}
