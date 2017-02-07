package University;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Java#6
 * Module 1 Home work 3
 * Class Course with fields: Date startDate, String name, int hoursDuration, String teacherName.
 * Create two constructors with fields startDate, name; and hoursDuration, name, teacherName.
 * Create getters and setters for all fields and make fields private as OOP principle follows.
 * @author Kontar Maryna
 */
public class Course {

    private Calendar startDate = new GregorianCalendar();
    private String name;
    private int hoursDuration = 120;
    private String teacherName;

    public Course(Calendar startDate, String name) {
        this.startDate = startDate;
        this.name = name;
        teacherName = "Super Teacher";// :))
    }

    public Course(int hoursDuration, String name, String teacherName){
        this.hoursDuration = hoursDuration;
        this.name = name;
        this.teacherName = teacherName;
    }

    public Calendar getStartDate() {
        return startDate;
    }

    public void setStartDate(Calendar startDate) {
        this.startDate = startDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHoursDuration() {
        return hoursDuration;
    }

    public void setHoursDuration(int hoursDuration) {
        this.hoursDuration = hoursDuration;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    @Override
    public String toString() {
        return name;
    }
}
