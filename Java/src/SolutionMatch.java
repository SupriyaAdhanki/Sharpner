import java.util.Scanner;

abstract class Cuisine {
    public abstract Cuisine serveFood(String dish);
}

class UnservableCuisineRequestException extends Exception {
    public UnservableCuisineRequestException(String message) {
        super(message);
    }
}


/*
 * Create the FoodFactory class and other required classes here.
 */

class Chinese extends Cuisine{
    String dish;
    public Cuisine serveFood(String dish){
        this.dish=dish;
       return this; 
    }
    public String getDish(){
        return dish;
    }
    
}
class Italian extends Cuisine{
    String dish;
   public Cuisine serveFood(String dish){
       this.dish=dish;
       return this; 
    }
    public String getDish(){
        return dish;
    }
}
class Japanese extends Cuisine{
    String dish;
    public Cuisine serveFood(String dish){
        this.dish=dish;
       return this; 
    }
    public String getDish(){
        System.out.println(dish);
        return dish;
    }
}
class Mexican extends Cuisine{
    String dish;
    public Cuisine serveFood(String dish){
        this.dish=dish;
       return this; 
    }
    public String getDish(){
        System.out.println(dish+"ho ");
        return dish;
    }
}



 class FoodFactory{
     java.util.Map<String,Cuisine> cuisines;
     FoodFactory(){
         cuisines=new java.util.HashMap<>();
     }
     static FoodFactory getFactory(){
         return new FoodFactory();
     }
     void registerCuisine(String cuisineKey,Cuisine cuisine){
         cuisines.put(cuisineKey,cuisine);
     }
     Cuisine serveCuisine (String cuisineKey,String dish)throws UnservableCuisineRequestException{
       if(cuisines.containsKey(cuisineKey)){return cuisines.get(cuisineKey).serveFood(dish);}
       throw new UnservableCuisineRequestException("Unservable cuisine "+cuisineKey+" for dish "+dish);
     }
 }

public class SolutionMatch {
    private static final Scanner INPUT_READER = new Scanner(System.in);
    private static final FoodFactory FOOD_FACTORY = FoodFactory.getFactory();
    
    static {
        FoodFactory.getFactory().registerCuisine("Chinese", new Chinese());
        FoodFactory.getFactory().registerCuisine("Italian", new Italian());
        FoodFactory.getFactory().registerCuisine("Japanese", new Japanese());
        FoodFactory.getFactory().registerCuisine("Mexican", new Mexican());
    }
    
    public static void main(String[] args) {
        int totalNumberOfOrders = Integer.parseInt(INPUT_READER.nextLine());
        while (totalNumberOfOrders-- > 0) {
            String[] food = INPUT_READER.nextLine().split(" ");
            String cuisine = food[0];
            String dish = food[1];

            try {
                if (FOOD_FACTORY.equals(FoodFactory.getFactory())) {
                    Cuisine servedFood = FOOD_FACTORY.serveCuisine(cuisine, dish);

                    switch (cuisine) {
                        case "Chinese":
                            Chinese chineseDish = (Chinese) servedFood;
                            System.out.println("Serving " + chineseDish.getDish() + "(Chinese)");
                            break;
                        case "Italian":
                            Italian italianDish = (Italian) servedFood;
                            System.out.println("Serving " + italianDish.getDish() + "(Italian)");
                            break;
                        case "Japanese":
                            Japanese japaneseDish = (Japanese) servedFood;
                            System.out.println("Serving " + japaneseDish.getDish() + "(Japanese)");
                            break;
                        case "Mexican":
                            Mexican mexicanDish = (Mexican) servedFood;
                            System.out.println("Serving " + mexicanDish.getDish() + "(Mexican)");
                            break;
                        default:
                            break;
                    }
                }
            } catch (UnservableCuisineRequestException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}