package schoolify;

import government.school.staff.Employee;
import javax.swing.*;

public class AdministratorEditandViewEmployeeRecords extends JPanel {

    // GUI components
    JLabel lblAdministratorViewEditEnterEmployeeID = new JLabel("Enter Employee ID: ");
    JLabel lblAdministratorViewEditEmployeeName = new JLabel("Name: ");
    JLabel lblAdministratorViewEditEmployeeAge = new JLabel("Age: ");
    JLabel lblAdministratorViewEditEmployeeDepartment = new JLabel("Department: ");
    JLabel lblAdministratorViewEditEmployeeShiftInterval = new JLabel("Shift Interval: ");
    JLabel lblAdministratorViewEditEmployeeYearsEmployed = new JLabel("Years Employed: ");
    JLabel lblAdministratorViewEditEmployeeAnnualSalary = new JLabel("Annual Salary: ");

    public JTextField txtAdministratorViewEditEmployeeID = new JTextField();
    public JTextField txtAdministratorViewEditEmployeeName = new JTextField();
    public JTextField txtAdministratorViewEditEmployeeAge = new JTextField();
    public JTextField txtAdministratorViewEditEmployeeDepartment = new JTextField();
    public JTextField txtAdministratorViewEditEmployeeShiftInterval = new JTextField();
    public JTextField txtAdministratorViewEditEmployeeYearsEmployed = new JTextField();
    public JTextField txtAdministratorViewEditEmployeeAnnualSalary = new JTextField();

    public JButton btnAdministratorEnterEmployeeID = new JButton("Enter");
    public JButton btnAdministratorSaveEmployeeChanges = new JButton("Save");
    public JButton btnAdministratorUndoEmployeeChanges = new JButton("Undo");

    private Employee employee; // Store the employee object
    private String ogName;
    private int ogAge;
    private String ogDepartment;
    private String ogShiftInterval;
    private int ogYearsEmployed;
    private double ogAnnualSalary;

    // Constructor that takes an Employee object as a parameter
    public AdministratorEditandViewEmployeeRecords(Employee employee) {
        this.employee = employee;  // Initialize the employee object

        // Set the original values from the employee object
        ogName = employee.getName();
        ogAge = employee.getAge();
        ogDepartment = employee.getDepartment();
        ogShiftInterval = String.join(" - ", employee.getShiftInterval());
        ogYearsEmployed = employee.getYearsEmployed();
        ogAnnualSalary = employee.getAnnualSalary();

        // Initialize the GUI components
        initializeAdministratorGUI();

        // Update the GUI with real data from the Employee object
        updateAdministratorEditViewEmployeeGui();
    }

