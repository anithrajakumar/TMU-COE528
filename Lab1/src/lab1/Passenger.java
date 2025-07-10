package lab1;

/**
 *
 * @Anith Rajakumar
 */
public abstract class Passenger {
    //instances variable
    private String name;
    private int age; 
    
    public Passenger(String name, int age){
        //assigning instances variables
        this.name = name;
        this.age = age;
    }
    
    //abstract class for discounts
    public abstract double applyDiscount(double p);
    
    // Getter for name
    public String getName() {
        return this.name;
    }
    
    // Setter for name
    public void setName(String name) {
        this.name = name;
    }
    
    // Getter for age
    public int getAge() {
        return this.age;
    }
    
    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }
}
