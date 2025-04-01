package schoolify;
import government.Person;
import government.school.*;
import government.school.students.*;
import government.school.staff.*;
import government.school.timetable.Timetable;
import javax.swing.*;
import java.awt.CardLayout;
import java.util.ArrayList;
public class GUI {
    // JFrame and main panel
    JFrame mainFrame = new JFrame();
    JPanel mainPanel = new JPanel();
    CardLayout cl = new CardLayout();
    // Panels
    SelectRole pnlSelectRole = new SelectRole();
    StudentLogin pnlStudentLogin = new StudentLogin();
    EmployeeLogin pnlEmployeeLogin = new EmployeeLogin();
    CounsellorRecords pnlCounsellor = new CounsellorRecords((new Counsellor(40, "Diddy", "oiloiloil", "Physical Education", new String[]{"12:00", "12:00"}, 40, 350000, new boolean[]{false, false, false}, "MD in Oil", "A")));
    CounsellorEditandViewStudentRecords pnlCounsellorViewEditStudentRecords = new CounsellorEditandViewStudentRecords(new Student(16, "Rajbir"));
    AdministratorEditandViewStudentRecords pnlAdministratorViewEditStudentRecords = new AdministratorEditandViewStudentRecords(new Student(16, "Rajbir"));
    AdministratorEditandViewEmployeeRecords pnlAdministratorViewEditEmployeeRecords = new AdministratorEditandViewEmployeeRecords((new Teacher(40, "Diddy", "oiloiloil", "Physical Education", new String[]{"12:00", "12:00"}, 40, 350000, new boolean[]{false, false, false}, "MD in Oil", new ArrayList<>(), new Timetable())));


