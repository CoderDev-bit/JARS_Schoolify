package schoolify;

import government.Person;
import government.school.*;
import javax.swing.*;
import java.awt.CardLayout;

public class SelectRole extends JPanel {

    // GUI components
    JButton btnSelectStudent = new JButton("Student");
    JButton btnSelectEmployee = new JButton("Employee");

    // Constructor
    public SelectRole() {
        // Initialize the GUI components
        initializeGUI();
    }

    // Method to initialize all GUI components
    public void initializeGUI() {
        setLayout(null);

        // Set bounds for buttons
        btnSelectStudent.setBounds(190, 150, 120, 50);
        btnSelectEmployee.setBounds(190, 250, 120, 50);

        // Add buttons to the panel
        add(btnSelectStudent);
        add(btnSelectEmployee);
    }

    // Method to update GUI (if needed, for future updates or dynamic data)
    public void updateGUI() {
        // If you need to update any dynamic data in the future, you can implement it here
    }
}
