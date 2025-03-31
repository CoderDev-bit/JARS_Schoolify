package schoolify;
import government.Person;
import government.school.students.*;
import javax.swing.*;
import java.awt.CardLayout;

public class StudentRecords extends JPanel {
    // labels
    JLabel lblStudentName = new JLabel("Name: ");
    JLabel lblStudentAge = new JLabel("Age: ");
    JLabel lblStudentAverageGrade = new JLabel("Average Grade: ");
    JLabel lblStudentCreditsEarned = new JLabel("Credits Earned: ");
    JLabel lblStudentLates = new JLabel("Lates: ");
    JLabel lblStudentVolunteerHours = new JLabel("Volunteer Hours: ");
    JLabel lblStudentGraduate = new JLabel("Graduated: ");

    // fields
    JTextField txtStudentName = new JTextField();
    JTextField txtStudentAge = new JTextField();
    JTextField txtStudentAverageGrade = new JTextField();
    JTextField txtStudentCreditsEarned = new JTextField();
    JTextField txtStudentLates = new JTextField();
    JTextField txtStudentVolunteerHours = new JTextField();
    JCheckBox chkStudentGraduate = new JCheckBox();

    public StudentRecords(Student student) {
        setLayout(null); // layout

        // positioning
        lblStudentName.setBounds(20, 20, 150, 50);
        txtStudentName.setBounds(150, 35, 150, 25);

        lblStudentAge.setBounds(20, 70, 150, 50);
        txtStudentAge.setBounds(150, 85, 150, 25);

        lblStudentAverageGrade.setBounds(20, 120, 150, 50);
        txtStudentAverageGrade.setBounds(150, 135, 150, 25);

        lblStudentCreditsEarned.setBounds(20, 170, 150, 50);
        txtStudentCreditsEarned.setBounds(150, 185, 150, 25);

        lblStudentLates.setBounds(20, 220, 150, 50);
        txtStudentLates.setBounds(150, 235, 150, 25);

        lblStudentVolunteerHours.setBounds(20, 270, 150, 50);
        txtStudentVolunteerHours.setBounds(150, 285, 150, 25);

        lblStudentGraduate.setBounds(20, 320, 150, 50);
        chkStudentGraduate.setBounds(150, 335, 25, 25);

        // uneditable
        txtStudentName.setEditable(false);
        txtStudentAge.setEditable(false);
        txtStudentAverageGrade.setEditable(false);
        txtStudentCreditsEarned.setEditable(false);
        txtStudentLates.setEditable(false);
        txtStudentVolunteerHours.setEditable(false);
        chkStudentGraduate.setEnabled(false);

        // filling
        txtStudentName.setText(student.getName());
        txtStudentAge.setText(String.valueOf(student.getAge()));
        txtStudentAverageGrade.setText(String.valueOf(student.getGPA()));
        txtStudentCreditsEarned.setText(String.valueOf(student.getCreditsEarned()));
        //txtStudentLates.setText(String.valueOf(student.getDaysLate()));
        txtStudentVolunteerHours.setText(String.valueOf(student.getVolunteerHoursCompleted()));
        chkStudentGraduate.setSelected(student.getStatus()[1]);

        // adding
        add(lblStudentName);
        add(txtStudentName);
        add(lblStudentAge);
        add(txtStudentAge);
        add(lblStudentAverageGrade);
        add(txtStudentAverageGrade);
        add(lblStudentCreditsEarned);
        add(txtStudentCreditsEarned);
        add(lblStudentLates);
        add(txtStudentLates);
        add(lblStudentVolunteerHours);
        add(txtStudentVolunteerHours);
        add(lblStudentGraduate);
        add(chkStudentGraduate);
    }
}