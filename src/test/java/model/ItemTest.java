/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Dell m3800
 */
public class ItemTest {
    
    public ItemTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getId method, of class Item.
     */
    @Test
    public void testGetId() {
        Item instance = new Item(1, 50000); // Kh?i t?o ??i t??ng Item v?i id = 1, giá ti?n = 50000
        int expResult = 1;
        int result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setId method, of class Item.
     */
    @Test
    public void testSetId() {
        int id = 2;
        Item instance = new Item(1, 50000);
        instance.setId(id);
        int expResult = 2;
        assertEquals(expResult, instance.getId());
    }
    
   @Test
    public void testSetIdWithNegative() {
        int id = -1;
        Item instance = null;
        Exception exception = assertThrows(Exception.class, () -> instance.setId(id));
    }


    /**
     * Test of getPrice method, of class Item.
     */
    @Test
    public void testGetPrice() {
        Item instance = new Item(1, 50000); // kh?i t?o ??i t??ng Item v?i id = 1, price = 50000
        float expResult = 50000.0F; // giá tr? k? v?ng
        float result = instance.getPrice(); // g?i ph??ng th?c getPrice() c?a ??i t??ng instance
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setPrice method, of class Item.
     */
    @Test
    public void testSetPrice() {
        float price = 100.0F;
        Item instance = new Item(1, 0);
        instance.setPrice(price);
        float expResult = 100.0F;
        assertEquals(expResult, instance.getPrice());
    }
    
}
