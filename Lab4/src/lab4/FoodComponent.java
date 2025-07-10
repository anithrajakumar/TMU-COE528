package lab4;

/**
 *
 * @Anith Rajakumar
 */
public abstract class FoodComponent {
    
    //instance variable
    protected String name;
    
    //constructor 
    protected FoodComponent(String name){
        this.name = name;
    }
    
    //abstract methods
    public abstract double getPrice();
    public abstract void print(int level);
}
