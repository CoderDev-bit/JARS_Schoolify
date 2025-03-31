package schoolify;
import government.school.students.*;
import javax.swing.*;

public class AdministratorEditandViewStudentRecords extends JPanel {

    // GUI components
    JLabel lblAdministratorViewEditEnterStudentID = new JLabel("Enter Student ID: ");
    JLabel lblAdministratorViewEditStudentName = new JLabel("Name: ");
    JLabel lblAdministratorViewEditStudentAge = new JLabel("Age: ");
    JLabel lblAdministratorViewEditStudentAverageGrade = new JLabel("Average Grade: ");
    JLabel lblAdministratorViewEditStudentCreditsEarned = new JLabel("Credits Earned: ");
    JLabel lblAdministratorViewEditStudentAbsences = new JLabel("Absences: ");
    JLabel lblAdministratorViewEditStudentLates = new JLabel("Lates: ");
    JLabel lblAdministratorViewEditStudentVolunteerHours = new JLabel("Volunteer Hours: ");
    JLabel lblAdministratorViewEditStudentGraduate = new JLabel("Graduate: ");

    public JTextField txtAdministratorViewEditStudentID = new JTextField();
    public JTextField txtAdministratorViewEditStudentName = new JTextField();
    public JTextField txtAdministratorViewEditStudentAge = new JTextField();
    public JTextField txtAdministratorViewEditStudentAverageGrade = new JTextField();
    public JTextField txtAdministratorViewEditStudentCreditsEarned = new JTextField();
    public JTextField txtAdministratorViewEditStudentAbsences = new JTextField();
    public JTextField txtAdministratorViewEditStudentLates = new JTextField();
    public JTextField txtAdministratorViewEditStudentVolunteerHours = new JTextField();
    public JTextField txtAdministratorViewEditStudentGraduate = new JTextField();

    public JButton btnAdministratorEnterStudentID = new JButton("Enter");
    public JButton btnAdministratorSaveStudentChanges = new JButton("Save");
    public JButton btnAdministratorUndoStudentChanges = new JButton("Undo");

    private Student student;  // Holds the student object data

    // Original values for the undo feature
    private String ogName;
    private int ogAge;
    private int ogAvgGrade;
    private int ogCreditsEarned;
    private int ogAbsences;
    private int ogLates;
    private int ogVolunteerHours;
    private boolean ogGraduated;

    // Constructor that accepts the Student object as a parameter
    public AdministratorEditandViewStudentRecords(Student student) {
        this.student = student;

        // Set original values from the student object
        ogName = student.getName();
        ogAge = student.getAge();
        ogAvgGrade = (int) student.getGPA();
        ogCreditsEarned = student.getCreditsEarned();
        ogVolunteerHours = student.getVolunteerHoursCompleted();
        ogGraduated = student.getStatus()[1];

        // Initialize the GUI components
        initializeGUI();

        // Update the GUI with real data from the Student object
        updateGUI();
    }

    // Method to initialize all GUI components
    public void initializeGUI() {
        setLayout(null);

        // Set bounds for labels and text fields
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
        btnAdministratorSaveStudentChanges.setBounds(350, 435, 150, 30);
        btnAdministratorUndoStudentChanges.setBounds(350, 475, 150, 30);

        // Set editable fields
        txtAdministratorViewEditStudentID.setEditable(true);
        txtAdministratorViewEditStudentName.setEditable(true);
        txtAdministratorViewEditStudentAge.setEditable(true);
        txtAdministratorViewEditStudentAverageGrade.setEditable(true);
        txtAdministratorViewEditStudentCreditsEarned.setEditable(true);
        txtAdministratorViewEditStudentAbsences.setEditable(true);
        txtAdministratorViewEditStudentLates.setEditable(true);
        txtAdministratorViewEditStudentVolunteerHours.setEditable(true);
        txtAdministratorViewEditStudentGraduate.setEditable(true);

        // Add all components to the panel
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

    // Method to update the GUI with the student data
    public void updateGUI() {
        // Set text fields with the student data
        txtAdministratorViewEditStudentID.setText(String.valueOf(student.getID()));
        txtAdministratorViewEditStudentName.setText(student.getName());
        txtAdministratorViewEditStudentAge.setText(String.valueOf(student.getAge()));
        txtAdministratorViewEditStudentAverageGrade.setText(String.valueOf(student.getGPA()));
        txtAdministratorViewEditStudentCreditsEarned.setText(String.valueOf(student.getCreditsEarned()));
        txtAdministratorViewEditStudentVolunteerHours.setText(String.valueOf(student.getVolunteerHoursCompleted()));
        txtAdministratorViewEditStudentGraduate.setText(student.getStatus()[1] ? "Yes" : "No");
    }

    // Save button action
    public void saveStudentChanges() {
        try {
            student.setName(txtAdministratorViewEditStudentName.getText());
            student.setAge(Integer.parseInt(txtAdministratorViewEditStudentAge.getText()));
            student.setVolunteerHours(Integer.parseInt(txtAdministratorViewEditStudentVolunteerHours.getText()));

            JOptionPane.showMessageDialog(this, "Changes Saved");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error saving changes: " + ex.getMessage());
        }
    }

    // Undo button action
    public void undoStudentChanges() {
        // Revert the text fields to original values
        txtAdministratorViewEditStudentName.setText(ogName);
        txtAdministratorViewEditStudentAge.setText(String.valueOf(ogAge));
        txtAdministratorViewEditStudentAverageGrade.setText(String.valueOf(ogAvgGrade));
        txtAdministratorViewEditStudentCreditsEarned.setText(String.valueOf(ogCreditsEarned));
        txtAdministratorViewEditStudentAbsences.setText(String.valueOf(ogAbsences));
        txtAdministratorViewEditStudentLates.setText(String.valueOf(ogLates));
        txtAdministratorViewEditStudentVolunteerHours.setText(String.valueOf(ogVolunteerHours));
        txtAdministratorViewEditStudentGraduate.setText(ogGraduated ? "Yes" : "No");

        JOptionPane.showMessageDialog(this, "Changes reverted");
    }
}
