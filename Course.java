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

    /**
     * sets course x to be prerequisite for course y
     * 
     * @param x
     * @param y
     */
    public void setPrerequisite(Course x, Course y) {
    }

    /**
     * prints out every element in students list
     */
    public void generateRoster() {
    }

    /**
     * assigns objects lectureHall
     * 
     * @param lectureHall
     */
    public void assignLectureHall(LectureHall lectureHall) {
    }

    /**
     * adds student object to students list
     * 
     * @param student
     */
    public void enrollStudent(Student student) {
    }

    /**
     * adds instructor object to instructor
     * 
     * @param instructor
     */
    public void assignProfessor(Instructor instructor) {
    }

}