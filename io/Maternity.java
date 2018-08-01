package io;
import java.io.*;
import java.time.*;

public class Maternity {
   public static void main(String[] args) throws Exception {
      File file = new File("person.dat");
      try (FileOutputStream fis = new FileOutputStream(file);
         ObjectOutputStream oos = new ObjectOutputStream(fis);) {
         LocalDate birthDay = LocalDate.now();
         Person baby = new Person("Homer", "Simpson", birthDay);
         oos.writeObject(baby);
      }
   }
}
