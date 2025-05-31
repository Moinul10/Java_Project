
package HospitalManagementSystem;
public class Patient extends Person {
    private String patientId;

    public Patient(String name, int age, String patientId) {
        super(name, age);
        this.patientId = patientId;
    }

    public String getName() {
        return name;
    }

    public void displayPatientInfo() {
        displayPersonInfo();
        System.out.println("Patient ID: " + patientId);
    }
}
