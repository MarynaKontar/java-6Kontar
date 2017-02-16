package LectureAndPractice.module3.webinar.autoboxingAndUnboxing;

/**
 * Created by User on 10.02.2017.
 */
public class Gorilla {
    private int armsAmount = 2;
    private int legsAmount = 2;
    private BloodSystem bloodSystem = new BloodSystem();
    int nutsCount = 10;
    private  String  name;
    private String secondName = "Pupkiny";

    public Gorilla(int nutsCount, String name) {
        this.nutsCount = nutsCount;
        this.name = name;
        System.out.println("Legs + Arms = " + getArmsAmount() + getLegsAmount());
//        System.out.println("Legs + Arms" + this.getArmsAmount() + this.getLegsAmount());
    }

    public int getArmsAmount() {
        return armsAmount;
    }

    public int getLegsAmount() {
        return legsAmount;
    }

    public int getNutsCount() {
        return nutsCount;
    }

    public String getName() {
        return name + " " + secondName;
    }

    public BloodSystem getBloodSystem() {
        return bloodSystem;
    }

    public void increase(){
        nutsCount++;
    }

    class BloodSystem{
        int bloodLitrs = 6;

        public BloodSystem(){
            Gorilla.this.increase();//nuts
            this.increase();//blood

        }

        public int getBloodLitrs() {
            return bloodLitrs;
        }

        void increase(){
            if (nutsCount >= 100) {
                bloodLitrs++;
            }
        }
    }

    public void setNutsCount(int nutsCount) {
        if (nutsCount > 1500) {
            System.out.println("Too much nuts for " + name+ ".");
        return;}
        System.out.println("Log: gorilla " + name + "received "+  nutsCount + " nuts");
        this.nutsCount = nutsCount;
    }
}
