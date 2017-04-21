package module11.offline11;

import java.util.List;

/**
 * Created by User on 20.04.2017.
 */
public class Division {
    private String divisionName;

    public String getDivisionName() {
        return divisionName;
    }

    public void setDivisionName(String divisionName) {
        this.divisionName = divisionName;
    }

    private List<Person> persons;

    public Division() {
    }

    public Division(List<Person> persons) {
        this.persons = persons;
    }

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }
}
