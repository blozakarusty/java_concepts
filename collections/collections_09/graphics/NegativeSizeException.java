package collections_09.graphics;
/**
 * This exceptions is thrown when negative sizes are used at places where
 * negative dimensions are not allowed.
 * 
 * @author Noel Vaes
 * @version 1.0
 */
public class NegativeSizeException extends RuntimeException {

   public NegativeSizeException() {
      super();
   }

   public NegativeSizeException(String message, Throwable cause,
         boolean enableSuppression, boolean writableStackTrace) {
      super(message, cause, enableSuppression, writableStackTrace);
   }

   public NegativeSizeException(String message, Throwable cause) {
      super(message, cause);
   }

   public NegativeSizeException(String message) {
      super(message);
   }

   public NegativeSizeException(Throwable cause) {
      super(cause);
   }
   
}
