package lab1;

/**
 *
 * @Anith Rajakumar
 */
public class NonMember extends Passenger{
    
    //constructor for NonMember class
    public NonMember(String name, int age){
       super(name, age);
    }
    
    //method that calculates the discount for the price
    public double applyDiscount(double p){
        double discountPercent;
        
        if(this.getAge() > 65){
            discountPercent = 0.1;
        } else {
            discountPercent = 0;
        }
            
        return p*(1 - discountPercent);
    }
}
