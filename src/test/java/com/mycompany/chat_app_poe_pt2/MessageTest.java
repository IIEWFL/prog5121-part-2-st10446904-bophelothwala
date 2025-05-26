/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.chat_app_poe_pt2;

import java.util.ArrayList;
import java.util.HashMap;
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
public class MessageTest {
    
    public MessageTest() {
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

    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of start method, of class Message.
     */
    @Test
    public void testStart() {
        System.out.println("start");
        Scanner input = null;
        Message instance = new Message();
        instance.start(input);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of message method, of class Message.
     */
    @Test
    public void testMessage() {
        System.out.println("message");
        Scanner input = null;
        HashMap<String, String> messages = null;
        ArrayList<String> messageIDs = null;
        ArrayList<String> recipientCells = null;
        ArrayList<String> messageTextList = null;
        Message.message(input, messages, messageIDs, recipientCells, messageTextList);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of checkMessageID method, of class Message.
     */
    @Test
    public void testCheckMessageID() {
        System.out.println("checkMessageID");
        String randomMessageID = "";
        HashMap<String, String> messages = null;
        boolean expResult = true;
        boolean result = Message.checkMessageID(randomMessageID, messages);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(result == true);
    }

    /**
     * Test of checkRecipientCell method, of class Message.
     */
    @Test
    public void testCheckRecipientCell() {
        System.out.println("checkRecipientCell");
        String recipientCell = "";
        boolean expResult = true;
        boolean result = Message.checkRecipientCell(recipientCell);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(result == true);
    }

    /**
     * Test of createMessageHash method, of class Message.
     */
    @Test
    public void testCreateMessageHash() {
        System.out.println("createMessageHash");
        String expResult = "";
        String result = Message.createMessageHash();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of sentMessage method, of class Message.
     */
    @Test
    public void testSentMessage() {
        System.out.println("sentMessage");
        Scanner input = null;
        HashMap<String, String> messages = null;
        String randomMessageID = "";
        String messageText = "";
        String recipientCell = "+27718693002";
        String messageHash = "";
        ArrayList<String> messageIDs = null;
        ArrayList<String> recipientCells = null;
        ArrayList<String> messageTextList = null;
        Message.sentMessage(input, messages, randomMessageID, messageText, recipientCell, messageHash, messageIDs, recipientCells, messageTextList);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of addToList method, of class Message.
     */
    @Test
    public void testAddToList() {
        System.out.println("addToList");
        String messageID = "";
        String messageText = "";
        String recipientCell = "";
        ArrayList<String> messageIDs = null;
        ArrayList<String> messageTextList = null;
        ArrayList<String> recipientCells = null;
        Message.addToList(messageID, messageText, recipientCell, messageIDs, messageTextList, recipientCells);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of displayMessageDetails method, of class Message.
     */
    @Test
    public void testDisplayMessageDetails() {
        System.out.println("displayMessageDetails");
        String id = "";
        String text = "";
        String recipient = "";
        String hash = "";
        Message.displayMessageDetails(id, text, recipient, hash);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of printMessages method, of class Message.
     */
    @Test
    public void testPrintMessages() {
        System.out.println("printMessages");
        HashMap<String, String> messages = null;
        Message.printMessages(messages);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of returnTotalMessages method, of class Message.
     */
    @Test
    public void testReturnTotalMessages() {
        System.out.println("returnTotalMessages");
        HashMap<String, String> messages = null;
        int expResult = 0;
        int result = Message.returnTotalMessages(messages);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of saveMessagesToFile method, of class Message.
     */
    @Test
    public void testSaveMessagesToFile() {
        System.out.println("saveMessagesToFile");
        HashMap<String, String> messages = null;
        Message.saveMessagesToFile(messages);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
