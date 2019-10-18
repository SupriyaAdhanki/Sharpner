import java.io.*;
import java.util.*;

public class Intuit {
  // If you need extra classes, you can define them privately here within class Solution
  
  // Prints to standard output.
  static void findStartAndEndLocations(String[][] pairs) {
    // Your code here.
    HashMap<String,List<String>> map=new LinkedHashMap<>();
    HashMap<String,Boolean> visit=new LinkedHashMap<>();
    List<String> destinations=new ArrayList<>();
    for(String[] a:pairs){
     if(map.containsKey(a[0])){
       map.get(a[0]).add(a[1]);
     }
      else{map.put(a[0],new LinkedList<String>());
           map.get(a[0]).add(a[1]);
           visit.put(a[0],false);}
    }
    
//     for(Map.Entry<String,List<String>> entry:map.entrySet()){
//        System.out.println(entry.getKey());
//       System.out.println(entry.getValue());
//     }
        
    boolean b=true;
    HashMap<String,List<String>> output=new HashMap<>();
    while(b){int count=0;
      for(Map.Entry<String,Boolean> entry:visit.entrySet()){
        HashSet<String> childs=new HashSet<>();
        if(!entry.getValue()){
          dfs(map,visit,childs,entry.getKey());
          output.put(entry.getKey(),new ArrayList(childs));
          count++;break;
        }
        
      }if(count==0)b=false;
    }
   
//     for(Map.Entry<String,List<String>> entry:output.entrySet()){
//       System.out.println(entry.getKey());
//       System.out.println(entry.getValue());
//     }
    String temp="";
    for(Map.Entry<String,List<String>> entry:output.entrySet()){
      System.out.print(entry.getKey()+":");
      if(entry.getValue().size()==0){System.out.print(" "+temp);}
      for(String r:entry.getValue()){
        temp=r;
        System.out.print(" "+r);
      }
      System.out.println("\n");
    }
    
    
  }
  
  static Set<String> dfs(Map<String,List<String>> map,Map<String,Boolean> visit,Set<String> output,String key){

      visit.put(key,true);
    for(String r:map.get(key)){
      if(!map.containsKey(r)){output.add(r);}
      else if(!visit.get(r))dfs(map,visit,output,r);
    }

    return output;
  }

  // DO NOT MODIFY MAIN()
  public static void main(String[] args) {
    List<String[]> arg1 = new ArrayList<String[]>();

    String line;
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      while ((line = br.readLine()) != null) {
        if (line.equals("")) {
//          continue;
          break;
        }

        arg1.add(line.split(" "));
      }
    } catch (IOException e) {
      e.printStackTrace();
      return;
    }

    String[][] pairs = arg1.toArray(new String[arg1.size()][]);

    findStartAndEndLocations(pairs);
  }
}
