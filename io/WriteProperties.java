package io;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class WriteProperties {

    public static void main(String[] args) {

        try(FileWriter writer = new FileWriter("test.properties")){

            Properties properties = new Properties();
            properties.setProperty("database.url", "someURL");
            properties.setProperty("database.password", "somePassword");
            properties.store(writer, "My first property file!");

        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
