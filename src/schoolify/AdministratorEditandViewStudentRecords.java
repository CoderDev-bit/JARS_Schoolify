package schoolify;
import government.Person;
import government.school.*;
import javax.swing.*;
import java.awt.CardLayout;

public class AdministratorEditandViewStudentRecords extends JPanel {

    JLabel lblAdministratorViewEditEnterStudentID = new JLabel("Enter Student ID: ");
    JLabel lblAdministratorViewEditStudentName = new JLabel("Name: ");
    JLabel lblAdministratorViewEditStudentAge = new JLabel("Age: ");
    JLabel lblAdministratorViewEditStudentAverageGrade = new JLabel("Average Grade: ");
    JLabel lblAdministratorViewEditStudentCreditsEarned = new JLabel("Credits Earned: ");
    JLabel lblAdministratorViewEditStudentAbsences = new JLabel("Absences: ");
    JLabel lblAdministratorViewEditStudentLates = new JLabel("Lates: ");
    JLabel lblAdministratorViewEditStudentVolunteerHours = new JLabel("Volunteer Hours: ");
    JLabel lblAdministratorViewEditStudentGraduate = new JLabel("Graduate: ");

    JTextField txtAdministratorViewEditStudentID = new JTextField();
    JTextField txtAdministratorViewEditStudentName = new JTextField();
    JTextField txtAdministratorViewEditStudentAge = new JTextField();
    JTextField txtAdministratorViewEditStudentAverageGrade = new JTextField();
    JTextField txtAdministratorViewEditStudentCreditsEarned = new JTextField();
    JTextField txtAdministratorViewEditStudentAbsences = new JTextField();
    JTextField txtAdministratorViewEditStudentLates = new JTextField();
    JTextField txtAdministratorViewEditStudentVolunteerHours = new JTextField();
    JTextField txtAdministratorViewEditStudentGraduate = new JTextField();

    JButton btnAdministratorEnterStudentID = new JButton("Enter");
    JButton btnAdministratorSaveStudentChanges = new JButton("Save");
    JButton btnAdministratorUndoStudentChanges = new JButton("Undo");

    private Student student;
    private String ogName;
    private int ogAge;
    private int ogAvgGrade;
    private int ogCreditsEarned;
    private int ogAbsences;
    private int ogLates;
    private int ogVolunteerHours;
    private boolean ogGraduated;

