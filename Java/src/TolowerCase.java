
public class TolowerCase {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Solution s = new Solution();
    System.out.print(s.toLowerCase("HELLO"));
  }
  
  public static class Solution {
    
    public Solution() {}
    public String toLowerCase(String str) {
      str=str.toLowerCase();
      return str;
        
    }
}

}
