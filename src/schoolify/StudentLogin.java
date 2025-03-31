package schoolify;
import government.Person;
import government.school.*;
import javax.swing.*;
import java.awt.CardLayout;

// login panel
public class StudentLogin extends JPanel {
    // labels
    JLabel lblStudentID = new JLabel("Enter Student ID: ");
    JLabel lblStudentPassword = new JLabel("Enter Password: ");

    // fields
    JTextField txtStudentID = new JTextField();
    JTextField txtStudentPassword = new JTextField();

    // button
    JButton btnStudentLogin = new JButton("Login");

    public StudentLogin() {
        setLayout(null); // layout

        // positioning
        lblStudentID.setBounds(20, 20, 150, 50);
        txtStudentID.setBounds(150, 35, 120, 25);
        lblStudentPassword.setBounds(20, 70, 150, 50);
        txtStudentPassword.setBounds(150, 85, 120, 25);
        btnStudentLogin.setBounds(60, 150, 150, 50);

        // adding
        add(lblStudentID);
        add(lblStudentPassword);
        add(txtStudentID);
        add(txtStudentPassword);
        add(btnStudentLogin);
    }
}
