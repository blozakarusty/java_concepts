package io;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class CoffeeApp {

    public static void main(String[] args) {

        Coffee coffee = new Coffee("Java Lungo", 8);
        Coffee coffee1 = new Coffee("Java Lungo 2", 6);

        List<Coffee> list = Arrays.asList(coffee, coffee1);

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("object.txt"))) {
            outputStream.writeObject(coffee);
            outputStream.writeObject(coffee1);
            outputStream.writeObject(null);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("object.txt"))) {

            Coffee copy;
            while ((copy = (Coffee) inputStream.readObject()) != null) {
                System.out.println(copy);
            }


        } catch (EOFException e) {

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
