
public class caller {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    RecentCounter obj = new RecentCounter();
    int param_1 = obj.Ping(10);
    param_1 = obj.Ping(11);
    param_1 = obj.Ping(12);
    param_1 = obj.Ping(3022);
    System.out.print(param_1);
  }

}
