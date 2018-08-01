package collections_12;

import java.util.*;

public class Wallet {
   public static void main(String[] args) {
      Map<Coin,Integer> wallet = new LinkedHashMap<>();
      
      wallet.put(Coin.ONE_CENT, 2);
      wallet.put(Coin.TWO_CENT, 3);
      wallet.put(Coin.FIVE_CENT, 8);
      wallet.put(Coin.TEN_CENT, 1);
      wallet.put(Coin.TWENTY_CENT, 0);
      wallet.put(Coin.FIFTY_CENT, 9);
      wallet.put(Coin.ONE_EURO, 7);
      wallet.put(Coin.TWO_EURO, 1);
      
      int sum = 0;
      for(Coin c: wallet.keySet()){
         System.out.println(c.name() + " : " + wallet.get(c));
         sum+= c.getValue() * wallet.get(c);
      }
      
      System.out.println((sum/(float)100) + " € ");      
   }
}
