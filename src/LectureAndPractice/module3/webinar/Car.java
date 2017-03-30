package LectureAndPractice.module3.webinar;

import java.util.Vector;

public class Car extends Vehicle implements Comparable<Vehicle>{
    int year;
    String model;
    int price;
    String nameOfTheOwner;


    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public Car(int year, String model, int price, String nameOfTheOwner) {
        this.year = year;
        this.model = model;
        this.price = price;
        this.nameOfTheOwner = nameOfTheOwner;
    }



    //перегрузка метода
    int test(int a, String name) {
        return a - 5;
    }

    int test(int a, int b) {
        return a - 5;
    }

    void printOwnerName() {
        System.out.println(nameOfTheOwner);
    }

    void printYear() {
        System.out.println(this.year);
    }

    public int getPrice () {
        return price;
    }

    public void setPrice ( int price ) {
        this.price = price;
    }

    public static void main( String[] args) {


    }


    @Override
    public int compareTo ( Vehicle o ) {
        return getPrice () - o.getPrice ();
    }

    @Override
    public String toString () {
        final StringBuilder sb = new StringBuilder ( "Car{" );
        sb.append ( "year=" ).append ( year );
        sb.append ( ", model='" ).append ( model ).append ( '\'' );
        sb.append ( ", price=" ).append ( price );
        sb.append ( ", nameOfTheOwner='" ).append ( nameOfTheOwner ).append ( '\'' );
        sb.append ( '}' );
        return sb.toString ( );
    }

    public String getModel () {
        return model;
    }

    public int getYear () {
        return year;
    }
}
