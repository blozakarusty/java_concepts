package io;

import java.io.Serializable;
import java.time.LocalDate;

public class Person implements Serializable {
   private String firstName;
   private String lastName;
   private LocalDate birthDay;
   
   public Person(String fname, String lname, LocalDate birthDay) {
      this.firstName = fname ;
      this.lastName = lname;
      this.birthDay = birthDay;
   }
      
   public String getFirstName() {
      return firstName;
   }
   
   public String getLastName() {
      return lastName;
   }
   
   public LocalDate getBirthDay() {
      return birthDay;
   }
}
