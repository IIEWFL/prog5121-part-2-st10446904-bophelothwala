/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.chat_app_poe_pt2;

import java.util.Scanner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lab_services_student
 */
public class Chat_App_POE_PT2Test {
    
    public Chat_App_POE_PT2Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class Chat_App_POE_PT2.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Chat_App_POE_PT2.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Menu method, of class Chat_App_POE_PT2.
     */
    @Test
    public void testMenu() {
        System.out.println("Menu");
        Scanner input = null;
        User user1 = null;
        Login login = null;
        Chat_App_POE_PT2.Menu(input, user1, login);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
