package module4.zoo.mammal;

import module4.zoo.Animal;

/**
 * Created by citsym on 16.02.17.
 */
public class Monkey extends Animal {
    private int foodCount; //если Integer foodCount = 0 обязательно надо присвоить 0, иначе
    //Banana banana;
    private static int foodCountTotal;
//    private static Cage monkeyCage =
    {
        setFoodName ( "banana" );
    }

    public Monkey ( String name ) {
        setName ( name );
//        Comparable
//        mon
    }

    public int getFoodCount () {
        return foodCount;
    }

    public void setFoodCount ( int bananas ) {
        foodCountTotal -= foodCount;
        this.foodCount = bananas;
        foodCountTotal += foodCount;

    }

    public void increaseFoodCount ( int food ) {
        foodCount++;
        foodCountTotal++;
    }

}
