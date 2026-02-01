import java.util.List;

/**
 * Represents a school that knows it's name and that manages students,
 * instructors,
 * courses, and lecture halls.
 */

public class School {
    private String schoolName;

    /** List of all current instructors in school */
    private List<Instructor> instructors;

    /** List of all current students in school */
    private List<Student> students;

    /** List of all current Lecture Halls in school */
    private List<LectureHall> lectureHalls;

    /** List of all available courses available in school */
    private List<Course> courses;

    public School(String name) {
        this.schoolName = name;
    }

    /** Prints name */
    public void printName() {
        System.out.println(this.schoolName);
    }

    /**
     * This method prints every Course object element's Information in courses List
     */
    public void printCourseCatalog() {
    }

    /** This method adds Course object to courses List */
    public void addCourse(Course course) {
    }

    /** This method removes Course object from courses List */
    public void removeCourse(Course course) {
    }

    /** This method adds LectureHall object to lectureHalls List */
    public void addLectureHall(LectureHall lectureHall) {
    }

    /** This method removes LectureHall object from lectureHalls List */
    public void removeLectureHall(LectureHall lectureHall) {
    }

    /** This method adds Instructor object to instructors List */
    public void addInstructor(Instructor instructor) {
    }

    /** This method removes Instructor object from instructors List */
    public void removeInstructor(Instructor instructor) {
    }

    /** This method adds Student object to students List */
    public void addStudent(Student student) {
    }

    /** This method removes Student object from students List */
    public void removeStudent(Student student) {
    }
}
