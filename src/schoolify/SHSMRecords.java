package schoolify;

import government.Person;
import government.school.students.*;
import javax.swing.*;
import java.awt.CardLayout;

public class SHSMRecords extends JPanel {

    // GUI components
    JLabel lblSHSMName = new JLabel("Name: ");
    JLabel lblSHSMAge = new JLabel("Age: ");
    JLabel lblSHSMAverageGrade = new JLabel("Average Grade: ");
    JLabel lblSHSMCreditsEarned = new JLabel("Credits Earned: ");
    JLabel lblSHSMLates = new JLabel("Lates: ");
    JLabel lblSHSMVolunteerHours = new JLabel("Volunteer Hours: ");
    JLabel lblSHSMGraduate = new JLabel("Graduated: ");
    JLabel lblCOOP = new JLabel("CO-OP: ");
    JLabel lblCOOPPlacement = new JLabel("CO-OP Placement: ");

    public JTextField txtSHSMName = new JTextField();
    public JTextField txtSHSMAge = new JTextField();
    public JTextField txtSHSMAverageGrade = new JTextField();
    public JTextField txtSHSMCreditsEarned = new JTextField();
    public JTextField txtSHSMLates = new JTextField();
    public JTextField txtSHSMVolunteerHours = new JTextField();
    public JTextField txtCOOPPlacement = new JTextField();

    public JCheckBox chkSHSMGraduate = new JCheckBox();
    public JCheckBox chkCOOP = new JCheckBox();

    // Constructor that accepts an SHSMStudent object as a parameter
    public SHSMRecords(SHSMStudent shsmStudent) {
        // Initialize the GUI components
        initializeGUI();

        // Update the GUI with real data from the SHSMStudent object
        updateGUI(shsmStudent);
    }

    // Method to initialize all GUI components
    public void initializeGUI() {
        setLayout(null);

        // Set bounds for labels and text fields
        lblSHSMName.setBounds(20, 20, 150, 50);
        txtSHSMName.setBounds(150, 35, 150, 25);

        lblSHSMAge.setBounds(20, 70, 150, 50);
        txtSHSMAge.setBounds(150, 85, 150, 25);

        lblSHSMAverageGrade.setBounds(20, 120, 150, 50);
        txtSHSMAverageGrade.setBounds(150, 135, 150, 25);

        lblSHSMCreditsEarned.setBounds(20, 170, 150, 50);
        txtSHSMCreditsEarned.setBounds(150, 185, 150, 25);

        lblSHSMLates.setBounds(20, 220, 150, 50);
        txtSHSMLates.setBounds(150, 235, 150, 25);

        lblSHSMVolunteerHours.setBounds(20, 270, 150, 50);
        txtSHSMVolunteerHours.setBounds(150, 285, 150, 25);

        lblSHSMGraduate.setBounds(20, 320, 150, 50);
        chkSHSMGraduate.setBounds(150, 335, 25, 25);

        lblCOOP.setBounds(20, 370, 150, 50);
        chkCOOP.setBounds(150, 385, 25, 25);

        lblCOOPPlacement.setBounds(20, 420, 150, 50);
        txtCOOPPlacement.setBounds(150, 435, 150, 25);

        // Make fields non-editable
        txtSHSMName.setEditable(false);
        txtSHSMAge.setEditable(false);
        txtSHSMAverageGrade.setEditable(false);
        txtSHSMCreditsEarned.setEditable(false);
        txtSHSMLates.setEditable(false);
        txtSHSMVolunteerHours.setEditable(false);
        chkSHSMGraduate.setEnabled(false);
        chkCOOP.setEnabled(false);
        txtCOOPPlacement.setEditable(false);

        // Add all components to the panel
        add(lblSHSMName);
        add(txtSHSMName);
        add(lblSHSMAge);
        add(txtSHSMAge);
        add(lblSHSMAverageGrade);
        add(txtSHSMAverageGrade);
        add(lblSHSMCreditsEarned);
        add(txtSHSMCreditsEarned);
        add(lblSHSMLates);
        add(txtSHSMLates);
        add(lblSHSMVolunteerHours);
        add(txtSHSMVolunteerHours);
        add(lblSHSMGraduate);
        add(chkSHSMGraduate);
        add(lblCOOP);
        add(chkCOOP);
        add(lblCOOPPlacement);
        add(txtCOOPPlacement);
    }

    // Method to update the GUI with real data from the SHSMStudent object
    public void updateGUI(SHSMStudent shsmStudent) {
        txtSHSMName.setText(shsmStudent.getName());
        txtSHSMAge.setText(String.valueOf(shsmStudent.getAge()));
        txtSHSMAverageGrade.setText(String.valueOf(shsmStudent.getGPA()));
        txtSHSMCreditsEarned.setText(String.valueOf(shsmStudent.getCreditsEarned()));
        //txtSHSMLates.setText(String.valueOf(shsmStudent.getDaysLate())); // Uncomment if necessary
        txtSHSMVolunteerHours.setText(String.valueOf(shsmStudent.getVolunteerHoursCompleted()));
        chkSHSMGraduate.setSelected(shsmStudent.getStatus()[1]);
        chkCOOP.setSelected(shsmStudent.hasCompletedCOOP());
        txtCOOPPlacement.setText(shsmStudent.getCOOPPlacement());
    }
}
