
public class DefangedIP {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    System.out.print(defangedIP("11.23.5.6"));
  }
  
  public static String defangedIP(String address) {
    address=address.replace(".", "[#]");
    address=address.replace('#', '.');
    return address;
    
  }

}
