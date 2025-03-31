package schoolify;
import government.Person;
import government.school.students.*;
import javax.swing.*;
import java.awt.CardLayout;

public class HPPRecords extends JPanel {
    JLabel lblHPPName = new JLabel("Name: ");
    JLabel lblHPPAge = new JLabel("Age: ");
    JLabel lblHPPAverageGrade = new JLabel("Average Grade: ");
    JLabel lblHPPCreditsEarned = new JLabel("Credits Earned: ");
    JLabel lblHPPLates = new JLabel("Lates: ");
    JLabel lblHPPVolunteerHours = new JLabel("Volunteer Hours: ");
    JLabel lblHPPGraduate = new JLabel("Graduated: ");
    JLabel lblSport = new JLabel("Sport: ");
    JLabel lblTeam = new JLabel("Team: ");
    JLabel lblPosition = new JLabel("Position: ");

    JTextField txtHPPName = new JTextField();
    JTextField txtHPPAge = new JTextField();
    JTextField txtHPPAverageGrade = new JTextField();
    JTextField txtHPPCreditsEarned = new JTextField();
    JTextField txtHPPLates = new JTextField();
    JTextField txtHPPVolunteerHours = new JTextField();
    JTextField txtSport = new JTextField();
    JTextField txtTeam = new JTextField();
    JTextField txtPosition = new JTextField();

    JCheckBox chkHPPGraduate = new JCheckBox();

    public HPPRecords(HPPStudent hppStudent) {
        setLayout(null);

        lblHPPName.setBounds(20, 20, 150, 50);
        txtHPPName.setBounds(150, 35, 150, 25);

        lblHPPAge.setBounds(20, 70, 150, 50);
        txtHPPAge.setBounds(150, 85, 150, 25);

        lblHPPAverageGrade.setBounds(20, 120, 150, 50);
        txtHPPAverageGrade.setBounds(150, 135, 150, 25);

        lblHPPCreditsEarned.setBounds(20, 170, 150, 50);
        txtHPPCreditsEarned.setBounds(150, 185, 150, 25);

        lblHPPLates.setBounds(20, 220, 150, 50);
        txtHPPLates.setBounds(150, 235, 150, 25);

        lblHPPVolunteerHours.setBounds(20, 270, 150, 50);
        txtHPPVolunteerHours.setBounds(150, 285, 150, 25);

        lblHPPGraduate.setBounds(20, 320, 150, 50);
        chkHPPGraduate.setBounds(150, 335, 25, 25);

        lblSport.setBounds(20, 370, 150, 50);
        txtSport.setBounds(150, 385, 150, 25);

        lblTeam.setBounds(20, 420, 150, 50);
        txtTeam.setBounds(150, 435, 150, 25);

        lblPosition.setBounds(20, 470, 150, 50);
        txtPosition.setBounds(150, 485, 150, 25);

        // Disable
        txtHPPName.setEditable(false);
        txtHPPAge.setEditable(false);
        txtHPPAverageGrade.setEditable(false);
        txtHPPCreditsEarned.setEditable(false);
        txtHPPLates.setEditable(false);
        txtHPPVolunteerHours.setEditable(false);
        chkHPPGraduate.setEnabled(false);
        txtSport.setEditable(false);
        txtTeam.setEditable(false);
        txtPosition.setEditable(false);

        // Seting
        txtHPPName.setText(hppStudent.getName());
        txtHPPAge.setText(String.valueOf(hppStudent.getAge()));
        txtHPPAverageGrade.setText(String.valueOf(hppStudent.getGPA()));
        txtHPPCreditsEarned.setText(String.valueOf(hppStudent.getCreditsEarned()));
        //txtHPPLates.setText(String.valueOf(hppStudent.getDaysLate()));
        txtHPPVolunteerHours.setText(String.valueOf(hppStudent.getVolunteerHoursCompleted()));
        chkHPPGraduate.setSelected(hppStudent.getStatus()[1]);
        txtSport.setText(hppStudent.getSport());
        txtTeam.setText(hppStudent.getTeam());
        txtPosition.setText(hppStudent.getPosition());

        // Adding
        add(lblHPPName);
        add(txtHPPName);
        add(lblHPPAge);
        add(txtHPPAge);
        add(lblHPPAverageGrade);
        add(txtHPPAverageGrade);
        add(lblHPPCreditsEarned);
        add(txtHPPCreditsEarned);
        add(lblHPPLates);
        add(txtHPPLates);
        add(lblHPPVolunteerHours);
        add(txtHPPVolunteerHours);
        add(lblHPPGraduate);
        add(chkHPPGraduate);
        add(lblSport);
        add(txtSport);
        add(lblTeam);
        add(txtTeam);
        add(lblPosition);
        add(txtPosition);
    }


}