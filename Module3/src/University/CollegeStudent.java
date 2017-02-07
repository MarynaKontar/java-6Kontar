package University;

/**
 * Java#6
 * Module 1 Home work 3
 * CollegeStudent that is a child of Student. With additional fields:
 * String collegeName, int rating, long id.
 * Create three constructors: two the same as in Student and one with all the fields of the class.
 * Create getters and setters for all fields and make fields private as OOP principle follows.
 * @author Kontar Maryna
 */
public class CollegeStudent extends Student {

    private String collegeName;
    private int rating;
    private long id;

    public CollegeStudent(String firstName, String lastName, int group) {
        super(firstName, lastName, group);
    }

    public CollegeStudent(String lastName, Course[] coursesTaken) {
        super(lastName, coursesTaken);
    }

    public CollegeStudent(String firstName, String lastName, int group, Course[] coursesTaken,
                          String collegeName, int rating, long id) {
        super(firstName, lastName, group);
        setCoursesTaken(coursesTaken);
        this.collegeName = collegeName;
        this.rating = rating;
        this.id = id;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString(){
        return super.toString() + "\nCollege name is: " +
                ((collegeName == null)? "" : collegeName) +
                "\nRating: " + rating + "\nID: " + id;
    }
}
