
package StudentRegistrationSystem;
public class RegistrationMain {
    public static void main(String[] args) {
        // Create student, instructor, and course
        Student student = new Student("Moinul Islam Shahed", "24070176", "CSE");
        Instructor instructor = new Instructor("Debabrata Mallick", "I201", "Software Engineering");
        Course course = new Course("CSE124", "Object Oriented Programming", (int) 1.5);

        // Create registration system
        RegistrationSystem system = new RegistrationSystem();

        // Display information
        student.displayStudentInfo();
        instructor.displayInstructorInfo();
        course.displayCourseInfo();

        // Register the student
        system.register(student, course);
    }
}
