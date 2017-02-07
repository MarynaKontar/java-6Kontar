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
    /**TODO    //if I don't know coursesTaken length I can use Course... coursesTaken(find in google),
     *  but I don't understand this. Can explain easier?
    */

    public void setCoursesTaken(Course... coursesTaken) {
        this.coursesTaken = coursesTaken;
    }
  /**  TODO if coursesTaken isn't empty I want to write names of courses (coursesTaken[i].getName()).
   *  But I don't know how I can check whether the array coursesTaken is empty.
   */
/*
   public String[] toStringCoursesTaken(Course... coursesTaken){
        if (coursesTaken ПУСТОЙ) return ????;//?null
        String[] s = new String[coursesTaken.length];
        for (int i = 0; i < s.length; i++) {
            s[i] = coursesTaken[i].getName();
        }
        return s;
    }
*/

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // TODO How can I check whether the array coursesTaken is empty?
    @Override
    public String toString() {
        return "Name: " + ((firstName == null)? "" : firstName) + " " +  lastName +
                "\nGroup: " + ((group == 0)? "" : group);
//                + ((coursesTaken.length == 0)? "" : toStringCoursesTaken(coursesTaken)) + "\n";
    }
}
