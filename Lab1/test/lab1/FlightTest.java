/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package lab1;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class FlightTest {
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    @Test
    public void testConstructor(){
        Flight instance = new Flight(1, "A", "B", "Fri, Jan 10th 10AM" ,10,1000);
        assertEquals("Flight 1, A to B, Fri, Jan 10th 10AM, original price: 1000.0$", instance.toString());
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testInvalidConstructor(){
        Flight instance = new Flight(1, "A", "A", "Fri, Jan 10th 10AM" ,10,1000);
    }
    
    @Test
    public void testMethods(){
        Flight instance = new Flight(1, "A", "B", "Fri, Jan 10th 10AM", 10, 1000);
        
        instance.setFlightNumber(2);
        assertEquals(2, instance.getFlightNumber());
        
        instance.setOrigin("B");
        assertEquals("B", instance.getOrigin());
        
        instance.setDestination("A");
        assertEquals("A", instance.getDestination());
        
        instance.setDepartureTime("1/1/25 4PM");
        assertEquals("1/1/25 4PM", instance.getDepartureTime());
        
        instance.setCapacity(100);
        assertEquals(100, instance.getCapacity());
        
        instance.setOriginalPrice(2000);
        assertEquals(2000, instance.getOriginalPrice(), 1);
        
        instance.setNumberOfSeatsLeft(10);
        assertEquals(10, instance.getNumberOfSeatsLeft());
        
        assertEquals(true, instance.bookASeat());
        
        assertEquals("Flight 2, B to A, 1/1/25 4PM, original price: 2000.0$", instance.toString());
    }
        
}
