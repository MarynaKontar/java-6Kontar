package LectureAndPractice.module3.webinar.phones;

public class IPhone extends Phone {
    private String displayModel;

    public IPhone(String displayModel) {
        this.displayModel = displayModel;
    }

    public IPhone(int cost, String model, String manufacturer) {
        super(cost, model, manufacturer);
        //this
        //super
    }

    public static void main(String[] args) {

    }
}
