import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class maxProfit {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    System.out.print(maxProfit2(new int[] { 1, 2, 3, 4, 5 }));// { 3, 3, 5, 0, 0, 3, 1, 4 }
  }

  public int maxProfit(int[] prices) {
    int temp = 0, diff = 0, min = Integer.MAX_VALUE;
    for (int i = 0; i < prices.length; i++) {
      if (prices[i] < min) {
        min = prices[i];
      } else {
        if (prices[i] - min > diff) {
          diff = prices[i] - min;
        }
      }
    }
    return diff;
  }

  // multiple transations

  public int maxProfits(int[] prices) {
    int diff = 0, min = Integer.MAX_VALUE, maxStock = 0;
    for (int i = 0; i < prices.length; i++) {
      if (prices[i] < min) {
        min = prices[i]; // buy
      } else {
        if (prices[i] - min > diff) {
          diff = prices[i] - min;
          i--;
        } else {
          maxStock = maxStock + diff;
          diff = 0;
          min = Integer.MAX_VALUE;
          i--;
        }
      }
    }
    if (maxStock == 0)
      maxStock = diff;
    return maxStock;
  }

  // atmost 2 transactions

  public static int maxProfit2(int[] prices) {
    int temp = 0, diff = 0, min = Integer.MAX_VALUE, maxStock = 0;
    List out = new ArrayList<Integer>();
    for (int i = 0; i < prices.length; i++) {
      if (prices[i] < min) {
        min = prices[i]; // buy
      } else {
        if (prices[i] - min > diff) {
          diff = prices[i] - min;
          if (i == prices.length - 1) {
            out.add(diff);
          }

        } else {
          out.add(diff);
          diff = 0;
          min = Integer.MAX_VALUE;
          i--;
        }
      }
    }
    out.add(diff);
    out.sort(null);
    if (out.size() >= 2)
      return (int) out.get(out.size() - 1) + (int) out.get(out.size() - 2);
    else
      return (int) out.get(out.size() - 1);
  }

  public int maxProfit3(int[] prices) {
    int diff = 0, min = Integer.MAX_VALUE, maxStock = 0;
    List out = new ArrayList<Integer>();
    for (int i = 0; i < prices.length; i++) {
      if (prices[i] < min) {
        min = prices[i]; // buy
      } else {
        if (prices[i] - min > diff) {
          diff = prices[i] - min;
          i--;
        } else {
          maxStock = maxStock + diff;
          out.add(diff);
          diff = 0;
          min = Integer.MAX_VALUE;
          i--;
        }
      }
    }
    if (maxStock == 0) {
      maxStock = diff;
      out.add(diff);
    }
    
    out.sort(null);
    if(out.size()<2)
      return (int) out.get(out.size()-1);
    else
    return (int) out.get(out.size()-1) + (int) out.get(out.size()-2);
  }

}
