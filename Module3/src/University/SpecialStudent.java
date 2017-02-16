package University;

/**
 * Java#6
 * Module 1 Home work 3
 * Class SpecialStudent that is child of CollegeStudent.
 * With additional fields long secretKey, String email.
 * Create three constructors: two the same as in CollegeStudent and one with secretKey field.
 * Create getters and setters for all fields and make fields private as OOP principle follows.
 * @author Kontar Maryna
 */
public class SpecialStudent extends CollegeStudent {

    private long secretKey;
    private String email;

    public SpecialStudent(String firstName, String lastName, int group) {
        super(firstName, lastName, group);
    }

    public SpecialStudent(String firstName, String lastName, int group,
                          Course[] coursesTaken, String collegeName, int rating, long id) {
        super(firstName, lastName, group, coursesTaken, collegeName, rating, id);
    }

//    public SpecialStudent(String firstName, String lastName, int group, long secretKey){
//        this(firstName, lastName, group);
//        this.secretKey = secretKey;
//    }

    //TODO 1.change SpecialStudent constructor
    public SpecialStudent(long secretKey){
            this(null,null,0);
            this.secretKey = secretKey;
    }

    public long getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(long secretKey) {
        this.secretKey = secretKey;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString(){
        return super.toString() + "\nemail: " + ((email == null)? "" : email + "\n");
    }
}
