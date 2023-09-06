package MainPackage;

public class RegistrationSystem {
    public static void main(String[] args) {
        // Create some sample courses
        Course mathCourse = new Course("MATH101", "Introduction to Mathematics", "Basic math concepts", 30, "Mon-Wed-Fri, 9:00 AM");
        Course physicsCourse = new Course("PHY202", "Physics Fundamentals", "Introduction to physics", 25, "Tue-Thu, 1:00 PM");
        Course ChemistryCourse = new Course("CHEM202", "Chemistry Fundamentals", "Introduction to Chemistry", 28, "Tue-Thu, 2:00 PM");

        // Create some sample students
        Student student1 = new Student(1001, "John");
        Student student2 = new Student(1002, "Jane");
        Student student3 = new Student(1003, "Jack");

        // Register students for courses
        student1.registerForCourse(mathCourse);
        student1.registerForCourse(physicsCourse);
        student2.registerForCourse(mathCourse);
        student3.registerForCourse(ChemistryCourse);

        // Display registered courses for students
        student1.displayRegisteredCourses();
        student2.displayRegisteredCourses();
        student3.displayRegisteredCourses();

        // Drop a course for a student
        student1.dropCourse(physicsCourse);

        // Display updated registered courses
        student1.displayRegisteredCourses();
        
        
    }
}
