
public class findRestaurant {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

  }

  public String[] findRestaurant(String[] list1, String[] list2) {
    int minlen = Math.min(list2.length, list1.length);
    String[] compList = list1.length < list2.length ? list1 : list2;
    for (int i = 0, j = 0; i < list1.length && j < list2.length;) {
      for(int k = i; k<compList.length;k++) {
        
      }
    }
    return null;
  }

}
