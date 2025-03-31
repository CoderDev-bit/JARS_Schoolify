package schoolify;

import government.Person;
import government.school.*;
import javax.swing.*;
import java.awt.CardLayout;

public class SelectRole extends JPanel {
    JButton btnSelectStudent = new JButton("Student");
    JButton btnSelectEmployee = new JButton("Employee");

    public SelectRole() {
        setLayout(null);
        btnSelectStudent.setBounds(190, 150, 120, 50);
        btnSelectEmployee.setBounds(190, 250, 120, 50);

        add(btnSelectStudent);
        add(btnSelectEmployee);
    }
}