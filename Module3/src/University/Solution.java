package University;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Java#6
 * Module 1 Home work 3
 * Create 5 objects Course class. Create objects of others classes using every constructor.
 * You must have 13 objects in Solution class.
 * @author Kontar Maryna
 */
public class Solution {
    public static void main(String[] args) {

        //Declare and initialize the data of courses begin
        Calendar startOfCourse = new GregorianCalendar(2017,8,01);

        Course[] courses = new Course[5];

        //Initialize courses
        Course art = new Course(startOfCourse ,"Art");
        Course javaForAndroid = new Course(60, "Java for Android",
                "Dr. Douglas C. Schmidt");
        javaForAndroid.setStartDate(startOfCourse);

        Course algorithms = new Course(startOfCourse ,"Algorithms");
        algorithms.setHoursDuration(150);
        algorithms.setTeacherName("Kevin Wayne");

        Course programmingLanguages = new Course(startOfCourse ,"Programming Languages");
        Course softSkills = new Course(startOfCourse ,"Soft Skills");

        //Create array of courses
        //TODO What is better to create an array of courses? And why?
        createCoursesArray(courses, art, javaForAndroid, algorithms,
                programmingLanguages, softSkills);
        //courses = new Course[]{art, javaForAndroid, algorithms, programmingLanguages, softSkills};

        //Initialize students
        Student rosovskiy = new Student("Pavel", "Rosovskiy", 7);
        Student ivashkov = new Student("Ivashkov", new Course[] {courses[0], courses[1]});

        CollegeStudent hizun = new CollegeStudent("Hizun", courses);
            hizun.setCollegeName("Washington");
        CollegeStudent kontar = new CollegeStudent("Maryna", "Kontar", 7,
                new Course[] {courses[1], courses[2], courses[3], courses[4]},
                "GoIt", 0, 4567623);
        CollegeStudent burtsev = new CollegeStudent("Vladimir", "Burtsev", 6);
            burtsev.setCollegeName("GoIt");
            burtsev.setCoursesTaken(courses);

        SpecialStudent ponomarenko = new SpecialStudent("Andrey", "Ponomarenko",
                4);
        SpecialStudent firsov = new SpecialStudent("Alexsandr", "Firsov",
                5, courses, "GoIt", 0, 678560);
//        SpecialStudent gingembre = new SpecialStudent("Guillaume", "Gingembre",
//                7, 455646767);
        SpecialStudent gingembre = new SpecialStudent(455646767);
            gingembre.setFirstName("Guillaume");
            gingembre.setLastName("Gingembre");
            gingembre.setEmail("gguillaume@gmail.com");





        //output information about students
        System.out.println(rosovskiy.toString());
        System.out.println(ivashkov.toString());
        System.out.println(hizun.toString());
        System.out.println(kontar.toString());
        System.out.println(burtsev.toString());
        System.out.println(ponomarenko.toString());
        System.out.println(firsov.toString());
        System.out.println(gingembre.toString());
    }

    /**
     * Create array of courses
     * @param courses
     * @param art
     * @param javaForAndroid
     * @param algorithms
     * @param programmingLanguages
     * @param softSkills
     */
    private static void createCoursesArray(Course[] courses, Course art, Course javaForAndroid, Course algorithms, Course programmingLanguages, Course softSkills) {
        courses[0] = art;
        courses[1] = javaForAndroid;
        courses[2] = algorithms;
        courses[3] = programmingLanguages;
        courses[4] = softSkills;
    }
}
