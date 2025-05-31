
package HospitalManagementSystem;
public class Hospital {
    private String hospitalName;

    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public void showWelcome() {
        System.out.println("Welcome to " + hospitalName + " Hospital");
    }
}
