package schoolify;

import government.Person;
import government.school.*;
import government.school.staff.*;
import javax.swing.*;
import java.awt.CardLayout;

// Teacher panel
public class TeacherRecords extends JPanel {
    // Labels
    JLabel lblTeacherName = new JLabel("Name: ");
    JLabel lblTeacherAge = new JLabel("Age: ");
    JLabel lblTeacherDepartment = new JLabel("Department: ");
    JLabel lblTeacherShiftInterval = new JLabel("Shift Interval: ");
    JLabel lblTeacherYearsEmployed = new JLabel("Years Employed: ");
    JLabel lblTeacherAnnualSalary = new JLabel("Annual Salary: ");
    JLabel lblTeachingCertificate = new JLabel("Teaching Certificate: ");
    JLabel lblCoursesTaught = new JLabel("Courses Taught: ");

    // Fields
    JTextField txtTeacherName = new JTextField();
    JTextField txtTeacherAge = new JTextField();
    JTextField txtTeacherDepartment = new JTextField();
    JTextField txtTeacherShiftInterval = new JTextField();
    JTextField txtTeacherYearsEmployed = new JTextField();
    JTextField txtTeacherAnnualSalary = new JTextField();
    JTextField txtTeachingCertificate = new JTextField();
    JTextField txtCoursesTaught = new JTextField();

    // Constructor that accepts a Teacher object as a parameter
    public TeacherRecords(Teacher teacher) {
        // Initialize the GUI components
        initializeGUI();

        // Update the GUI with real data from the Teacher object
        updateGUI(teacher);
    }

    // Method to initialize all GUI components
    public void initializeGUI() {
        setLayout(null); // Layout

        // Positioning
        lblTeacherName.setBounds(20, 20, 150, 50);
        txtTeacherName.setBounds(150, 35, 150, 25);

        lblTeacherAge.setBounds(20, 70, 150, 50);
        txtTeacherAge.setBounds(150, 85, 150, 25);

        lblTeacherDepartment.setBounds(20, 120, 150, 50);
        txtTeacherDepartment.setBounds(150, 135, 150, 25);

        lblTeacherShiftInterval.setBounds(20, 170, 150, 50);
        txtTeacherShiftInterval.setBounds(150, 185, 150, 25);

        lblTeacherYearsEmployed.setBounds(20, 220, 150, 50);
        txtTeacherYearsEmployed.setBounds(150, 235, 150, 25);

        lblTeacherAnnualSalary.setBounds(20, 270, 150, 50);
        txtTeacherAnnualSalary.setBounds(150, 285, 150, 25);

        lblTeachingCertificate.setBounds(20, 320, 150, 50);
        txtTeachingCertificate.setBounds(150, 335, 150, 25);

        lblCoursesTaught.setBounds(20, 370, 150, 50);
        txtCoursesTaught.setBounds(150, 385, 150, 25);

        // Set fields to be uneditable
        txtTeacherName.setEditable(false);
        txtTeacherAge.setEditable(false);
        txtTeacherDepartment.setEditable(false);
        txtTeacherShiftInterval.setEditable(false);
        txtTeacherYearsEmployed.setEditable(false);
        txtTeacherAnnualSalary.setEditable(false);
        txtTeachingCertificate.setEditable(false);
        txtCoursesTaught.setEditable(false);

        // Add components to the panel
        add(lblTeacherName);
        add(txtTeacherName);
        add(lblTeacherAge);
        add(txtTeacherAge);
        add(lblTeacherDepartment);
        add(txtTeacherDepartment);
        add(lblTeacherShiftInterval);
        add(txtTeacherShiftInterval);
        add(lblTeacherYearsEmployed);
        add(txtTeacherYearsEmployed);
        add(lblTeacherAnnualSalary);
        add(txtTeacherAnnualSalary);
        add(lblTeachingCertificate);
        add(txtTeachingCertificate);
        add(lblCoursesTaught);
        add(txtCoursesTaught);
    }

    // Method to update the GUI with real data from the Teacher object
    public void updateGUI(Teacher teacher) {
        txtTeacherName.setText(teacher.getName());
        txtTeacherAge.setText(String.valueOf(teacher.getAge()));
        txtTeacherDepartment.setText(teacher.getDepartment());
        txtTeacherShiftInterval.setText(String.join(" - ", teacher.getShiftInterval()));
        txtTeacherYearsEmployed.setText(String.valueOf(teacher.getYearsEmployed()));
        txtTeacherAnnualSalary.setText(String.valueOf(teacher.getAnnualSalary()));
        txtTeachingCertificate.setText(teacher.getTeachingCertification());
        // Uncomment the following line if courses taught are available
        // txtCoursesTaught.setText(String.join(" - ", teacher.getSubjectsTaught()));
    }
}
