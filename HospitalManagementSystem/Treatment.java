
package HospitalManagementSystem;
public class Treatment {
    private String treatmentName;
    private double cost;

    public Treatment(String treatmentName, double cost) {
        this.treatmentName = treatmentName;
        this.cost = cost;
    }

    public String getTreatmentName() {
        return treatmentName;
    }

    public void displayTreatmentInfo() {
        System.out.println("Treatment: " + treatmentName + ", Cost: $" + cost);
    }
}
