package schoolify;
import government.Person;
import government.school.staff.*;
import javax.swing.*;
import java.awt.CardLayout;

public class EmployeeRecords extends JPanel {

    // GUI components
    JLabel lblEmployeeName = new JLabel("Name: ");
    JLabel lblEmployeeAge = new JLabel("Age: ");
    JLabel lblEmployeeDepartment = new JLabel("Department: ");
    JLabel lblEmployeeShiftInterval = new JLabel("Shift Interval: ");
    JLabel lblEmployeeYearsEmployed = new JLabel("Years Employed: ");
    JLabel lblEmployeeAnnualSalary = new JLabel("Annual Salary: ");

    public JTextField txtEmployeeName = new JTextField();
    public JTextField txtEmployeeAge = new JTextField();
    public JTextField txtEmployeeDepartment = new JTextField();
    public JTextField txtEmployeeShiftInterval = new JTextField();
    public JTextField txtEmployeeYearsEmployed = new JTextField();
    public JTextField txtEmployeeAnnualSalary = new JTextField();

    // Constructor
    public EmployeeRecords(Employee employee) {
        // Initialize the GUI components
        initializeGUI();

        // Update the GUI with real data from the Employee object
        updateGUI(employee);
    }

    // Method to initialize all GUI components
    public void initializeGUI() {
        setLayout(null);

        // Set bounds for labels and text fields
        lblEmployeeName.setBounds(20, 20, 150, 50);
        txtEmployeeName.setBounds(150, 35, 150, 25);

        lblEmployeeAge.setBounds(20, 70, 150, 50);
        txtEmployeeAge.setBounds(150, 85, 150, 25);

        lblEmployeeDepartment.setBounds(20, 120, 150, 50);
        txtEmployeeDepartment.setBounds(150, 135, 150, 25);

        lblEmployeeShiftInterval.setBounds(20, 170, 150, 50);
        txtEmployeeShiftInterval.setBounds(150, 185, 150, 25);

        lblEmployeeYearsEmployed.setBounds(20, 220, 150, 50);
        txtEmployeeYearsEmployed.setBounds(150, 235, 150, 25);

        lblEmployeeAnnualSalary.setBounds(20, 270, 150, 50);
        txtEmployeeAnnualSalary.setBounds(150, 285, 150, 25);

        // Make the fields uneditable
        txtEmployeeName.setEditable(false);
        txtEmployeeAge.setEditable(false);
        txtEmployeeDepartment.setEditable(false);
        txtEmployeeShiftInterval.setEditable(false);
        txtEmployeeYearsEmployed.setEditable(false);
        txtEmployeeAnnualSalary.setEditable(false);

        // Add components to the panel
        add(lblEmployeeName);
        add(txtEmployeeName);
        add(lblEmployeeAge);
        add(txtEmployeeAge);
        add(lblEmployeeDepartment);
        add(txtEmployeeDepartment);
        add(lblEmployeeShiftInterval);
        add(txtEmployeeShiftInterval);
        add(lblEmployeeYearsEmployed);
        add(txtEmployeeYearsEmployed);
        add(lblEmployeeAnnualSalary);
        add(txtEmployeeAnnualSalary);
    }

    // Method to update the GUI with real data from the Employee object
    public void updateGUI(Employee employee) {
        // Set text fields with the employee data
        txtEmployeeName.setText(employee.getName());
        txtEmployeeAge.setText(String.valueOf(employee.getAge()));
        txtEmployeeDepartment.setText(employee.getDepartment());
        txtEmployeeShiftInterval.setText(String.join(" - ", employee.getShiftInterval()));
        txtEmployeeYearsEmployed.setText(String.valueOf(employee.getYearsEmployed()));
        txtEmployeeAnnualSalary.setText(String.valueOf(employee.getAnnualSalary()));
    }
}
