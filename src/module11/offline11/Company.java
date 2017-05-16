package module11.offline11;

import java.util.List;

/**
 * Created by User on 20.04.2017.
 */
public class Company {

    private String companyName;
    private List<Division> divisions;

    public Company ( List <Division> divisions ) {
        this.divisions = divisions;
    }

    public List<Division> getListDivision () {
        return divisions;
    }


}


