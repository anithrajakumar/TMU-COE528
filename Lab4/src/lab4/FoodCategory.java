package lab4;

/**
 *
 * @Anith Rajakumar
 */
import java.util.ArrayList;

public class FoodCategory extends FoodComponent{
    
    // Array list to hold food compnonments 
    private ArrayList<FoodComponent> components = new ArrayList<>();
    
    //constructor
    public FoodCategory(String name){
        super(name);
    }
    
    // Method to add new item onto the array list
    public void add(FoodComponent item){
        components.add(item);
    }
    
    // Method to remove an item onto the array list
    public void removeComponent(FoodComponent item){
        components.remove(item);
    }
    
    @Override
    public double getPrice(){
        double totalPrice = 0;
        
        //Running through each item in the array list
        for(FoodComponent items : components){
            //Adding up the price of each item
            totalPrice += items.getPrice();
        }
        return totalPrice;
    }
    
    @Override
    public void print(int level){
        for(int i = 0; i < level; i++){
            System.out.print("\t");
        }
        System.out.println("FoodCategory (" + name + ", " + this.getPrice() + ") contains:");
        
        for(FoodComponent items : components){
            items.print(level+1);
        }
    }
}
