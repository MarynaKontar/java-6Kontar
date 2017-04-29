package module4.zoo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 13.03.2017.
 */
public class Cage {
    private int area;
    private ArrayList<Animal> animals = new ArrayList <> (  );

    public Cage ( int area ) {
        this.area = area;
    }
public void addAnimalToCage(Animal animal){
        animals.add ( animal );
}
public List<Animal> getAllAnimalsInCage(){
    return animals;
}

}
