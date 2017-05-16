package module11.homeWork11;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by User on 18.04.2017.
 */
public class testFileUtils {
    public static void main(String[] args) {

        File myFile = new File("ExampleFile.txt");

        StringBuilder outPut = new StringBuilder();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(myFile));
            reader.lines().forEach(s -> outPut.append(s).append("\n"));
        } catch (IOException e ) {
            e.printStackTrace();
        }
        String fileContent = outPut.toString();
        System.out.println(fileContent);
        Map<String, String> map = new HashMap<> ();
        map.put("This", "That");
        map.put("first", "hello");
        System.out.println(replacer(map, fileContent));

        fileContentReplacer(map, fileContent, myFile);
        fileContentMerger(map, fileContent, myFile);
        System.out.println(checkWord("is"));

    }

    public static String replacer(Map<String, String> map, String source) {
        String replaced = source;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            replaced = replaced.replaceAll(entry.getKey(), entry.getValue());

        }
        return replaced;
    }

    public static File fileContentReplacer(Map<String, String> map, String fileContent, File file) {
        String newFile = replacer(map, fileContent);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter (file))) {
            writer.write(newFile);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file;
    }

    public static File fileContentMerger(Map<String, String> map, String fileContent, File file) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            writer.write("\n");
            writer.write(replacer(map, fileContent));
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file;
    }

    //use try:
    public static int checkWord(String word) {
        File myFile = new File("ExampleFile.txt");
        BufferedReader reader = null;
        int countTheSameWords = 0;
        try {
            reader = new BufferedReader(new FileReader(myFile));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\ |\\.");
                for (String s : words) {
                    System.out.println(s);
                    if (s.equals(word)) {
                        countTheSameWords++;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return countTheSameWords;
    }

    // use try-with-resources:
    public static int checkWordTryWithResources(String word) {
        File myFile = new File("ExampleFile.txt");
        int countTheSameWords = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(myFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\ |\\.");
                for (String s : words) {
                    if (s.equals(word)) {
                        countTheSameWords++;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return countTheSameWords;
    }
}
