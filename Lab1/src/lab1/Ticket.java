package lab1;

/**
 *
 * @Anith Rajakumar
 */
public class Ticket {
    private Passenger passenger;
    private Flight flight;
    private double price;
    private int number;
    private static int counter = 1; 
    
    public Ticket(Passenger p, Flight flight, double price){
        //assigning instance variable
        this.passenger = p;
        this.flight = flight;
        this.price = price; 
        
        //Setting the ticket number then increasing by 1
        number = counter;
        counter++; 
    }
    
    // Getter for passenger
    public Passenger getPassenger() {
        return this.passenger;
    }
    
    // Setter for passenger
    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }
    
    // Getter for flight
    public Flight getFlight() {
        return this.flight;
    }
    
    // Setter for flight
    public void setFlight(Flight flight) {
        this.flight = flight;
    }
    
    // Getter for price
    public double getPrice() {
        return this.price;
    }
    
    // Setter for price
    public void setPrice(double price) {
        this.price = price;
    }
    
     // Getter for number
    public int getNumber() {
        return this.number;
    }
    
    // Setter for number
    public void setNumber(int number) {
        this.number = number;
    }
    
    //to string method for Ticket
    @Override
    public String toString(){
        String s = "";
        s += passenger.getName() + ", " + this.flight + ", " + "ticket price: $" + this.price;
        
        return s;
    }
}
