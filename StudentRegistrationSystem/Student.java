package StudentRegistrationSystem;
public class Student extends Person {
    private String department;

    public Student(String name, String id, String department) {
        super(name, id);
        this.department = department;
    }

    public void displayStudentInfo() {
        displayPersonInfo();
        System.out.println("Department: " + department);
    }
}
