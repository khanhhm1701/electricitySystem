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
public class UserTest {
    
    public UserTest() {
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
     * Test of getTxtTinh method, of class User.
     */
    @Test
    public void testGetTxtTinh() {
        System.out.println("getTxtTinh");
        User instance = new User();
        String expResult = "";
        String result = instance.getTxtTinh();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTxtHuyen method, of class User.
     */
    @Test
    public void testGetTxtHuyen() {
        User instance = new User();
        String expResult = "";
        String result = instance.getTxtHuyen();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTxtXa method, of class User.
     */
    @Test
    public void testGetTxtXa() {
        User instance = new User();
        String expResult = "";
        String result = instance.getTxtXa();
        assertEquals(expResult, result);
    }

    /**
     * Test of getId method, of class User.
     */
    @Test
    public void testGetId() {
        User instance = new User();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setId method, of class User.
     */
    @Test
    public void testSetId() {
        int id = 1;
        User instance = new User();
        instance.setId(id);
        int expResult = 1;
        assertEquals(expResult, instance.getId());
    }
    
    @Test
    public void testSetIdWithNagative() {
        int id = -1;
        User instance = new User();
        Exception exception = assertThrows(Exception.class, () -> instance.setId(id));
    }

    /**
     * Test of getUsername method, of class User.
     */
    @Test
    public void testGetUsername() {
        User instance = new User();
        String expResult = "";
        String result = instance.getUsername();
        assertEquals(expResult, result);
    }

    /**
     * Test of setUsername method, of class User.
     */
    @Test
    public void testSetUsername() {
        String username = "khanh";
        User instance = new User();
        instance.setUsername(username);
        String expResult = "khanh";
        assertEquals(expResult, instance.getUsername());
    }

    /**
     * Test of getPassword method, of class User.
     */
    @Test
    public void testGetPassword() {
        User instance = new User();
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPassword method, of class User.
     */
    @Test
    public void testSetPassword() {
        String password = "12345678";
        User instance = new User();
        instance.setPassword(password);
        String expResult = "12345678";
        assertEquals(expResult, instance.getPassword());
    }

    /**
     * Test of getEmail method, of class User.
     */
    @Test
    public void testGetEmail() {
        User instance = new User();
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
    }

    /**
     * Test of setEmail method, of class User.
     */
    @Test
    public void testSetEmail() {
        String email = "khanh@gmail.com";
        User instance = new User();
        instance.setEmail(email);
        String expResult = "khanh@gmail.com";
        assertEquals(expResult, instance.getEmail());
    }

    /**
     * Test of getTinh method, of class User.
     */
    @Test
    public void testGetTinh() {
        User instance = new User();
        String expResult = "";
        String result = instance.getTinh();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTinh method, of class User.
     */
    @Test
    public void testSetTinh() {
        String tinh = "Thanh Hoa";
        User instance = new User();
        instance.setTinh(tinh);
        String expResult = "Thanh Hoa";
        assertEquals(expResult, instance.getTinh());
    }

    /**
     * Test of getHuyen method, of class User.
     */
    @Test
    public void testGetHuyen() {
        User instance = new User();
        String expResult = "";
        String result = instance.getHuyen();
        assertEquals(expResult, result);
    }

    /**
     * Test of setHuyen method, of class User.
     */
    @Test
    public void testSetHuyen() {
        String huyen = "Thieu Hoa";
        User instance = new User();
        instance.setHuyen(huyen);
        String expResult = "Thieu Hoa";
        assertEquals(expResult, instance.getHuyen());
    }

    /**
     * Test of getXa method, of class User.
     */
    @Test
    public void testGetXa() {
        User instance = new User();
        String expResult = "";
        String result = instance.getXa();
        assertEquals(expResult, result);
    }

    /**
     * Test of setXa method, of class User.
     */
    @Test
    public void testSetXa() {
        String xa = "Thieu Vu";
        User instance = new User();
        instance.setXa(xa);
        String expResult = "Thieu Vu";
        assertEquals(expResult, instance.getXa());
    }

    /**
     * Test of getRole method, of class User.
     */
    @Test
    public void testGetRole() {
        User instance = new User();
        int expResult = 0;
        int result = instance.getRole();
        assertEquals(expResult, result);
    }

    /**
     * Test of setRole method, of class User.
     */
    @Test
    public void testSetRole() {
        int role = 1;
        User instance = new User();
        instance.setRole(role);
        int expResult = 1;
        assertEquals(expResult, instance.getRole());
    }
    
}
