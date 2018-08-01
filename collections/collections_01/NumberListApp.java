package collections_01;

import java.util.*;

public class NumberListApp {

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter numbers (stop with 0):");
      List<Integer> numbers = new ArrayList<Integer>();
      int number = 0;
      while((number=scanner.nextInt()) != 0) {
         numbers.add(number);
      }
      int sum = 0;
      for(int i = 1; i <= numbers.size(); i++) {
         System.out.println(i + " : " + numbers.get(i -1));
         sum+= numbers.get(i-1);
      }
      
      System.out.println("Sum : " + sum);
      System.out.println("Avg : " + sum/numbers.size());
      
      //Integer[] na = numbers.toArray(new Integer[numbers.size()]);
      Integer[] na = numbers.toArray(new Integer[0]);
      
      for(int i: na) {
         System.out.println(i);
      }
   }
}
