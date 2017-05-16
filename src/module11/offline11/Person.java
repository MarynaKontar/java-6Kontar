package module11.offline11;

/**
 * Created by User on 20.04.2017.
 */
public class Person {
    private String name;
    private String lastName;

    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName () {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

//    @Override
//    public String toString() {
//        final StringBuilder sb = new StringBuilder("Person{");
//        sb.append("name='").append( name ).append('\'');
//        sb.append(", lastName='").append(lastName).append('\'');
//        sb.append('}');
//        return sb.toString();
//    }
}
