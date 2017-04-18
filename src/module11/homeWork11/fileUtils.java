package module11.homeWork11;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.stream.Stream;

/**
 * Created by User on 18.04.2017.
 */
public class fileUtils {


    /**
     * You should create method which replace words in the File and returns String with replaced values
     * a) read file, save to string var
     * b) replace words
     * c) return new string
     * Как я понимаю, передается меп ,где ключ - слово, которое нужно заменить,
     * значение - слово, которым нужно заменить
     * @param map
     * @return
     */
    String replacer(Map<String, String> map){
        //TODO
        String fileName = "c://lines.txt";
        //read file into stream, try-with-resources
        try (Stream<String> stream = Files.lines( Paths.get(fileName))) {

            stream.forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    /**
     * You should create method which replace words in the File and rewrite File content with new values
     * a) read file, save to string var
     * b) replace words
     * c) rewrite file with string
     * @param map
     * @return
     */
    File fileContentReplacer( Map<String, String> map){
        //TODO

        return new File ( "" );
    }

    /**
     * You should create method which replace words in the File and write result to existing File content
     * a) read file, save to string var
     * b) replace words
     * c) add string to the existing file content
     * @param map
     * @return
     */
    File fileContentMerger(Map<String, String> map){
        //TODO

        return new File ( "" );
    }

    /**
     * Check if file contains particular word. Pring 0 if no. Print number n which equals number of times it is contained in the file
     * a) read file, save to string var
     * b) calculate how many time the word occurs
     * c) print result
     * @param word
     * @return
     */
    int checkWord(String word){
        //TODO

        return 0;
    }
}
