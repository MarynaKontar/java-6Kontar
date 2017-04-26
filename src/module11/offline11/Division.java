package module11.offline11;

import java.util.List;

/**
 * Created by User on 20.04.2017.
 */
public class Division {
    private String divisionName;
    private List<Person> listPerson;

    public Division ( String divisionName, List <Person> listPerson ) {
        this.divisionName = divisionName;
        this.listPerson = listPerson;
    }

    public String getDivisionName() {
        return divisionName;
    }

    public List<Person> getListPerson () {
        return listPerson;
    }

}
