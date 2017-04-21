package module9;

/**
 * Created by User on 30.03.2017.
 */
public class Cat {
Shacable tail = new Tail();
void shakeATail(){
    tail.shake();

}

    private class Tail implements Shacable {

        @Override
        public void shake() {
            System.out.println("module9.Cat shake the tail");
        }
    }
}
