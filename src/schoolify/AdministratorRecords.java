package schoolify;
import government.Person;
import government.school.staff.*;
import javax.swing.*;
import java.awt.CardLayout;
import schoolify.GUI;


public class AdministratorRecords extends JPanel {

    JLabel lblAdministratorName = new JLabel("Name: ");
    JLabel lblAdministratorAge = new JLabel("Age: ");
    JLabel lblAdministratorDepartment = new JLabel("Department: ");
    JLabel lblAdministratorShiftInterval = new JLabel("Shift Interval: ");
    JLabel lblAdministratorYearsEmployed = new JLabel("Years Employed: ");
    JLabel lblAdministratorAnnualSalary = new JLabel("Annual Salary: ");
    JLabel lblSchoolBudget = new JLabel("School Budget: ");

    JTextField txtAdministratorName = new JTextField();
    JTextField txtAdministratorAge = new JTextField();
    JTextField txtAdministratorDepartment = new JTextField();
    JTextField txtAdministratorShiftInterval = new JTextField();
    JTextField txtAdministratorYearsEmployed = new JTextField();
    JTextField txtAdministratorAnnualSalary = new JTextField();
    JTextField txtSchoolBudget = new JTextField();

    JButton btnAdministratortViewAndEditStudentRecords = new JButton("View/Edit Student Records");
    JButton btnAdministratortViewAndEditEmployeeRecords = new JButton("View/Edit Employee Records");

    public AdministratorRecords(Administrator administrator, CardLayout cl, JPanel mainPanel) {
        // Initialize the GUI components
        initializeGUI();

        // Update the GUI with real data from the Administrator object
        updateGUI(administrator, cl, mainPanel);
    }

    // Method to initialize all GUI components
    public void initializeGUI() {
        setLayout(null);

        lblAdministratorName.setBounds(20, 20, 150, 50);
        txtAdministratorName.setBounds(150, 35, 150, 25);

        lblAdministratorAge.setBounds(20, 70, 150, 50);
        txtAdministratorAge.setBounds(150, 85, 150, 25);

        lblAdministratorDepartment.setBounds(20, 120, 150, 50);
        txtAdministratorDepartment.setBounds(150, 135, 150, 25);

        lblAdministratorShiftInterval.setBounds(20, 170, 150, 50);
        txtAdministratorShiftInterval.setBounds(150, 185, 150, 25);

        lblAdministratorYearsEmployed.setBounds(20, 220, 150, 50);
        txtAdministratorYearsEmployed.setBounds(150, 235, 150, 25);

        lblAdministratorAnnualSalary.setBounds(20, 270, 150, 50);
        txtAdministratorAnnualSalary.setBounds(150, 285, 150, 25);

        lblSchoolBudget.setBounds(20, 320, 150, 50);
        txtSchoolBudget.setBounds(150, 335, 150, 25);

        btnAdministratortViewAndEditStudentRecords.setBounds(50, 380, 200, 30);
        btnAdministratortViewAndEditEmployeeRecords.setBounds(50, 420, 200, 30);

        // Set text fields to be uneditable
        txtAdministratorName.setEditable(false);
        txtAdministratorAge.setEditable(false);
        txtAdministratorDepartment.setEditable(false);
        txtAdministratorShiftInterval.setEditable(false);
        txtAdministratorYearsEmployed.setEditable(false);
        txtAdministratorAnnualSalary.setEditable(false);
        txtSchoolBudget.setEditable(false);

        // Add all components to the panel
        add(lblAdministratorName);
        add(txtAdministratorName);
        add(lblAdministratorAge);
        add(txtAdministratorAge);
        add(lblAdministratorDepartment);
        add(txtAdministratorDepartment);
        add(lblAdministratorShiftInterval);
        add(txtAdministratorShiftInterval);
        add(lblAdministratorYearsEmployed);
        add(txtAdministratorYearsEmployed);
        add(lblAdministratorAnnualSalary);
        add(txtAdministratorAnnualSalary);
        add(lblSchoolBudget);
        add(txtSchoolBudget);
        add(btnAdministratortViewAndEditStudentRecords);
        add(btnAdministratortViewAndEditEmployeeRecords);
    }

    // Method to update the GUI with real data
    public void updateGUI(Administrator administrator, CardLayout cl, JPanel mainPanel) {
        txtAdministratorName.setText(administrator.getName());
        txtAdministratorAge.setText(String.valueOf(administrator.getAge()));
        txtAdministratorDepartment.setText(administrator.getDepartment());
        txtAdministratorShiftInterval.setText(String.join(" - ", administrator.getShiftInterval()));
        txtAdministratorYearsEmployed.setText(String.valueOf(administrator.getYearsEmployed()));
        txtAdministratorAnnualSalary.setText(String.valueOf(administrator.getAnnualSalary()));
        txtSchoolBudget.setText(String.valueOf(administrator.getSchoolBudget()));

        btnAdministratortViewAndEditStudentRecords.addActionListener(e -> {
            cl.show(mainPanel, "administratorViewEditsStudentPanel");
    });

        // Admin view/edit employee
        btnAdministratortViewAndEditEmployeeRecords.addActionListener(e -> {
            cl.show(mainPanel, "administratorViewEditEmployeePanel");
        });
    }
}
