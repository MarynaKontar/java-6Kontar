package Birds;

/**
 * Java#6
 * Module 1 Home work 1
 * add a sing method to the Birds.Bird class, then modify themain method accordingly
 * so that the code prints the following lines:
 I am walking
 I am flying
 I am singing
 I am Birds.Bird
 * @author Kontar Maryna
 */
public class SolutionBird {
    public static void main(String[] args) {

        //BIRD
        Bird bird = new Bird();
        String[] song = {"I am walking", "I am flying", "I am singing","I am Birds.Bird"};
        bird.sing(song);
    }
}
