/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg3rdfinalproject;
import pkg3rdfinalproject.JavaMailSender;
import javax.mail.MessagingException;

/**
 *
 * @author Lynch
 */
public class ReceiptGenerator {
    public static void main(String[] args) {
        // Test email details
        String recipientEmail = "matthewmarcsantua@gmail.com"; // Replace with actual email
        String emailSubject = "Test Receipt from Java Application";
        String emailMessage = "Dear Customer,\n\n"
                + "This is a test receipt email sent from our Java application.\n"
                + "If you can see this message, the email functionality is working correctly.\n\n"
                + "Thank you for your business!\n"
                + "The Java Application Team";
        
        try {
            // Send the test email
            JavaMailSender.sendEmail(recipientEmail, emailSubject, emailMessage);
            System.out.println("Test email sent successfully to: " + recipientEmail);
        } catch (MessagingException e) {
            System.err.println("Failed to send test email: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    /**
     * Method to generate and send a receipt email
     * @param customerEmail The customer's email address
     * @param receiptDetails The details of the receipt
     * @throws MessagingException if email sending fails
     */
    public static void sendReceiptEmail(String customerEmail, String receiptDetails) throws MessagingException {
        String subject = "Your Purchase Receipt";
        String message = "Thank you for your purchase!\n\n"
                + "Here is your receipt details:\n"
                + receiptDetails
                + "\n\nIf you have any questions, please contact support.";
        
        JavaMailSender.sendEmail(customerEmail, subject, message);
    }
}