    // Method to initialize all GUI components
    public void initializeAdministratorGUI() {
        setLayout(null);

        // Set bounds for labels and text fields
        lblAdministratorViewEditEnterEmployeeID.setBounds(20, 20, 150, 50);
        txtAdministratorViewEditEmployeeID.setBounds(180, 35, 150, 25);

        lblAdministratorViewEditEmployeeName.setBounds(20, 70, 150, 50);
        txtAdministratorViewEditEmployeeName.setBounds(180, 85, 150, 25);

        lblAdministratorViewEditEmployeeAge.setBounds(20, 120, 150, 50);
        txtAdministratorViewEditEmployeeAge.setBounds(180, 135, 150, 25);

        lblAdministratorViewEditEmployeeDepartment.setBounds(20, 170, 150, 50);
        txtAdministratorViewEditEmployeeDepartment.setBounds(180, 185, 150, 25);

        lblAdministratorViewEditEmployeeShiftInterval.setBounds(20, 220, 150, 50);
        txtAdministratorViewEditEmployeeShiftInterval.setBounds(180, 235, 150, 25);

        lblAdministratorViewEditEmployeeYearsEmployed.setBounds(20, 270, 150, 50);
        txtAdministratorViewEditEmployeeYearsEmployed.setBounds(180, 285, 150, 25);

        lblAdministratorViewEditEmployeeAnnualSalary.setBounds(20, 320, 150, 50);
        txtAdministratorViewEditEmployeeAnnualSalary.setBounds(180, 335, 150, 25);

        btnAdministratorEnterEmployeeID.setBounds(350, 35, 100, 25);
        btnAdministratorSaveEmployeeChanges.setBounds(350, 335, 150, 30);
        btnAdministratorUndoEmployeeChanges.setBounds(350, 375, 150, 30);

        // Set editable fields
        txtAdministratorViewEditEmployeeID.setEditable(true);
        txtAdministratorViewEditEmployeeName.setEditable(true);
        txtAdministratorViewEditEmployeeAge.setEditable(true);
        txtAdministratorViewEditEmployeeDepartment.setEditable(true);
        txtAdministratorViewEditEmployeeShiftInterval.setEditable(true);
        txtAdministratorViewEditEmployeeYearsEmployed.setEditable(true);
        txtAdministratorViewEditEmployeeAnnualSalary.setEditable(true);

        // Add all components to the panel
        add(lblAdministratorViewEditEnterEmployeeID);
        add(txtAdministratorViewEditEmployeeID);
        add(lblAdministratorViewEditEmployeeName);
        add(txtAdministratorViewEditEmployeeName);
        add(lblAdministratorViewEditEmployeeAge);
        add(txtAdministratorViewEditEmployeeAge);
        add(lblAdministratorViewEditEmployeeDepartment);
        add(txtAdministratorViewEditEmployeeDepartment);
        add(lblAdministratorViewEditEmployeeShiftInterval);
        add(txtAdministratorViewEditEmployeeShiftInterval);
        add(lblAdministratorViewEditEmployeeYearsEmployed);
        add(txtAdministratorViewEditEmployeeYearsEmployed);
        add(lblAdministratorViewEditEmployeeAnnualSalary);
        add(txtAdministratorViewEditEmployeeAnnualSalary);
        add(btnAdministratorEnterEmployeeID);
        add(btnAdministratorSaveEmployeeChanges);
        add(btnAdministratorUndoEmployeeChanges);
    }

    // Method to update the GUI with the employee's data
    public void updateAdministratorEditViewEmployeeGui() {
        // Set text fields with the employee data
        txtAdministratorViewEditEmployeeID.setText(String.valueOf(employee.getEMPLOYEE_ID()));
        txtAdministratorViewEditEmployeeName.setText(employee.getName());
        txtAdministratorViewEditEmployeeAge.setText(String.valueOf(employee.getAge()));
        txtAdministratorViewEditEmployeeDepartment.setText(employee.getDepartment());
        txtAdministratorViewEditEmployeeShiftInterval.setText(String.join(" - ", employee.getShiftInterval()));
        txtAdministratorViewEditEmployeeYearsEmployed.setText(String.valueOf(employee.getYearsEmployed()));
        txtAdministratorViewEditEmployeeAnnualSalary.setText(String.valueOf(employee.getAnnualSalary()));
    }

    // Save button action
    public void saveEmployeeChanges() {
        try {
            employee.setName(txtAdministratorViewEditEmployeeName.getText());
            employee.setAge(Integer.parseInt(txtAdministratorViewEditEmployeeAge.getText()));
            employee.setDepartment(txtAdministratorViewEditEmployeeDepartment.getText());
            employee.setShiftInterval(txtAdministratorViewEditEmployeeShiftInterval.getText().split(" - "));
            employee.setYearsEmployed(Integer.parseInt(txtAdministratorViewEditEmployeeYearsEmployed.getText()));
            employee.setAnnualSalary(Double.parseDouble(txtAdministratorViewEditEmployeeAnnualSalary.getText()));

            JOptionPane.showMessageDialog(this, "Changes Saved");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error saving changes: " + ex.getMessage());
        }
    }

    // Undo button action
    public void undoEmployeeChanges() {
        txtAdministratorViewEditEmployeeName.setText(ogName);
        txtAdministratorViewEditEmployeeAge.setText(String.valueOf(ogAge));
        txtAdministratorViewEditEmployeeDepartment.setText(ogDepartment);
        txtAdministratorViewEditEmployeeShiftInterval.setText(ogShiftInterval);
        txtAdministratorViewEditEmployeeYearsEmployed.setText(String.valueOf(ogYearsEmployed));
        txtAdministratorViewEditEmployeeAnnualSalary.setText(String.valueOf(ogAnnualSalary));

        JOptionPane.showMessageDialog(this, "Changes reverted");
    }

}
