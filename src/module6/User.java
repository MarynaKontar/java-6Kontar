package module6;

import java.util.Date;

/**
 * Java#6
 * Module 6 Task 2
 * Create User class with fileds
 * long id
 * String firstName
 * lastName
 * int salary
 * int balance
 * and constructor with all fields.
 * Note, class User is immutable.
 *
 * @author Kontar Maryna
 */

public final class User {

   final private long id;
   final private String firstName;
   final private String lastName;
   final private int salary;
   final private int balance;

    public User(long id, String firstName, String lastName, int salary, int balance) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.balance = balance;
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSalary() {
        return salary;
    }

    public int getBalance() {
        return balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

       // if (id != user.id) return false;
        if (salary != user.salary) return false;
        if (balance != user.balance) return false;
        if (firstName != null ? !firstName.equals(user.firstName) : user.firstName != null) return false;
        return lastName != null ? lastName.equals(user.lastName) : user.lastName == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + salary;
        result = 31 * result + balance;
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("id=").append(id);
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", salary=").append(salary);
        sb.append(", balance=").append(balance);
        sb.append('}');
        return sb.toString();
    }

    //TODO 4. я так понимаю, что для String оверрайдили знак равенства = так, что при сложении строк
    //"User" + "id" все равно, что
    // StringBuilder sb = new StringBuilder("User{");
    //        sb.append("id=").append(id);
    //?????
}




/*
https://docs.oracle.com/javase/tutorial/essential/concurrency/imstrat.html
* The following rules define a simple strategy for creating immutable objects.
*
Don't provide "setter" methods — methods that modify fields or objects referred to by fields.
Make all fields final and private.
Don't allow subclasses to override methods. The simplest way to do this is to declare the class as final.
A more sophisticated approach is to make the constructor private and construct instances in factory methods.
If the instance fields include references to mutable objects, don't allow those objects to be changed:
Don't provide methods that modify the mutable objects.
Don't share references to the mutable objects. Never store references to external, mutable objects passed
to the constructor; if necessary, create copies, and store references to the copies. Similarly,
create copies of your internal mutable objects when necessary to avoid returning the originals in your methods.
* */