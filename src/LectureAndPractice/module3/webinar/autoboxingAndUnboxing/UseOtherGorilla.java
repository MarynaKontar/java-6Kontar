package LectureAndPractice.module3.webinar.autoboxingAndUnboxing;

/**
 * Created by User on 10.02.2017.
 */
public class UseOtherGorilla {
    public static void main(String[] args) {
        Gorilla gorillaVasya = new Gorilla(100, "Vasya");
        gorillaVasya.setNutsCount(2000);
        System.out.println(gorillaVasya.getName());
        System.out.println(gorillaVasya.getNutsCount());
    }
}
