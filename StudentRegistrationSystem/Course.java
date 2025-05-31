
package StudentRegistrationSystem;
public class Course {
    private String courseCode;
    String courseTitle;
    private int credit;

    public Course(String courseCode, String courseTitle, int credit) {
        this.courseCode = courseCode;
        this.courseTitle = courseTitle;
        this.credit = credit;
    }

    public void displayCourseInfo() {
        System.out.println("Course Code: " + courseCode);
        System.out.println("Title: " + courseTitle);
        System.out.println("Credit: " + credit);
    }
}
