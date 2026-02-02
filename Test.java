public class Test {
    public static void main(String[] args) {
        School altaLomaHigh = new School("Alta Loma High School");

        Course chemistry = new Course("Chemistry");

        altaLomaHigh.printName();

        altaLomaHigh.addCourse(chemistry);

        chemistry.printCourseName();

    }
}