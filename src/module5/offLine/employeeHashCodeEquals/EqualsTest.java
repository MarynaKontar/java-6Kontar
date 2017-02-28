package module5.offLine.employeeHashCodeEquals;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by User on 27.02.2017.
 */
public class EqualsTest {

    public static void main(String[] args)
    {
        Employee e1 = new Employee();
        Employee e2 = new Employee();

        e1.setId(100);
        e2.setId(100);

        //Печатает 'false' если не переопределен в Employee
        // и 'true' - если переопределен
        System.out.println(e1.equals(e2));

        Set employees = new HashSet();
        employees.add(e1);
        employees.add(e2);

        //Печатает два объекта, если hashCode не  переопределен в Employee
        // и один бъект - если переопределен
        System.out.println(employees);
    }
}
