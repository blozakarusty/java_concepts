package io;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
    public static void main(String[] args) {

        try(FileReader reader = new FileReader("test.properties")) {

            Properties properties = new Properties();
            properties.load(reader);

            properties.forEach((key, value) -> System.out.println(key + " " + value) );

            for(String key : properties.stringPropertyNames()){
                System.out.println(key);
                System.out.println(properties.getProperty(key));
            }

            properties.list(System.out);





        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
