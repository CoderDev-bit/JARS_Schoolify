package schoolify;
import government.school.students.*;
import javax.swing.*;

public class CounsellorEditandViewStudentRecords extends JPanel {

    // GUI components
    JLabel lblCounsellorViewEditEnterStudentID = new JLabel("Enter Student ID: ");
    JLabel lblCounsellorViewEditStudentName = new JLabel("Name: ");
    JLabel lblCounsellorViewEditStudentAge = new JLabel("Age: ");
    JLabel lblCounsellorViewEditStudentAverageGrade = new JLabel("Average Grade: ");
    JLabel lblCounsellorViewEditStudentCreditsEarned = new JLabel("Credits Earned: ");
    JLabel lblCounsellorViewEditStudentAbsences = new JLabel("Absences: ");
    JLabel lblCounsellorViewEditStudentLates = new JLabel("Lates: ");
    JLabel lblCounsellorViewEditStudentVolunteerHours = new JLabel("Volunteer Hours: ");
    JLabel lblCounsellorViewEditStudentGraduate = new JLabel("Graduate: ");

    public JTextField txtCounsellorViewEditStudentID = new JTextField();
    public JTextField txtCounsellorViewEditStudentName = new JTextField();
    public JTextField txtCounsellorViewEditStudentAge = new JTextField();
    public JTextField txtCounsellorViewEditStudentAverageGrade = new JTextField();
    public JTextField txtCounsellorViewEditStudentCreditsEarned = new JTextField();
    public JTextField txtCounsellorViewEditStudentAbsences = new JTextField();
    public JTextField txtCounsellorViewEditStudentLates = new JTextField();
    public JTextField txtCounsellorViewEditStudentVolunteerHours = new JTextField();
    public JTextField txtCounsellorViewEditStudentGraduate = new JTextField();

    public JButton btnCounsellorEnterStudentID = new JButton("Enter");
    public JButton btnEditStudentRecords = new JButton("Edit");
    public JButton btnCounsellorSaveChanges = new JButton("Save");
    public JButton btnCounsellorUndoChanges = new JButton("Undo");

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

    // Constructor that takes a Student object as a parameter
    public CounsellorEditandViewStudentRecords(Student student) {
        this.student = student;  // Initialize the student object

        // Set the original values from the student object
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
        lblCounsellorViewEditEnterStudentID.setBounds(20, 20, 150, 50);
        txtCounsellorViewEditStudentID.setBounds(180, 35, 150, 25);

        lblCounsellorViewEditStudentName.setBounds(20, 70, 150, 50);
        txtCounsellorViewEditStudentName.setBounds(180, 85, 150, 25);

        lblCounsellorViewEditStudentAge.setBounds(20, 120, 150, 50);
        txtCounsellorViewEditStudentAge.setBounds(180, 135, 150, 25);

        lblCounsellorViewEditStudentAverageGrade.setBounds(20, 170, 150, 50);
        txtCounsellorViewEditStudentAverageGrade.setBounds(180, 185, 150, 25);

        lblCounsellorViewEditStudentCreditsEarned.setBounds(20, 220, 150, 50);
        txtCounsellorViewEditStudentCreditsEarned.setBounds(180, 235, 150, 25);

        lblCounsellorViewEditStudentAbsences.setBounds(20, 270, 150, 50);
        txtCounsellorViewEditStudentAbsences.setBounds(180, 285, 150, 25);

        lblCounsellorViewEditStudentLates.setBounds(20, 320, 150, 50);
        txtCounsellorViewEditStudentLates.setBounds(180, 335, 150, 25);

        lblCounsellorViewEditStudentVolunteerHours.setBounds(20, 370, 150, 50);
        txtCounsellorViewEditStudentVolunteerHours.setBounds(180, 385, 150, 25);

        lblCounsellorViewEditStudentGraduate.setBounds(20, 420, 150, 50);
        txtCounsellorViewEditStudentGraduate.setBounds(180, 435, 150, 25);

        btnCounsellorEnterStudentID.setBounds(350, 35, 100, 25);
        btnCounsellorSaveChanges.setBounds(350, 435, 150, 30);
        btnCounsellorUndoChanges.setBounds(350, 475, 150, 30);

        // Set editable fields
        txtCounsellorViewEditStudentID.setEditable(true);
        txtCounsellorViewEditStudentName.setEditable(true);
        txtCounsellorViewEditStudentAge.setEditable(true);
        txtCounsellorViewEditStudentAverageGrade.setEditable(true);
        txtCounsellorViewEditStudentCreditsEarned.setEditable(true);
        txtCounsellorViewEditStudentAbsences.setEditable(true);
        txtCounsellorViewEditStudentLates.setEditable(true);
        txtCounsellorViewEditStudentVolunteerHours.setEditable(true);
        txtCounsellorViewEditStudentGraduate.setEditable(true);

        // Add components to the panel
        add(lblCounsellorViewEditEnterStudentID);
        add(txtCounsellorViewEditStudentID);
        add(lblCounsellorViewEditStudentName);
        add(txtCounsellorViewEditStudentName);
        add(lblCounsellorViewEditStudentAge);
        add(txtCounsellorViewEditStudentAge);
        add(lblCounsellorViewEditStudentAverageGrade);
        add(txtCounsellorViewEditStudentAverageGrade);
        add(lblCounsellorViewEditStudentCreditsEarned);
        add(txtCounsellorViewEditStudentCreditsEarned);
        add(lblCounsellorViewEditStudentAbsences);
        add(txtCounsellorViewEditStudentAbsences);
        add(lblCounsellorViewEditStudentLates);
        add(txtCounsellorViewEditStudentLates);
        add(lblCounsellorViewEditStudentVolunteerHours);
        add(txtCounsellorViewEditStudentVolunteerHours);
        add(lblCounsellorViewEditStudentGraduate);
        add(txtCounsellorViewEditStudentGraduate);
        add(btnCounsellorEnterStudentID);
        add(btnCounsellorSaveChanges);
        add(btnCounsellorUndoChanges);
    }

