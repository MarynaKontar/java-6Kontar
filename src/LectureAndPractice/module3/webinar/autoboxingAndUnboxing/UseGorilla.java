package LectureAndPractice.module3.webinar.autoboxingAndUnboxing;

/**
 * Created by User on 10.02.2017.
 */
public class UseGorilla {
    public static void main(String[] args) {
        Gorilla gorillaLucy = new Gorilla(110,"Lucy");

        System.out.println("Arms amount" + gorillaLucy.getArmsAmount());
        System.out.println("Blood liters of Lucy " + gorillaLucy.getBloodSystem().getBloodLitrs());

        gorillaLucy.setNutsCount(1000);

        UseOtherGorilla.main(new String[0]);
        System.out.println(gorillaLucy.getName());
    }
}
