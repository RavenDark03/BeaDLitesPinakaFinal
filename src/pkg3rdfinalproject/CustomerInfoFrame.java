/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg3rdfinalproject;
// File: CustomerInfoFrame.java
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CustomerInfoFrame extends JFrame {
    public String customerName = "";
    public String customerEmail = "";
    public String customerContact = "";
    private boolean submitted = false;

    public CustomerInfoFrame() {
        setTitle("Customer Information");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(350, 220);
        setLocationRelativeTo(null);

        JLabel nameLabel = new JLabel("Customer Name:");
        JTextField nameField = new JTextField(20);

        JLabel emailLabel = new JLabel("Email:");
        JTextField emailField = new JTextField(20);

        JLabel contactLabel = new JLabel("Contact Number:");
        JTextField contactField = new JTextField(20);

        JButton submitBtn = new JButton("OK");
        submitBtn.addActionListener(e -> {
            String name = nameField.getText().trim();
            if (name.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Name is required!", "Input Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            customerName = name;
            customerEmail = emailField.getText().trim();
            customerContact = contactField.getText().trim();
            submitted = true;
            dispose();
        });

        JPanel panel = new JPanel(new GridLayout(4, 2, 5, 5));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panel.add(nameLabel);    panel.add(nameField);
        panel.add(emailLabel);   panel.add(emailField);
        panel.add(contactLabel); panel.add(contactField);
        panel.add(new JLabel()); panel.add(submitBtn);

        add(panel);
    }

    public boolean isSubmitted() {
        return submitted;
    }
}
/**
 *
 * @author Lynch
 */

