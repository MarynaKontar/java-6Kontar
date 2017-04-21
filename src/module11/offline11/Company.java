package module11.offline11;

import java.util.List;

/**
 * Created by User on 20.04.2017.
 */
public class Company {

    private String companyName;
    private List<Division> divisions;

    public Company(String companyName, List<Division> divisions) {
        this.companyName = companyName;
        this.divisions = divisions;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public List<Division> getDivisions() {
        return divisions;
    }

    public List<Person> getPersons() {
        return divisions.stream().distinct().;
    }

    public void setDivisions(List<Division> divisions) {
        this.divisions = divisions;
    }
}


