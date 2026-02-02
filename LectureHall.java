import java.util.List;

/**
 * Represents a Lecture Hall that has a Location and a list of Courses that
 * utilize it.
 */
public class LectureHall {
    private String location;
    private List<Course> coursesInLectureHall;

    /**
     * assigns location
     * 
     * @param location
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * This method prints a schedule of Courses that use the lecture hall.
     */
    public void generateSchedule() {
    }

}