    public AdministratorEditandViewStudentRecords(Student student) {
        this.student = student;

        ogName = student.getName();
        ogAge = student.getAge();
        ogAvgGrade = student.getGPA();
        ogCreditsEarned = student.getCreditsEarned();
        ogAbsences = student.getDaysAbsent();
        ogLates = student.getDaysLate();
        ogVolunteerHours = student.getVolunteerHours();
        ogGraduated = student.getGraduate();

        setLayout(null);

        // Set bounds
        lblAdministratorViewEditEnterStudentID.setBounds(20, 20, 150, 50);
        txtAdministratorViewEditStudentID.setBounds(180, 35, 150, 25);

        lblAdministratorViewEditStudentName.setBounds(20, 70, 150, 50);
        txtAdministratorViewEditStudentName.setBounds(180, 85, 150, 25);

        lblAdministratorViewEditStudentAge.setBounds(20, 120, 150, 50);
        txtAdministratorViewEditStudentAge.setBounds(180, 135, 150, 25);

        lblAdministratorViewEditStudentAverageGrade.setBounds(20, 170, 150, 50);
        txtAdministratorViewEditStudentAverageGrade.setBounds(180, 185, 150, 25);

        lblAdministratorViewEditStudentCreditsEarned.setBounds(20, 220, 150, 50);
        txtAdministratorViewEditStudentCreditsEarned.setBounds(180, 235, 150, 25);

        lblAdministratorViewEditStudentAbsences.setBounds(20, 270, 150, 50);
        txtAdministratorViewEditStudentAbsences.setBounds(180, 285, 150, 25);

        lblAdministratorViewEditStudentLates.setBounds(20, 320, 150, 50);
        txtAdministratorViewEditStudentLates.setBounds(180, 335, 150, 25);

        lblAdministratorViewEditStudentVolunteerHours.setBounds(20, 370, 150, 50);
        txtAdministratorViewEditStudentVolunteerHours.setBounds(180, 385, 150, 25);

        lblAdministratorViewEditStudentGraduate.setBounds(20, 420, 150, 50);
        txtAdministratorViewEditStudentGraduate.setBounds(180, 435, 150, 25);

        btnAdministratorEnterStudentID.setBounds(350, 35, 100, 25);
        btnAdministratorSaveChanges.setBounds(350, 435, 150, 30);
        btnAdministratorUndoChanges.setBounds(350, 475, 150, 30);

        // Set editable
        txtAdministratorViewEditStudentID.setEditable(true);
        txtAdministratorViewEditStudentName.setEditable(true);
        txtAdministratorViewEditStudentAge.setEditable(true);
        txtAdministratorViewEditStudentAverageGrade.setEditable(true);
        txtAdministratorViewEditStudentCreditsEarned.setEditable(true);
        txtAdministratorViewEditStudentAbsences.setEditable(true);
        txtAdministratorViewEditStudentLates.setEditable(true);
        txtAdministratorViewEditStudentVolunteerHours.setEditable(true);
        txtAdministratorViewEditStudentGraduate.setEditable(true);

        // Set data from Student object
        txtAdministratorViewEditStudentID.setText(String.valueOf(student.getStudentID()));
        txtAdministratorViewEditStudentName.setText(student.getName());
        txtAdministratorViewEditStudentAge.setText(String.valueOf(student.getAge()));
        txtAdministratorViewEditStudentAverageGrade.setText(String.valueOf(student.getGPA()));
        txtAdministratorViewEditStudentCreditsEarned.setText(String.valueOf(student.getCreditsEarned()));
        txtAdministratorViewEditStudentAbsences.setText(String.valueOf(student.getDaysAbsent()));
        txtAdministratorViewEditStudentLates.setText(String.valueOf(student.getDaysLate()));
        txtAdministratorViewEditStudentVolunteerHours.setText(String.valueOf(student.getVolunteerHoursCompleted()));
        txtAdministratorViewEditStudentGraduate.setText(student.getStatus()[1] ? "Yes" : "No");

        //Save button action
        btnAdministratorSaveStudentChanges.addActionListener(e -> {

            // Save button action
            try {
                student.setStudentName(txtAdministratorViewEditStudentName.getText());
                student.setAge(Integer.parseInt(txtAdministratorViewEditStudentAge.getText()));
                student.setGPA(Double.parseDouble(txtAdministratorViewEditStudentAverageGrade.getText()));
                student.setCreditsEarned(Integer.parseInt(txtAdministratorViewEditStudentCreditsEarned.getText()));
                student.setDaysAbsent(Integer.parseInt(txtAdministratorViewEditStudentAbsences.getText()));
                student.setDaysLate(Integer.parseInt(txtAdministratorViewEditStudentLates.getText()));
                student.setVolunteerHours(Integer.parseInt(txtAdministratorViewEditStudentVolunteerHours.getText()));
                student.setIsGraduated(txtAdministratorViewEditStudentGraduate.getText());


                JOptionPane.showMessageDialog(this, "Changes Saved");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error saving changes: " + e.getMessage());
            }
        });

        // Undo button action
        btnAdministratorUndoStudentChanges.addActionListener(e -> {

            txtAdministratorViewEditStudentName.setText(ogName);
            txtAdministratorViewEditStudentAge.setText(String.valueOf(ogAge));
            txtAdministratorViewEditStudentAverageGrade.setText(String.valueOf(ogAvgGrade));
            txtAdministratorViewEditStudentCreditsEarned.setText(String.valueOf(ogCreditsEarned));
            txtAdministratorViewEditStudentAbsences.setText(String.valueOf(ogAbsences));
            txtAdministratorViewEditStudentLates.setText(String.valueOf(ogLates));
            txtAdministratorViewEditStudentVolunteerHours.setText(String.valueOf(ogVolunteerHours));
            txtAdministratorViewEditStudentGraduate.setText(ogGraduated ? "Yes" : "No");

            JOptionPane.showMessageDialog(this, "Changes reverted");

        });


        // Add to panel
        add(lblAdministratorViewEditEnterStudentID);
        add(txtAdministratorViewEditStudentID);
        add(lblAdministratorViewEditStudentName);
        add(txtAdministratorViewEditStudentName);
        add(lblAdministratorViewEditStudentAge);
        add(txtAdministratorViewEditStudentAge);
        add(lblAdministratorViewEditStudentAverageGrade);
        add(txtAdministratorViewEditStudentAverageGrade);
        add(lblAdministratorViewEditStudentCreditsEarned);
        add(txtAdministratorViewEditStudentCreditsEarned);
        add(lblAdministratorViewEditStudentAbsences);
        add(txtAdministratorViewEditStudentAbsences);
        add(lblAdministratorViewEditStudentLates);
        add(txtAdministratorViewEditStudentLates);
        add(lblAdministratorViewEditStudentVolunteerHours);
        add(txtAdministratorViewEditStudentVolunteerHours);
        add(lblAdministratorViewEditStudentGraduate);
        add(txtAdministratorViewEditStudentGraduate);
        add(btnAdministratorEnterStudentID);
        add(btnAdministratorSaveStudentChanges);
        add(btnAdministratorUndoStudentChanges);
    }
}