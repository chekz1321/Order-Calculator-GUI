package er;//calling the filepath to be imported in the second program
//the class
public class Employee {
    // method type/modifiers
    private String employeeName; //
    private int idNumber;
    private String department;
    private String position;

     // method header/modifiers amd variables
    public Employee() {
        employeeName = "";
        idNumber = 0;
        department = "";
        position = "";
    }
    // method type/modifiers amd variables
    public Employee(String name, int id, String dept, String pos) {
        employeeName = name;
        idNumber = id;
        department = dept;
        position = pos;
    }

    public Employee(String name, int id) {
        employeeName = name;
        idNumber = id;
        department = "";
        position = "";
    }
        //calling method
    public void set_employee_name(String empName) {
        employeeName = empName;
    }
        // calling on method
    public String get_employee_name() {
        return employeeName;
    }

    public void set_employeeId(int empId) {
        idNumber = empId;
    }

    public int get_employeeId() {
        return idNumber;
    }

    public void set_department(String dept) {
        department = dept;
    }

    public String get_department() {
        return department;
    }

    public void set_position(String pos) {
        position = pos;
    }

    public String get_position() {
        return position;
    }
}
