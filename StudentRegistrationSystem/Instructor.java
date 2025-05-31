package StudentRegistrationSystem;
public class Instructor extends Person {
    private String specialization;

    public Instructor(String name, String id, String specialization) {
        super(name, id);
        this.specialization = specialization;
    }

    public void displayInstructorInfo() {
        displayPersonInfo();
        System.out.println("Specialization: " + specialization);
    }
}
