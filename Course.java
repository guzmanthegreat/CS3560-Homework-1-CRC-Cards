import java.util.List;

/**
 * Represents a Course that has a course time (0000-2359), a given lecture hall,
 * an instructor, and a list of students
 */
public class Course {
    private String courseName;

    private List<Integer> courseTime;
    private LectureHall lectureHall;
    private Instructor instructor;
    private List<Student> students;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void printCourseName() {
        System.out.print(courseName);
    }

    /**
     * sets course x to be prerequisite for course y
     * 
     * @param x
     * @param y
     */
    public void setPrerequisite(Course x, Course y) {
    }

    /**
     * prints list of the times of the class, the lecture hall, the instructor, and
     * the list of students.
     */
    public void generateRoster() {
    }

    /**
     * Assigns lectureHall objects to Course's lectureHall field
     * 
     * @param lectureHall
     */
    public void assignLectureHall(LectureHall lectureHall) {
        this.lectureHall = lectureHall;
    }

    /**
     * adds student object to students list
     * 
     * @param student
     */
    public void enrollStudent(Student student) {
    }

    /**
     * adds instructor object to instructor field
     * 
     * @param instructor
     */
    public void assignProfessor(Instructor instructor) {
        this.instructor = instructor;
    }

}