    public GUI() throws CloneNotSupportedException {
// Initialize the GUI
        initializeGUI();
        pnlSelectRole.initializeGUI();
        pnlStudentLogin.initializeGUI();
        pnlEmployeeLogin.initializeGUI();
        pnlCounsellor.initializeGUI();
        pnlCounsellorViewEditStudentRecords.initializeGUI();
        pnlAdministratorViewEditStudentRecords.initializeGUI();
        pnlAdministratorViewEditEmployeeRecords.initializeAdministratorGUI();
// Set up the layout
        mainPanel.setLayout(cl);
// Adding panels to the main panel
        addPanelsToMainPanel();
// Show first panel
        cl.show(mainPanel, "selectRole");
// Set up action listeners
        setupActionListeners();
// Frame setup
        setupFrame();
    }
    // Method to initialize the GUI components
    private void initializeGUI() {
// Layout setup for main panel
        mainPanel.setLayout(cl);
    }
    // Method to add panels to the main panel
    private void addPanelsToMainPanel() {
        mainPanel.add(pnlSelectRole, "selectRole");
        mainPanel.add(pnlStudentLogin, "studentLogin");
        mainPanel.add(pnlEmployeeLogin, "employeeLogin");
        mainPanel.add(pnlCounsellorViewEditStudentRecords, "counsellorViewEditPanel");
        mainPanel.add(pnlAdministratorViewEditStudentRecords, "administratorViewEditStudentPanel");
        mainPanel.add(pnlAdministratorViewEditEmployeeRecords, "administratorViewEditEmployeePanel");
    }
    // Method to setup all action listeners for buttons
    private void setupActionListeners() {
// Select role
        pnlSelectRole.btnSelectStudent.addActionListener(e -> cl.show(mainPanel, "studentLogin"));
        pnlSelectRole.btnSelectEmployee.addActionListener(e -> cl.show(mainPanel, "employeeLogin"));
// Student login

        pnlStudentLogin.btnStudentLogin.addActionListener(e -> {
            try {
                String studentIDText = pnlStudentLogin.txtStudentID.getText(); // Get the student ID text
                String studentPassword = pnlStudentLogin.txtStudentPassword.getText(); // Get the student password text

                // Ensure that student ID and password are not empty
                if (studentIDText.isEmpty() || studentPassword.isEmpty()) {
                    JOptionPane.showMessageDialog(mainFrame, "Please fill in both Student ID and Password.", "Input Error", JOptionPane.ERROR_MESSAGE);
                    return; // Exit early if any field is empty
                }

                int studentID = Integer.parseInt(studentIDText); // Try parsing the student ID as integer

                // Loop through all students and check if the ID and password match
                boolean studentFound = false;
                for (Student s : Student.getAllStudents()) {
                    if (s.getID() == studentID && s.getPASSWORD().equals(studentPassword)) {
                        // Handling student types
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
                        studentFound = true;
                        break; // Exit the loop once the matching student is found
                    }
                }

                // If no matching student is found, show an error message
                if (!studentFound) {
                    JOptionPane.showMessageDialog(mainFrame, "Invalid student credentials.", "Login Error", JOptionPane.ERROR_MESSAGE);
                }

            } catch (NumberFormatException ex) {
                // Handle the case where student ID is not a valid integer
                JOptionPane.showMessageDialog(mainFrame, "Please enter a valid integer for Student ID.", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
        });

// Employee login
        pnlEmployeeLogin.btnEmployeeLogin.addActionListener(e -> {
            try {
                String employeeIDText = pnlEmployeeLogin.txtEmployeeID.getText();
                String employeePassword = pnlEmployeeLogin.txtEmployeePassword.getText();

                // Ensure that employee ID is not empty and is a valid integer
                if (employeeIDText.isEmpty() || employeePassword.isEmpty()) {
                    JOptionPane.showMessageDialog(mainFrame, "Please fill in both Employee ID and Password.", "Input Error", JOptionPane.ERROR_MESSAGE);
                    return; // Exit early if any field is empty
                }

                int employeeID = Integer.parseInt(employeeIDText); // Parse employee ID as integer

                // Search for the employee
                boolean employeeFound = false;
                for (Employee emp : Employee.getAllEmployees()) {
                    if (emp.getEMPLOYEE_ID() == employeeID && emp.getPASSWORD().equals(employeePassword)) {
                        // Handle employee types and navigate to the respective panel
                        if (emp instanceof Administrator) {
                            AdministratorRecords pnlAdministrator = new AdministratorRecords((Administrator) emp, cl, mainPanel);
                            mainPanel.add(pnlAdministrator, "administratorPanel");
                            cl.show(mainPanel, "administratorPanel");
                        } else if (emp instanceof Teacher) {
                            TeacherRecords pnlTeacher = new TeacherRecords((Teacher) emp);
                            mainPanel.add(pnlTeacher, "teacherPanel");
                            cl.show(mainPanel, "teacherPanel");
                        } else if (emp instanceof Counsellor) {
                            pnlCounsellor = new CounsellorRecords((Counsellor) emp);
                            mainPanel.add(pnlCounsellor, "counsellorPanel");
                            cl.show(mainPanel, "counsellorPanel");
                        } else {
                            EmployeeRecords pnlEmployee = new EmployeeRecords(emp);
                            mainPanel.add(pnlEmployee, "employeePanel");
                            cl.show(mainPanel, "employeePanel");
                        }
                        employeeFound = true;
                        break; // Exit the loop once the matching employee is found
                    }
                }

                // If no matching employee is found
                if (!employeeFound) {
                    JOptionPane.showMessageDialog(mainFrame, "Invalid employee credentials.", "Login Error", JOptionPane.ERROR_MESSAGE);
                }

            } catch (NumberFormatException ex) {
                // Handle the case where employee ID is not a valid integer
                JOptionPane.showMessageDialog(mainFrame, "Please enter a valid integer for Employee ID.", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
        });

// Counsellor view/edit
        pnlCounsellor.btnCounsellorViewAndEditStudentRecords.addActionListener(e -> cl.show(mainPanel, "counsellorViewEditPanel"));
    }
    // Method to setup the frame properties
    private void setupFrame() {
        mainFrame.setSize(600, 500);
        mainFrame.add(mainPanel);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);
    }
}
