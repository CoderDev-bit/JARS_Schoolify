package schoolify;
import javax.swing.*;
import java.awt.CardLayout;

public class EmployeeLogin extends JPanel {

    // GUI components
    JLabel lblEmployeeID = new JLabel("Enter Employee ID: ");
    JLabel lblEmployeePassword = new JLabel("Enter Password: ");
    JTextField txtEmployeeID = new JTextField();

    JPasswordField txtEmployeePassword = new JPasswordField(); // Use JPasswordField for password input
    JButton btnEmployeeLogin = new JButton("Login");

    // Constructor
    public EmployeeLogin() {
        // Initialize the GUI components
        initializeGUI();
    }

    // Method to initialize all GUI components
    public void initializeGUI() {
        setLayout(null);

        // Set bounds for labels and text fields
        lblEmployeeID.setBounds(20, 20, 150, 50);
        txtEmployeeID.setBounds(150, 35, 120, 25);

        lblEmployeePassword.setBounds(20, 70, 150, 50);
        txtEmployeePassword.setBounds(150, 85, 120, 25);

        btnEmployeeLogin.setBounds(60, 150, 150, 50);

        // Add all components to the panel
        add(lblEmployeeID);
        add(txtEmployeeID);
        add(lblEmployeePassword);
        add(txtEmployeePassword);
        add(btnEmployeeLogin);
    }

    // Method to update GUI (This could be used for populating data dynamically or handling logic)
    public void updateGUI() {}

    // Method to clear the fields when starting a new login attempt
    public void clearFields() {
        txtEmployeeID.setText("");          // Clear Employee ID field
        txtEmployeePassword.setText("");    // Clear Password field
    }
}
