package schoolify;
import government.Person;
import government.school.*;
import javax.swing.*;
import java.awt.CardLayout;

public class StudentLogin extends JPanel {
    // labels
    JLabel lblStudentID = new JLabel("Enter Student ID: ");
    JLabel lblStudentPassword = new JLabel("Enter Password: ");

    // fields
    JTextField txtStudentID = new JTextField();
    JPasswordField txtStudentPassword = new JPasswordField(); // Use JPasswordField for password input

    // button
    JButton btnStudentLogin = new JButton("Login");

    public StudentLogin() {
        // Initialize the GUI components
        initializeGUI();
    }

    // Method to initialize all GUI components
    public void initializeGUI() {
        setLayout(null); // layout

        // positioning
        lblStudentID.setBounds(20, 20, 150, 50);
        txtStudentID.setBounds(150, 35, 120, 25);
        lblStudentPassword.setBounds(20, 70, 150, 50);
        txtStudentPassword.setBounds(150, 85, 120, 25);
        btnStudentLogin.setBounds(60, 150, 150, 50);

        // adding components to the panel
        add(lblStudentID);
        add(lblStudentPassword);
        add(txtStudentID);
        add(txtStudentPassword);
        add(btnStudentLogin);
    }

    // Method to update GUI (if needed for future dynamic updates)
    public void updateGUI() {
        // This can be used in the future to update the fields dynamically
    }
}
