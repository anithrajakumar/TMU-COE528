package lab1;

/**
 *
 * @Anith Rajakumar
 */
public class Member extends Passenger{
    
    //instance varibale for a member
    private int yearsOfMembership;
    
    //constructor for member class
    public Member(String name, int age, int yearsOfMembership){
        //calling the super function
        super(name, age);
        this.yearsOfMembership = yearsOfMembership;
    }
    
    //method that calculates the discount for the price
    public double applyDiscount(double p){
        double discountPercent;
        if(yearsOfMembership > 5){
            discountPercent = 0.5;
        } else if(yearsOfMembership > 1 && yearsOfMembership <= 5){
            discountPercent = 0.1;
        } else {
            discountPercent = 0;
        }
        
        return p*(1 - discountPercent);
    }
}
