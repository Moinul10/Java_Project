
package HospitalManagementSystem;
public class Doctor extends Person {
    private String specialty;

    public Doctor(String name, int age, String specialty) {
        super(name, age);
        this.specialty = specialty;
    }

    public void treatPatient(Patient patient, Treatment treatment) {
        System.out.println("Dr. " + name + " is treating " + patient.getName() + " for " + treatment.getTreatmentName());
    }

    public void displayDoctorInfo() {
        displayPersonInfo();
        System.out.println("Specialty: " + specialty);
    }
}

