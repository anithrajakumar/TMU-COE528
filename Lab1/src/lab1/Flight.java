package lab1;

/**
 *
 * @Anith Rajakumar
 */
public class Flight {
    //Instance variables
    private int flightNumber;
    private String origin;
    private String destination;
    private String departureTime;
    private int capacity;
    private int numberOfSeatsLeft;
    private double originalPrice;
    
    //constructor
    public Flight(int flightNumber, String origin, String destination,
                  String departureTime, int capacity, double originalPrice){
                      
        if(origin.equals(destination)){
            throw new IllegalArgumentException("Destination and Origin can not be the same");
        }
        
        //Assigning Instance 
        this.flightNumber = flightNumber;
        this.origin = origin;
        this.destination = destination;
        this.departureTime = departureTime;
        this.capacity = capacity;
        this.originalPrice = originalPrice;
        
        //Assigning Number of seats left
        this.numberOfSeatsLeft = capacity;
    }
    
    //Method to book a seat
    public boolean bookASeat(){
        //Checking to see if a seat is available 
        if(this.numberOfSeatsLeft > 0){
            this.numberOfSeatsLeft -= 1;
            return true;
        } else {
            return false;
        }
    }
    
    // Getter for flight Number
    public int getFlightNumber() {
        return this.flightNumber;
    }
    
    // Setter for flight Number
    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }
    
    // Getter for origin
    public String getOrigin() {
        return this.origin;
    }
    
    // Setter for origin
    public void setOrigin(String origin) {
        this.origin = origin;
    }
    
    // Getter for destination
    public String getDestination() {
        return this.destination;
    }
    
    // Setter for destination
    public void setDestination(String destination) {
        this.destination = destination;
    }
    
    // Getter for departure Time
    public String getDepartureTime() {
        return this.departureTime;
    }
    
    // Setter for departure Time
    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }
    
    // Getter for capacity
    public int getCapacity() {
        return this.capacity;
    }
    
    // Setter for capacity
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    
    // Getter for number Of Seats Left
    public int getNumberOfSeatsLeft() {
        return this.numberOfSeatsLeft;
    }
    
    // Setter for number Of Seats Left
    public void setNumberOfSeatsLeft(int numberOfSeatsLeft) {
        this.numberOfSeatsLeft = numberOfSeatsLeft;
    }
    
    // Getter for original Price
    public double getOriginalPrice() {
        return this.originalPrice;
    }
    
    // Setter for original Price
    public void setOriginalPrice(double originalPrice) {
        this.originalPrice = originalPrice;
    }
    
    @Override
    public String toString(){
        String s = "";
        
        s += "Flight " + this.flightNumber + ", ";
        s += this.origin + " to " + this.destination + ", ";
        s += this.departureTime + ", ";
        s += "original price: " + this.originalPrice + "$";
        
        return s;
    }
}
