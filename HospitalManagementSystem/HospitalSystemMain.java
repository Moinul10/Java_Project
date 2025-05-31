
package HospitalManagementSystem;
public class HospitalSystemMain {
    public static void main(String[] args) {
        // Create hospital
        Hospital hospital = new Hospital("EverCare Hospital");
        hospital.showWelcome();

        // Create doctor and patient
        Doctor doctor = new Doctor("Sadia Ahmed", 40, "Cardiologist");
        Patient patient = new Patient("Rafiq", 60, "P1234");

        // Create treatment
        Treatment treatment = new Treatment("Heart Checkup", 2500.0);

        // Display info
        doctor.displayDoctorInfo();
        patient.displayPatientInfo();
        treatment.displayTreatmentInfo();

        // Treat the patient
        doctor.treatPatient(patient, treatment);
    }
}
