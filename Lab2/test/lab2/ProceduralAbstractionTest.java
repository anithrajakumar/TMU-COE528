/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package lab2;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @Anith Rajakumar
 */
public class ProceduralAbstractionTest {
    
    public ProceduralAbstractionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    
    @Test
    public void reverseFactorialTest() {
        ProceduralAbstraction instance = new ProceduralAbstraction();
        assertEquals(4, instance.reverseFactorial(24));
        assertEquals(5, instance.reverseFactorial(119));
        assertEquals(0, instance.reverseFactorial(1));
    }
    
    @Test
    public void isMatrixNiceTest(){
        int[][] arr = {{2, 7, 6},
                       {9, 5, 1},
                       {4, 3, 8}};
        
        int[][] arr2 = {{0, 0, 0},
                       {0, 0, 0},
                       {0, 0, 0}};
        
        int[][] arr3 = {{0, 0, 0},
                       {0, 0, 0},
                       {0, 0, 0},
                       {0, 0, 0}};
        
        int[][] arr4 = {{-3, 1, 0},
                       {4, -3, 4},
                       {7, -9, 0}};
        
        int[][] arr5 = {{3}};
        
        ProceduralAbstraction instance = new ProceduralAbstraction();
        assertTrue(instance.isMatrixNice(arr));
        assertTrue(instance.isMatrixNice(arr2));
        assertFalse(instance.isMatrixNice(arr3));
        assertFalse(instance.isMatrixNice(arr4));
        assertTrue(instance.isMatrixNice(arr5));
    }
    
}
