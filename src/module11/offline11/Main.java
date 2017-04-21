package module11.offline11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by User on 20.04.2017.
 */
public class Main {

    public static void main(String[] args) {

        Person person1 = new Person("Peter1", "Parker1");
        Person person2 = new Person("Peter2", "Parker2");
        Person person3 = new Person("Peter3", "Parker3");
        Person person4 = new Person("Peter4", "Parker4");
        Person person5 = new Person("Peter5", "Parker5");
        Person person6 = new Person("Peter6", "Parker6");
        Person person7 = new Person("Peter7", "Parker7");
        Person person8 = new Person("Peter8", "Parker8");

        Division division1 = new Division(Arrays.asList(new Person[]{person1, person2}));
        Division division2 = new Division(Arrays.asList(new Person[]{person2, person5}));
        Division division3 = new Division(Arrays.asList(new Person[]{person2, person8}));
        Division division4 = new Division(Arrays.asList(new Person[]{person3, person7}));
        Division division5 = new Division(Arrays.asList(new Person[]{person4, person8}));
        Division division6 = new Division(Arrays.asList(new Person[]{person4, person5}));

        Company company1 = new Company("JAVA", Arrays.asList(new Division[]{division1, division3}));
        Company company2 = new Company("JAVA", Arrays.asList(new Division[]{division4, division5}));

        List<Company> listCompanies = new ArrayList<>();
        listCompanies.add(company1);
        listCompanies.add(company2);


    }

    List<String> getCompaniesPersonsSecondName(ArrayList<Company> companies) {
        companies.stream().map(company -> company.getDivisions().stream())
                .map(divisionsList -> divisionsList.)
    return companies.stream()
            .distinct().;
    }
}

