package schoolify;

import government.Person;
import government.school.*;
import javax.swing.*;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;

public class GUI {

    JFrame mainFrame = new JFrame();
    JPanel mainPanel = new JPanel();
    CardLayout cl = new CardLayout();

    // panels
    SelectRole pnlSelectRole = new SelectRole();
    StudentLogin pnlStudentLogin = new StudentLogin();
    EmployeeLogin pnlEmployeeLogin = new EmployeeLogin();
    CounsellorEditandViewStudentRecords pnlCounsellorViewEditStudentRecords = new CounsellorEditandViewStudentRecords();
    AdministratorEditandViewStudentRecords pnlAdministratorViewEditStudentRecords = new AdministratorEditandViewStudentRecords();
    AdministratorEditandViewEmployeeRecords pnlAdministratorViewEditEmployeeRecords = new AdministratorEditandViewEmployeeRecords();

    public GUI() {
        mainPanel.setLayout(cl);

        // adding
        mainPanel.add(pnlSelectRole, "selectRole");
        mainPanel.add(pnlStudentLogin, "studentLogin");
        mainPanel.add(pnlEmployeeLogin, "employeeLogin");
        mainPanel.add(pnlCounsellorViewEditStudentRecords, "counsellorViewEditPanel");
        mainPanel.add(pnlAdministratorViewEditStudentRecords, "administratorViewEditPanel");
        mainPanel.add(pnlAdministratorViewEditEmployeeRecords, "administratorViewEditEmployeePanel");

        // show first panel
        cl.show(mainPanel, "selectRole");

        // select role
        pnlSelectRole.btnSelectStudent.addActionListener(e -> cl.show(mainPanel, "studentLogin"));
        pnlSelectRole.btnSelectEmployee.addActionListener(e -> cl.show(mainPanel, "employeeLogin"));

        // student login
        pnlStudentLogin.btnStudentLogin.addActionListener(e -> {
            int studentID = Integer.parseInt(pnlStudentLogin.txtStudentID.getText());
            int studentPassword = Integer.parseInt(pnlStudentLogin.txtStudentPassword.getText());

            for (Student s : Student.getAllStudents()) {
                if (s.getStudentID() == studentID && s.getPassword() == studentPassword) {
                    if (s instanceof SHSMStudent) {
                        SHSMRecords pnlSHSM = new SHSMRecords((SHSMStudent) s);
                        mainPanel.add(pnlSHSM, "shsmPanel");
                        cl.show(mainPanel, "shsmPanel");

                    } else if (s instanceof HPPStudent) {
                        HPPRecords pnlHPP = new HPPRecords((HPPStudent) s);
                        mainPanel.add(pnlHPP, "hppPanel");
                        cl.show(mainPanel, "hppPanel");
                    } else {
                        StudentRecords pnlStudent = new StudentRecords(s);
                        mainPanel.add(pnlStudent, "studentPanel");
                        cl.show(mainPanel, "studentPanel");
                    }
                    break;
                }
            }
        });

        // employee login
        pnlEmployeeLogin.btnEmployeeLogin.addActionListener(e1 -> actionPerformed(e1));

        // admin view/edit student
        pnlAdministrator.btnAdministratortViewAndEditStudentRecords.addActionListener(e ->
                cl.show(mainPanel, "administratorViewEditPanel"));

        // admin view/edit employee
        pnlAdministrator.btnAdministratortViewAndEditEmployeeRecords.addActionListener(e ->
                cl.show(mainPanel, "administratorViewEditEmployeePanel"));

        // counsellor view/edit
        pnlCounsellor.btnCounsellorViewAndEditStudentRecords.addActionListener(e ->
                cl.show(mainPanel, "counsellorViewEditPanel"));

        // frame
        mainFrame.setSize(600, 500);
        mainFrame.add(mainPanel);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);
    }

    public static void main(String[] args) {
        new GUI();
    }

    private void actionPerformed(ActionEvent e) {
        int employeeID = Integer.parseInt(pnlEmployeeLogin.txtEmployeeID.getText());
        int employeePassword = Integer.parseInt(pnlEmployeeLogin.txtEmployeePassword.getText());

        for (Employee emp : Employee.getAllEmployees()) {
            if (emp.getEMPLOYEE_ID() == employeeID && emp.getPassword() == employeePassword) {
                if (emp instanceof Administrator) {
                    AdministratorRecords pnlAdministrator = new AdministratorRecords((Administrator) emp);
                    mainPanel.add(pnlAdministrator, "administratorPanel");
                    cl.show(mainPanel, "administratorPanel");

                } else if (emp instanceof Teacher) {
                    TeacherRecords pnlTeacher;
                    pnlTeacher = new TeacherRecords((Teacher) emp);
                    mainPanel.add(pnlTeacher, "teacherPanel");
                    cl.show(mainPanel, "teacherPanel");

                } else if (emp instanceof Counsellor) {
                    CounsellorRecords pnlCounsellor = new CounsellorRecords((Counsellor) emp);
                    mainPanel.add(pnlCounsellor, "counsellorPanel");
                    cl.show(mainPanel, "counsellorPanel");

                } else {
                    EmployeeRecords pnlEmployee = new EmployeeRecords(emp);
                    mainPanel.add(pnlEmployee, "employeePanel");
                    cl.show(mainPanel, "employeePanel");
                }
                break;
            }
        }
    }
}

