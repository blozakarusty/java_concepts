package collections_01;

import java.util.*;

public class StringListApp {

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      List<String> words = new ArrayList<String>();
      
      String word = null;
      do {         
         word = scanner.next();
         words.add(word);         
      }
      while(!word.endsWith("."));
      
      for(int i = words.size(); i > 0; i--) {
         System.out.println(words.get(i-1));
      }
      
      System.out.println("Number of words: " + words.size());     
      
      String[] wa = words.toArray(new String[0]);
      for(String s: wa) {
         System.out.print(s + " ");
      }
      
   }
}
