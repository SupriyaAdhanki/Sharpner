import java.util.*;


public class RecentCounter {
  
  public Queue<Integer> myQ;
  
  public RecentCounter() {
   this.myQ= new LinkedList<Integer>();
  }
  
  public int Ping(int t) {
    if(this.myQ.size()!=0 && t==0) 
      return 0;
    myQ.add(t);
    while(t-myQ.peek()>3000) {
        myQ.poll();
    }
    return myQ.size();
  }

}
