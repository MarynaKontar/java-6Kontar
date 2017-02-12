package University;

import com.sun.xml.internal.bind.v2.TODO;

/**
 * Java#6
 * Module 1 Home work 3
 * Class Student with fields: String firstName, String lastName, int group,
 * Course[] coursesTaken, int age.
 * With 2 constructors firstName, lastName, group; and lastName, coursesTaken.
 * Create getters and setters for all fields and make fields private as OOP principle follows.
 * @author Kontar Maryna
 */
public class Student {

    private String firstName;
    private String lastName;
    private int group;
    private Course[] coursesTaken;
    private int age;

    public Student(String firstName, String lastName, int group) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
    }

    public Student(String lastName, Course[] coursesTaken) {
        this.lastName = lastName;
        this.coursesTaken = coursesTaken;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public Course[] getCoursesTaken() {
        return coursesTaken;
    }

    /**TODO  if I don't know coursesTaken length I can use Course... coursesTaken,
     * void setCoursesTaken(Course[] coursesTaken) also works. What variant I need to use?
     * When I debbug, I have not noticed a difference
    */
    public void setCoursesTaken(Course... coursesTaken) { //setCoursesTaken(Course[] coursesTaken)
        this.coursesTaken = coursesTaken;
    }

    /**
     * This return string of courses taken by student
     * TODO Do I correctly add strings?
     * @param coursesTaken
     * @return
     */
   public StringBuilder toStringCoursesTaken(Course[] coursesTaken) {
       StringBuilder s = new StringBuilder();
       if (coursesTaken != null) {
           for (int i = 0; i < coursesTaken.length; i++) {
               s.append(coursesTaken[i].getName() + ", ");
           }
           s.deleteCharAt(s.length() - 2);// delete last ","
           return s;
       }
       return s;
   }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /**
     * This return information about student in string
     * @return
     */
    @Override
    public String toString() {
        return "Name: " + ((firstName == null)? "" : firstName) + " " +  ((lastName == null)? "" : lastName) +
                "\nGroup: " + ((group == 0)? "" : group) +
                "\nCourses taken: " + toStringCoursesTaken(coursesTaken);
    }
}
