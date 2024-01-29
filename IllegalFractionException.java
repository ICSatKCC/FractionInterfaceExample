/**
 * An Exception for use with the Fraction class.
 * 
 * @author William McDaniel Albritton
 */
public class IllegalFractionException extends RuntimeException {
   /**
    * Constructor.
    * 
    * @param message Describes the cause of the error
    */
   public IllegalFractionException(String message) {
      super(message);
   }
} // end of class