    // Method to update the GUI with the student data
    public void updateGUI() {
        // Set text fields with the student data
        txtCounsellorViewEditStudentID.setText(String.valueOf(student.getID()));
        txtCounsellorViewEditStudentName.setText(student.getName());
        txtCounsellorViewEditStudentAge.setText(String.valueOf(student.getAge()));
        txtCounsellorViewEditStudentAverageGrade.setText(String.valueOf(student.getGPA()));
        txtCounsellorViewEditStudentCreditsEarned.setText(String.valueOf(student.getCreditsEarned()));
        txtCounsellorViewEditStudentVolunteerHours.setText(String.valueOf(student.getVolunteerHoursCompleted()));
        txtCounsellorViewEditStudentGraduate.setText(student.getStatus()[1] ? "Yes" : "No");
    }

    // Save button action
    public void saveStudentChanges() {
        try {
            student.setName(txtCounsellorViewEditStudentName.getText());
            student.setAge(Integer.parseInt(txtCounsellorViewEditStudentAge.getText()));
            student.setVolunteerHours(Integer.parseInt(txtCounsellorViewEditStudentVolunteerHours.getText()));

            JOptionPane.showMessageDialog(this, "Changes Saved");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error saving changes: " + ex.getMessage());
        }
    }

    // Undo button action
    public void undoStudentChanges() {
        // Revert the text fields to original values
        txtCounsellorViewEditStudentName.setText(ogName);
        txtCounsellorViewEditStudentAge.setText(String.valueOf(ogAge));
        txtCounsellorViewEditStudentAverageGrade.setText(String.valueOf(ogAvgGrade));
        txtCounsellorViewEditStudentCreditsEarned.setText(String.valueOf(ogCreditsEarned));
        txtCounsellorViewEditStudentAbsences.setText(String.valueOf(ogAbsences));
        txtCounsellorViewEditStudentLates.setText(String.valueOf(ogLates));
        txtCounsellorViewEditStudentVolunteerHours.setText(String.valueOf(ogVolunteerHours));
        txtCounsellorViewEditStudentGraduate.setText(ogGraduated ? "Yes" : "No");

        JOptionPane.showMessageDialog(this, "Changes reverted");
    }
}
