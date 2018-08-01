package io;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class IOExample {

    public static void main(String[] args) {

        File file = new File("C:\\Users\\vangike\\Desktop\\io\\secondFile.txt");
        File file1 = new File("C:\\Users\\vangike\\Desktop\\io\\new\\another\\secondFile.txt");

        Path path = Paths.get("C:\\Users\\vangike\\Desktop\\io\\firstFile.txt");

        try(BufferedReader reader  = Files.newBufferedReader(path)) {


        } catch (IOException e) {
            e.printStackTrace();
        }

        if (file1.getParentFile().mkdirs()) {
            System.out.println("created");
        } else {
            System.out.println("Not created");
        }

        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // WRITE TO THE FILE
        // READ FROM A FILE
        try (Writer writer = new FileWriter(file); BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
//            writer.write("My first IO lesson!");

            bufferedWriter.write("My first line");
            bufferedWriter.newLine();
            bufferedWriter.write("My Second line", 3, 6);

        } catch (IOException e) {
            e.printStackTrace();
        }

        try (Reader reader = new FileReader(file); BufferedReader bufferedReader = new BufferedReader(reader)) {
//            int character;
//            while ((character = reader.read()) != -1) {
//                System.out.println((char) character);
//            }

            String line;
            while((line=bufferedReader.readLine()) != null){
                System.out.println(line);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
