package module7.task1_2_3;

/**
 * Java#6
 * Module 7 Task 1
 *
 * @author Kontar Maryna
 */
public class User implements Comparable<User>{

    private static long counter;
    private final long id = counter++;
    private String firstName;
    private String lastName;
    private String city;
    private int balance;

    public User ( String firstName, String lastName, String city, int balance ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.balance = balance;
    }

    public long getId () {
        return id;
    }

    public String getFirstName () {
        return firstName;
    }

    public void setFirstName ( String firstName ) {
        this.firstName = firstName;
    }

    public String getLastName () {
        return lastName;
    }

    public void setLastName ( String lastName ) {
        this.lastName = lastName;
    }

    public String getCity () {
        return city;
    }

    public void setCity ( String city ) {
        this.city = city;
    }

    public int getBalance () {
        return balance;
    }

    public void setBalance ( int balance ) {
        this.balance = balance;
    }

    /**
     * users are equal when equals all Users fields except id
     * @param o
     * @return
     */
    @Override
    public boolean equals ( Object o ) {
        if (this == o) return true;
        if (o == null || getClass ( ) != o.getClass ( )) return false;

        User user = (User) o;

        if (getBalance ( ) != user.getBalance ( )) return false;
        if (getFirstName ( ) != null ? !getFirstName ( ).equals ( user.getFirstName ( ) ) : user.getFirstName ( ) != null)
            return false;
        if (getLastName ( ) != null ? !getLastName ( ).equals ( user.getLastName ( ) ) : user.getLastName ( ) != null)
            return false;
        return getCity ( ) != null ? getCity ( ).equals ( user.getCity ( ) ) : user.getCity ( ) == null;
    }

    @Override
    public int hashCode () {
        int result = getFirstName ( ) != null ? getFirstName ( ).hashCode ( ) : 0;
        result = 31 * result + (getLastName ( ) != null ? getLastName ( ).hashCode ( ) : 0);
        result = 31 * result + (getCity ( ) != null ? getCity ( ).hashCode ( ) : 0);
        result = 31 * result + getBalance ( );
        return result;
    }

    /**
     * Importance's order of the fields is: balance, lastName, firstName, city
     * (does not consider id)
     * (In general, it is specified by the product owner)
     * @param o
     * @return
     */
    @Override
    public int compareTo ( User o ) {
        int balanceComparision = ((Integer) getBalance ()).compareTo ( o.getBalance () );
        if (balanceComparision != 0) return balanceComparision;

        int lastNameComparision = getLastName ().compareTo ( o.getLastName () );
        if (lastNameComparision != 0 ) return lastNameComparision;

        int firstNameComparision = getFirstName ().compareTo ( o.getFirstName () );
        if (firstNameComparision != 0 ) return firstNameComparision;

        return getCity ().compareTo ( o.getCity () );
    }
}
