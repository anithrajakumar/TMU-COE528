package lab1;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @Anith Rajakumar
 */
public class Manager {
    
    //Arrays to hold all flights and all tickets
    ArrayList<Flight> flights = new ArrayList<Flight>();
    ArrayList<Ticket> tickets = new ArrayList<Ticket>();
    
    //scanner to take input
    Scanner input = new Scanner(System.in);
    
    public Manager(){
        // SAMPLE DATA
        flights.add(new Flight(1, "A", "B", "1/1/25 4PM",  10, 1000));
        flights.add(new Flight(2, "A", "B", "1/1/25 8PM",  15, 2000));
        flights.add(new Flight(3, "A", "B", "1/1/25 12AM",  25, 500));
        flights.add(new Flight(4, "C", "D", "1/2/25 2AM",  30, 900));
    }
    
    public void createFlights(){
        int totalFlights;
        flights = new ArrayList<Flight>();
        String flightNumber, origin, destination, departatureTime, tempString, capacity, originalPrice;
        
        System.out.print("How many Flights would you like to create?: ");
        tempString = input.nextLine();
        totalFlights = Integer.parseInt(tempString);
        
        for(int i = 1; i <= totalFlights; i++){
            System.out.println();
            System.out.println("Creating Flight No. " + i);
            
            System.out.print("Please Enter the Flight Number: ");
            flightNumber = input.nextLine();
            
            System.out.print("Please Enter the Origin: ");
            origin = input.nextLine();
                    
            System.out.print("Please Enter the Destination: ");
            destination = input.nextLine();
                    
            System.out.print("Please Enter the Departure Time: ");
            departatureTime = input.nextLine();
                    
            System.out.print("Please Enter Capacity: ");
            capacity = input.nextLine();
                    
            System.out.print("Please Enter Original Price: ");
            originalPrice = input.nextLine();
                    
            flights.add(new Flight(Integer.parseInt(flightNumber), origin, destination, departatureTime, Integer.parseInt(capacity), Double.parseDouble(originalPrice)));
        }
    }
    
    public void displayAvailableFlights(String origin, String destination){
        for(int i = 0; i <= flights.size() - 1; i++){
            //ensures the flight is not fully booked
            if(flights.get(i).getNumberOfSeatsLeft() > 0){
                //Checking to see if the origin and destination are the same
                if(flights.get(i).getOrigin().equals(origin) && flights.get(i).getDestination().equals(destination)){
                    //Printing out the flights details
                    System.out.println(flights.get(i));
                }
            }
        }
    }
    
    
    
    public Flight getFlight(int flightNumber){
        //running through the array of flights
        for(int i = 0; i <= flights.size() - 1; i++){
            // comparing flight numbers to find the one we are looking for
            if(flights.get(i).getFlightNumber() == flightNumber){
                return flights.get(i);
            }
        }
        return null;
    }
    
    
    
    public void bookSeat(int flightNumber, Passenger p){
        //Holds the flight with the given flight number
        Flight tempFlight = this.getFlight(flightNumber);
        Ticket tempTicket;
        
        //Will hold the new value of the ticket
        double ticketPrice;
        
        if(tempFlight.getNumberOfSeatsLeft() > 0 && tempFlight != null){
            ticketPrice = p.applyDiscount(tempFlight.getOriginalPrice());
            tempTicket = new Ticket(p, tempFlight, ticketPrice);
            tickets.add(tempTicket);
            this.getFlight(flightNumber).bookASeat();
        }
    }
    
    public ArrayList<Flight> getAllFlights(){
        return flights;
    }
    
    public ArrayList<Ticket> getAllTickets(){
        return tickets;
    }
    
    
    public static void main(String[] args){
        
        Manager manager = new Manager();
        Scanner input = new Scanner(System.in);
        String answer = "";
        System.out.print("Would you like to create flights (if N sample Data will be used) (Y/N)?: ");
        
        answer = input.nextLine();
        
        if(answer.equals("Y")){
            manager.createFlights();
        } else {
            System.out.println("Sample Data: ");
            System.out.println("Flight 1, A to B, 1/1/25 4PM, original price: 1000.0$\n" +
"Flight 2, A to B, 1/1/25 8PM, original price: 2000.0$\n" +
"Flight 3, A to B, 1/1/25 12AM, original price: 500.0$\n"
                    + "Flight 4, C to D, 1/2/25 2AM, original price: 900.0$");
        }
            
        
        
        
        
        Member m1 = new Member("Bob", 45, 10);
        Member m2 = new Member("Steve", 37, 4);
        
        NonMember nm1 = new NonMember("Stacey", 32);
        NonMember nm2 = new NonMember("Karen", 48);
        
        System.out.println("");
        System.out.println("Displaying Flights from A to B: ");
        
        manager.displayAvailableFlights("A", "B");
        
        manager.bookSeat(1, m1);
        manager.bookSeat(2, m1);
        
        manager.bookSeat(1, nm1);
        manager.bookSeat(2, nm1);
        
        manager.bookSeat(1, m2);
        
        manager.bookSeat(2, nm2);
        
        System.out.println("");
        
        System.out.print("Which flight would you like to display (flight number)?: ");
        answer = input.nextLine();
        
        
        System.out.println("Displaying Flight Number " + Integer.parseInt(answer) + ": ");
        System.out.println(manager.getFlight(Integer.parseInt(answer)));
        
        System.out.println("");
        
        System.out.print("Which flight's seat left would you like to display (flight number)?: ");
        answer = input.nextLine();
        
        System.out.print("Displaying Seats Left on Flight Number " + Integer.parseInt(answer) + ": ");
        System.out.println(manager.getFlight(Integer.parseInt(answer)).getNumberOfSeatsLeft());
        
        System.out.println("\nNow printing all flights: ");
        for(int i = 0; i <  manager.getAllFlights().size(); i++){
            System.out.println(manager.getAllFlights().get(i));
        }
        
        System.out.println("\nNow printing all tickets: ");
        for(int i = 0; i <  manager.getAllTickets().size(); i++){
            System.out.println(manager.getAllTickets().get(i));
        }  
        
    }
    
}
