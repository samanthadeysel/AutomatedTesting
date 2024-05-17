/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.automatedunittesting;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author lab_services_student
 */
public class UnitTestingTest {
    
    public UnitTestingTest() {
    }

    @Test
    public void testAdditionMethod() {
        
        //create an instance of the class
        UnitTesting ut = new UnitTesting();
        
        int expected = 4;
        int actual = ut.addition(2, 2);
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSubtractionMessage(){
        
        //create an instance of the class
        UnitTesting ut = new UnitTesting();
        
        int expected = 6;
        int actual = ut.subtraction(10, 4);
        
        assertEquals(expected, actual);
    } 
    
    @Test
    public void testMessage(){
        
        //create an instance of the class
        UnitTesting ut = new UnitTesting();
        
        String expected = "Hello World!";
        String actual = ut.Message();
        
        assertEquals(expected, actual);
    }
}
