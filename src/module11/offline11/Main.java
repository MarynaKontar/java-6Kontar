package module11.offline11;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by User on 20.04.2017.
 * Есть компания, в ней два отдела (division). В каждом отделе по три работника.
 * Работники могут работать в разных отделах и компаниях (т.е. могут повторяться)
 * Написать функцию, которой дается список компаний, а она выводит список работнков
 */
public class Main {

    public static void main ( String[] args ) {

        // prepare data
        List <Company> listCompanies = new ArrayList <> ( );
        listCompanies.add ( createCompany ( "Oranta" ) );
        listCompanies.add ( createCompany ( "ATB" ) );
        listCompanies.add ( createCompany ( "Private Bank" ) );

        // execute code
        // Вывести список всех работников из списка компаний (работников без повторений)
        List <String> lastNames = getLastNamesList ( listCompanies );

        // check the result
        lastNames.forEach ( System.out::println );

    }

    private static Company createCompany ( String companyName ) {
        List <Division> listDivisions = new ArrayList <> ( );

        listDivisions.add ( createDivision ( "IT", companyName ) );
        listDivisions.add ( createDivision ( "Finance", companyName ) );

        return new Company ( listDivisions );
    }

    private static Division createDivision ( String divisionName, String companyName ) {

        List <Person> listPerson = new ArrayList <> ( );
        listPerson.add ( new Person ( "Peter1", companyName + "Parker1" ) );
        listPerson.add ( new Person ( "Peter2", companyName + divisionName + "Parker2" ) );
        listPerson.add ( new Person ( "Peter3", companyName + divisionName + "Parker3" ) );
        return new Division ( divisionName, listPerson );
    }

    private static List <String> getLastNamesList ( List <Company> listCompanies ) {
        return listCompanies.stream ( )
                .flatMap ( company -> company.getListDivision ( ).stream ( ) )
//                .filter ( division -> division.getDivisionName ().equalsIgnoreCase ( "IT" ) )//оставить в стриме только те, у которых имя отдела - IT
                .flatMap ( division -> division.getListPerson ( ).stream ( ) )
//                .limit ( 5 ) //оставить только первые пять person
                .map ( person -> person.getLastName ( ) )
                .distinct ( )//только уникальные
                .collect ( Collectors.toList ( ) );
    }
}

