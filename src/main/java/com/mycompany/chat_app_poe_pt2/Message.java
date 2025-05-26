/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chat_app_poe_pt2;

/**
 *
 * @author lab_services_student
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;


public class Message {
    public void start(Scanner input) {
        ArrayList<String> messageIDs = new ArrayList<>();
        ArrayList<String> messageText = new ArrayList<>();
        ArrayList<String> recipientCells = new ArrayList<>();

        HashMap<String, String> messages = new HashMap<>();
        boolean appRunning = true;

        while (appRunning) {
            System.out.println("\nSelect: " +
                    "\n1. Send Messages" +
                    "\n2. Recently sent messages (WIP)" +
                    "\n3. Quit");

            int appOption = input.nextInt();

            switch (appOption) {
                case 1:
                    message(input, messages, messageIDs, recipientCells, messageText);
                    break;
                case 2:
                    System.out.println("\nComing soon...");
                    break;
                case 3:
                    appRunning = false;
                    break;
                default:
                    System.out.println("\nInvalid Option! TRY AGAIN!");
            }
        }
    }

    public static void message(Scanner input, HashMap<String, String> messages,
                               ArrayList<String> messageIDs, ArrayList<String> recipientCells,
                               ArrayList<String> messageTextList) {

        System.out.println("\nDo you want to send a message: " +
                "\n1. Yes" +
                "\n2. No");

        int sendMessageOption = input.nextInt();
        input.nextLine(); // consume newline

        if (sendMessageOption == 1) {
            System.out.println("\nEnter recipient cell number: ");
            String recipientCell = input.nextLine();

            System.out.println("\nEnter message text: ");
            String messageText = input.nextLine();

            String randomMessageID = Integer.toString((int) (Math.random() * 1000000));

            boolean correctMessageID = checkMessageID(randomMessageID, messages);
            boolean validRecipientNumber = checkRecipientCell(recipientCell);
            String messageHash = createMessageHash();

            if (messageText.length() > 250) {
                System.out.println("Message exceeds 250 characters");
            } else if (correctMessageID && validRecipientNumber) {
                System.out.println("Cellphone number successfully captured");
                sentMessage(input, messages, randomMessageID, messageText, recipientCell, messageHash,
                        messageIDs, recipientCells, messageTextList);
                System.out.println("\nMessages sent: " + returnTotalMessages(messages));
                printMessages(messages);
            } else {
                System.out.println("\nMessage not sent!");
            }

        } else if (sendMessageOption == 2) {
            System.out.println("Back to menu");
        } else {
            System.out.println("INVALID!");
        }
    }

    public static boolean checkMessageID(String randomMessageID, HashMap<String, String> messages) {
        if (randomMessageID.length() > 10) {
            System.out.println("\nMessage ID should have 10 characters or less");
            return false;
        }

        if (randomMessageID == null || randomMessageID.isEmpty()) {
            System.out.println("\nMessage ID should not be null or empty");
            return false;
        }

        if (messages.containsKey(randomMessageID)) {
            System.out.println("\nMessage ID should be unique");
            return false;
        }

        return true;
    }

    public static boolean checkRecipientCell(String recipientCell) {
        if (recipientCell.length() > 12) {
            System.out.println("\nRecipient cell number should have 10 characters or less");
            return false;
        }

        if (recipientCell == null || recipientCell.isEmpty()) {
            System.out.println("\nRecipient cell number should not be null or empty");
            return false;
        }

        if (!recipientCell.startsWith("+27")) {
            System.out.println("\nRecipient cell number should start with country code +27");
            return false;
        }

        return true;
    }

    public static String createMessageHash() {
        return Integer.toString((int) (Math.random() * 1000000));
    }

    public static void sentMessage(Scanner input, HashMap<String, String> messages,
                                   String randomMessageID, String messageText, String recipientCell,
                                   String messageHash, ArrayList<String> messageIDs,
                                   ArrayList<String> recipientCells, ArrayList<String> messageTextList) {

        boolean repeat = true;

        while (repeat) {
            System.out.println("\nMessage: " + messageText);
            System.out.println(
                    "\n1. Send Message" +
                    "\n2. Store Message" +
                    "\n3. Discard Message" +
                    "\n4. Continue to send another message" +
                    "\n5. Exit to main menu");

            int messageOption = input.nextInt();
            input.nextLine(); // consume newline

            switch (messageOption) {
                case 1:
                    System.out.println("\nMessage sent successfully!");
                    displayMessageDetails(randomMessageID, messageText, recipientCell, messageHash);
                    addToList(randomMessageID, messageText, recipientCell, messageIDs, messageTextList, recipientCells);
                    break;
                case 2:
                    messages.put(randomMessageID, messageText);
                    System.out.println("\nMessage stored successfully!");
                    addToList(randomMessageID, messageText, recipientCell, messageIDs, messageTextList, recipientCells);
                    break;
                case 3:
                    System.out.println("\nMessage discarded!");
                    break;
                case 4:
                    message(input, messages, messageIDs, recipientCells, messageTextList); // sends another
                    return;
                case 5:
                    repeat = false; // exit loop
                    break;
                default:
                    System.out.println("\nInvalid Option! TRY AGAIN!");
            }
        }
    }

    public static void addToList(String messageID, String messageText, String recipientCell,
                                 ArrayList<String> messageIDs, ArrayList<String> messageTextList,
                                 ArrayList<String> recipientCells) {
        if (!messageIDs.contains(messageID)) {
            messageIDs.add(messageID);
            recipientCells.add(recipientCell);
            messageTextList.add(messageText);
        }
    }

    public static void displayMessageDetails(String id, String text, String recipient, String hash) {
        System.out.println("\nMessage ID: " + id);
        System.out.println("Message Text: " + text);
        System.out.println("Recipient Cell: " + recipient);
        System.out.println("Message Hash: " + hash);
    }

    public static void printMessages(HashMap<String, String> messages) {
        JOptionPane.showMessageDialog(null, messages.toString());
    }

    public static int returnTotalMessages(HashMap<String, String> messages) {
        return messages.size();
    }

    public static void saveMessagesToFile(HashMap<String, String> messages) {
        try (FileWriter fw = new FileWriter("messages.json")) {
            fw.write("{\n");
            int count = 0;
            for (String key : messages.keySet()) {
                String value = messages.get(key).replace("\"", "\\\"");
                fw.write("  \"" + key + "\": \"" + value + "\"");
                if (++count < messages.size()) fw.write(",");
                fw.write("\n");
            }
            fw.write("}");
            System.out.println("Messages saved to file successfully!");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}