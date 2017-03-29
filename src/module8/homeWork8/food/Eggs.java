package module8.homeWork8.food;

import module8.homeWork8.Country;

/**
 * Created by User on 26.03.2017.
 */
public class Eggs extends Food implements StoredInTheRefrigerator {

    public Eggs ( String name, Country country, int expiration ) {
        super ( name, country, expiration );
    }

    @Override
    public boolean shouldBeStoredInTheRefrigerator () {
        return true;
    }
}
