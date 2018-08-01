package io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class PathExample {

    public static void main(String[] args) {

        Path path = Paths.get("C:\\Users\\vangike\\Desktop\\io\\firstFile.txt");

        // Create IO folder:
        try {
            Files.createDirectories(path.getParent());

            // Create firstFile.txt:
            if(Files.notExists(path)){
                Files.createFile(path);
            }

            List<String> test = Arrays.asList("Hello", "world", "test", "...");
            String toWrite = "Hello\nWorld\nanother line";

            // Write to file:
            Files.write(path, test);
            Files.write(path, toWrite.getBytes(), StandardOpenOption.APPEND);

            // Read from file:
            Files.lines(path).forEach(System.out::println);

            // Read Attributes
            Map<String, Object> map = Files.readAttributes(path, "*");
            map.forEach((key, value) -> System.out.println(key + "\t" + value));

        } catch (IOException e) {
            e.printStackTrace();
        }




    }


}
