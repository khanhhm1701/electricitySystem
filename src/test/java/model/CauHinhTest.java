/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package model;

import java.sql.Timestamp;
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
public class CauHinhTest {
    
    public CauHinhTest() {
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
     * Test of getName method, of class CauHinh.
     */
    @Test
    public void testGetName() {
        CauHinh instance = new CauHinh();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class CauHinh.
     */
    @Test
    public void testSetName() {
        String name = "giaDien";
        CauHinh instance = new CauHinh();
        instance.setName(name);
        String expResult = "giaDien";
        assertEquals(expResult, instance.getName());
    }

    /**
     * Test of getType method, of class CauHinh.
     */
    @Test
    public void testGetType() {
        CauHinh instance = new CauHinh();
        int expResult = 0;
        int result = instance.getType();
        assertEquals(expResult, result);
    }

    /**
     * Test of setType method, of class CauHinh.
     */
    @Test
    public void testSetType() {
        int type = 1;
        CauHinh instance = new CauHinh();
        instance.setType(type);
        int expResult = 1;
        assertEquals(expResult, instance.getType());
    }

    /**
     * Test of getId method, of class CauHinh.
     */
    @Test
    public void testGetId() {
        CauHinh instance = new CauHinh();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setId method, of class CauHinh.
     */
    @Test
    public void testSetId() {
        int id = 1;
        CauHinh instance = new CauHinh();
        instance.setId(id);
        int expResult = 1;
        assertEquals(expResult, instance.getId());
    }
    
    @Test
    public void testSetIdWithNagative() {
        int id = -1;
        CauHinh instance = new CauHinh();
        Exception exception = assertThrows(Exception.class, () -> instance.setId(id));
    }

    /**
     * Test of getData method, of class CauHinh.
     */
    @Test
    public void testGetData() {
        CauHinh instance = new CauHinh();
        Item[] expResult = null;
        Item[] result = instance.getData();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of setData method, of class CauHinh.
     */
    @Test
    public void testSetData() {
        Item[] data = {new Item(1, 50000), new Item(2, 40000)};
        CauHinh instance = new CauHinh();
        instance.setData(data);
        Item[] expResult = {new Item(1, 50000), new Item(2, 40000)};
        assertEquals(expResult, instance.getData());
    }

    /**
     * Test of getTime method, of class CauHinh.
     */
    @Test
    public void testGetTime() {
        CauHinh instance = new CauHinh();
        Timestamp expResult = null;
        Timestamp result = instance.getTime();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTime method, of class CauHinh.
     */
    @Test
    public void testSetTime() {
        Timestamp time = Timestamp.valueOf("2023-01-01 00:00:00");
        CauHinh instance = new CauHinh();
        instance.setTime(time);
        Timestamp expResult = Timestamp.valueOf("2023-01-01 00:00:00");
        assertEquals(expResult, instance.getTime());
    }
    
    @Test
    public void testSetTimeInFuture() {
        Timestamp time = Timestamp.valueOf("2050-01-01 00:00:00");
        CauHinh instance = new CauHinh();
        Exception exception = assertThrows(Exception.class, () -> instance.setTime(time));
    }

    /**
     * Test of getStatus method, of class CauHinh.
     */
    @Test
    public void testGetStatus() {
        CauHinh instance = new CauHinh();
        int expResult = 0;
        int result = instance.getStatus();
        assertEquals(expResult, result);
    }

    /**
     * Test of setStatus method, of class CauHinh.
     */
    @Test
    public void testSetStatus() {
        int status = 0;
        CauHinh instance = new CauHinh();
        instance.setStatus(status);
        int expResult = 0;
        assertEquals(expResult, instance.getStatus());
    }
    
}
