package lab4;

/**
 *
 * @Anith Rajakumar
 */
public class FoodItem extends FoodComponent {
    
    //instance varibale
    private double price;
    
    //constructor
    public FoodItem(String name, double price){
        super(name);
        this.price = price;
    }
    
    @Override
    public double getPrice(){
        return price;
    }
    
    @Override
    public void print(int level){
        for(int i = 0; i < level; i++){
            System.out.print("\t");
        }
        System.out.println("FoodItem: " + this.name + ", " + this.price);
    }
}
