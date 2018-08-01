package collections_09.graphics;

/**
 * Scaleable objects
 * 
 * @author Noel Vaes
 * @version 1.0
 */
public interface Scaleable {
   /**
    * Scale the object.
    * 
    * @param factor
    *           Scale factor (%)
    */
   public abstract void scale(int factor);

   /** Scale 25% */
   public static final int QUARTER = 25;
   /** Scale 50% */
   public static final int HALF = 50;
   /** Scale 200% */
   public static final int DOUBLE = 200;
}
