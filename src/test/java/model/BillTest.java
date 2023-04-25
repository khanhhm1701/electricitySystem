/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package model;


import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Dell m3800
 */
public class BillTest {
    
    public BillTest() {
    }

    /**
     *
     * @throws Exception
     */
    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    
   

    /**
     * Test of getUser method, of class Bill.
     */
    @org.junit.jupiter.api.Test
    public void testGetUser() {
        Bill instance = new Bill();
        User expResult = null;
        User result = instance.getUser();
        assertEquals(expResult, result);
    }

    /**
     * Test of setUser method, of class Bill.
     */
    @org.junit.jupiter.api.Test
    public void testSetUser() {
        User user = new User(1, "khanh", "1234", "khanh@gmail.com", "HaNoi", "HaDong", "MoLao", 3);
        Bill instance = new Bill();
        instance.setUser(user);
        User expectedUser = new User(1, "khanh", "1234", "khanh@gmail.com", "HaNoi", "HaDong", "MoLao", 3);
        assertEquals(expectedUser, instance.getUser());
    }

    /**
     * Test of getId method, of class Bill.
     */
    @org.junit.jupiter.api.Test
    public void testGetId() {
        System.out.println("getId");
        Bill instance = new Bill();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of getReceiveEmai method, of class Bill.
     */
    @org.junit.jupiter.api.Test
    public void testGetReceiveEmai() {
        System.out.println("getReceiveEmai");
        Bill instance = new Bill();
        String expResult = "";
        String result = instance.getReceiveEmai();
        assertEquals(expResult, result);
    }

    /**
     * Test of setReceiveEmai method, of class Bill.
     */
    @org.junit.jupiter.api.Test
    public void testSetReceiveEmai() {
        System.out.println("setReceiveEmai");
        String receiveEmai = "khanh@gmail.com";
        Bill instance = new Bill();
        instance.setReceiveEmai(receiveEmai);
        String expected  = "khanh@gmail.com";
        assertEquals(expected, instance.getReceiveEmai());
    }

    /**
     * Test of setId method, of class Bill.
     */
    @org.junit.jupiter.api.Test
    public void testSetId() {
        System.out.println("setId");
        int id = 5;
        Bill instance = new Bill();
        instance.setId(id);
        int expectedId  = 5;
        assertEquals(expectedId, instance.getId());
    }

    /**
     * Test of getSodien method, of class Bill.
     */
    @org.junit.jupiter.api.Test
    public void testGetSodien() {
        System.out.println("getSodien");
        Bill instance = new Bill();
        int expResult = 0;
        int result = instance.getSodien();
        assertEquals(expResult, result);
    }

    /**
     * Test of setSodien method, of class Bill.
     */
    @org.junit.jupiter.api.Test
    public void testSetSodien() {
        System.out.println("setSodien");
        int sodien = 100;
        Bill instance = new Bill();
        instance.setSodien(sodien);
        int expectedSodien = 100;
        assertEquals(expectedSodien, instance.getSodien());
    }
    
   @org.junit.jupiter.api.Test
    public void testSetSodienWithNegative() {
        int sodien = -100;
        Bill instance = new Bill();
        Exception exception = assertThrows(Exception.class, () -> instance.setSodien(sodien));
    }

    /**
     * Test of getTongtien method, of class Bill.
     */
    @org.junit.jupiter.api.Test
    public void testGetTongtien() {
        Bill instance = new Bill();
        int expResult = 0;
        int result = instance.getTongtien();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTongtien method, of class Bill.
     */
    @org.junit.jupiter.api.Test
    public void testSetTongtien() {
        int tongtien = 500000;
        Bill instance = new Bill();
        instance.setTongtien(tongtien);
        int expectedTongtien = 500000;
        assertEquals(expectedTongtien, instance.getTongtien());
    }
    
    @org.junit.jupiter.api.Test
    public void testSetTongtienWithNagative() {
        int tongtien = -500000;
        Bill instance = new Bill();
        Exception exception = assertThrows(Exception.class, () -> instance.setTongtien(tongtien));
    }

    /**
     * Test of getMonth method, of class Bill.
     */
    @org.junit.jupiter.api.Test
    public void testGetMonth() {
        Bill instance = new Bill();
        int expResult = 0;
        int result = instance.getMonth();
        assertEquals(expResult, result);
    }
    

    /**
     * Test of setMonth method, of class Bill.
     */
    @org.junit.jupiter.api.Test
    public void testSetMonth() {
        System.out.println("setMonth");
        int month = 8;
        Bill instance = new Bill();
        instance.setMonth(month);
        int expectedMonth = 8;
        assertEquals(expectedMonth, instance.getMonth());
    }
    
    @org.junit.jupiter.api.Test
    public void testSetMonthWithNagative() {
        int month = -8;
        Bill instance = new Bill();
        Exception exception = assertThrows(Exception.class, () -> instance.setMonth(month));
    }
    
    @org.junit.jupiter.api.Test
    public void testSetMonthWithLarge() {
        int month = 15;
        Bill instance = new Bill();
        Exception exception = assertThrows(Exception.class, () -> instance.setMonth(month));
    }

    /**
     * Test of getYear method, of class Bill.
     */
    @org.junit.jupiter.api.Test
    public void testGetYear() {
        Bill instance = new Bill();
        int expResult = 0;
        int result = instance.getYear();
        assertEquals(expResult, result);
    }

    /**
     * Test of setYear method, of class Bill.
     */
    @org.junit.jupiter.api.Test
    public void testSetYear() {
        int year = 2023;
        Bill instance = new Bill();
        instance.setYear(year);
        int expectedYear = 2023;
        assertEquals(expectedYear, instance.getYear());
    }
    
    @org.junit.jupiter.api.Test
    public void testSetYearWithNagative() {
        int year = -2023;
        Bill instance = new Bill();
        Exception exception = assertThrows(Exception.class, () -> instance.setYear(year));
    }
    
    @org.junit.jupiter.api.Test
    public void testSetYearInFuture() {
        int year = 2123;
        Bill instance = new Bill();
        Exception exception = assertThrows(Exception.class, () -> instance.setYear(year));
    }

    /**
     * Test of getStatus method, of class Bill.
     */
    @org.junit.jupiter.api.Test
    public void testGetStatus() {
        Bill instance = new Bill();
        int expResult = 0;
        int result = instance.getStatus();
        assertEquals(expResult, result);
    }

    /**
     * Test of setStatus method, of class Bill.
     */
    @org.junit.jupiter.api.Test
    public void testSetStatus() {
        int status = 1;
        Bill instance = new Bill();
        instance.setStatus(status);
        int expectedResult = 1;
        assertEquals(expectedResult, instance.getStatus());
    }
    

    /**
     * Test of getUserId method, of class Bill.
     */
    @org.junit.jupiter.api.Test
    public void testGetUserId() {
        Bill instance = new Bill();
        int expResult = 0;
        int result = instance.getUserId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setUserId method, of class Bill.
     */
    @org.junit.jupiter.api.Test
    public void testSetUserId() {
        int userId = 10;
        Bill instance = new Bill();
        instance.setUserId(userId);
        int expectedResult = 10;
        assertEquals(expectedResult, instance.getUserId());
    }
    
}
