package schoolify;
import government.Person;
import government.school.staff.*;
import javax.swing.*;
import java.awt.CardLayout;

public class CounsellorRecords extends JPanel {

    // GUI components
    JLabel lblCounsellorName = new JLabel("Name: ");
    JLabel lblCounsellorAge = new JLabel("Age: ");
    JLabel lblCounsellorDepartment = new JLabel("Department: ");
    JLabel lblCounsellorShiftInterval = new JLabel("Shift Interval: ");
    JLabel lblCounsellorYearsEmployed = new JLabel("Years Employed: ");
    JLabel lblCounsellorAnnualSalary = new JLabel("Annual Salary: ");
    JLabel lblCounsellorCertificate = new JLabel("Counsellor Certificate: ");
    JLabel lblStudentAlpha = new JLabel("Student Alpha: ");

    public JTextField txtCounsellorName = new JTextField();
    public JTextField txtCounsellorAge = new JTextField();
    public JTextField txtCounsellorDepartment = new JTextField();
    public JTextField txtCounsellorShiftInterval = new JTextField();
    public JTextField txtCounsellorYearsEmployed = new JTextField();
    public JTextField txtCounsellorAnnualSalary = new JTextField();
    public JTextField txtCounsellorCertificate = new JTextField();
    public JTextField txtStudentAlpha = new JTextField();

    public JButton btnCounsellorViewAndEditStudentRecords = new JButton("View/Edit Student Records");

    private Counsellor counsellor;  // Holds the counsellor object data

    // Constructor that accepts a Counsellor object as a parameter
    public CounsellorRecords(Counsellor counsellor) {
        this.counsellor = counsellor; // Initialize the counsellor object

        // Initialize the GUI components
        initializeGUI();

        // Update the GUI with real data from the Counsellor object
        updateGUI();
    }

    // Method to initialize all GUI components
    public void initializeGUI() {
        setLayout(null);

        // Set bounds for labels and text fields
        lblCounsellorName.setBounds(20, 20, 150, 50);
        txtCounsellorName.setBounds(150, 35, 150, 25);

        lblCounsellorAge.setBounds(20, 70, 150, 50);
        txtCounsellorAge.setBounds(150, 85, 150, 25);

        lblCounsellorDepartment.setBounds(20, 120, 150, 50);
        txtCounsellorDepartment.setBounds(150, 135, 150, 25);

        lblCounsellorShiftInterval.setBounds(20, 170, 150, 50);
        txtCounsellorShiftInterval.setBounds(150, 185, 150, 25);

        lblCounsellorYearsEmployed.setBounds(20, 220, 150, 50);
        txtCounsellorYearsEmployed.setBounds(150, 235, 150, 25);

        lblCounsellorAnnualSalary.setBounds(20, 270, 150, 50);
        txtCounsellorAnnualSalary.setBounds(150, 285, 150, 25);

        lblCounsellorCertificate.setBounds(20, 320, 150, 50);
        txtCounsellorCertificate.setBounds(150, 335, 150, 25);

        lblStudentAlpha.setBounds(20, 370, 150, 50);
        txtStudentAlpha.setBounds(150, 385, 150, 25);

        btnCounsellorViewAndEditStudentRecords.setBounds(150, 430, 200, 30);

        // Make fields uneditable
        txtCounsellorName.setEditable(false);
        txtCounsellorAge.setEditable(false);
        txtCounsellorDepartment.setEditable(false);
        txtCounsellorShiftInterval.setEditable(false);
        txtCounsellorYearsEmployed.setEditable(false);
        txtCounsellorAnnualSalary.setEditable(false);
        txtCounsellorCertificate.setEditable(false);
        txtStudentAlpha.setEditable(false);

        // Add components to the panel
        add(lblCounsellorName);
        add(txtCounsellorName);
        add(lblCounsellorAge);
        add(txtCounsellorAge);
        add(lblCounsellorDepartment);
        add(txtCounsellorDepartment);
        add(lblCounsellorShiftInterval);
        add(txtCounsellorShiftInterval);
        add(lblCounsellorYearsEmployed);
        add(txtCounsellorYearsEmployed);
        add(lblCounsellorAnnualSalary);
        add(txtCounsellorAnnualSalary);
        add(lblCounsellorCertificate);
        add(txtCounsellorCertificate);
        add(lblStudentAlpha);
        add(txtStudentAlpha);
        add(btnCounsellorViewAndEditStudentRecords);
    }

    // Method to update the GUI with the counsellor's data
    public void updateGUI() {
        // Set text fields with the counsellor data
        txtCounsellorName.setText(counsellor.getName());
        txtCounsellorAge.setText(String.valueOf(counsellor.getAge()));
        txtCounsellorDepartment.setText(counsellor.getDepartment());
        txtCounsellorShiftInterval.setText(String.join(" - ", counsellor.getShiftInterval()));
        txtCounsellorYearsEmployed.setText(String.valueOf(counsellor.getYearsEmployed()));
        txtCounsellorAnnualSalary.setText(String.valueOf(counsellor.getAnnualSalary()));
        txtCounsellorCertificate.setText(counsellor.getCounsellingCertification());
        txtStudentAlpha.setText(counsellor.getCounsellorAlpha());
    }
}
