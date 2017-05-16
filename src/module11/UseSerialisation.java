package module11;

import LectureAndPractice.module3.webinar.Car;

import java.io.*;

/**
 * Created by User on 26.04.2017.
 */
public class UseSerialisation {
    public static void main ( String[] args ) throws IOException, ClassNotFoundException {

        Car myCar = new Car();
        myCar.setName("My car") ;//Моя машина

        Car yourCar = new Car();
        yourCar.setName("Your car") ;//Твоя машина

        try(ObjectOutputStream out = new ObjectOutputStream ( new FileOutputStream ( "test.txt" ) )){
           out.writeObject ( myCar );
           out.writeObject ( yourCar);
        }


        try(ObjectInputStream out = new ObjectInputStream ( new FileInputStream ( "test.txt" ) )){
            Car myCarCopy = (Car) out.readObject ();
            Car yourCarCopy = (Car) out.readObject ();

            System.out.println (myCarCopy.getName () );
            System.out.println (yourCarCopy.getName () );

        }
    }
}
