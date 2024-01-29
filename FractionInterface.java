/**
 * A list of method prototypes that other classes must implement.
 * All methods are by default public, no need to list
 * @author William McDaniel Albritton
 */
public interface FractionInterface {

   /**
    * This Adds Two Fractions Together.
    * 
    * @param fraction2 Is The 2nd Fraction.
    * @return a 3rd Fraction The Is The Result
    */
   FractionInterface add(FractionInterface fraction2);

   /**
    * This Subtracts Two Fractions Together.
    * 
    * @param fraction2 Is The 2nd Fraction.
    * @return a 3rd Fraction The Is The Result
    */
   FractionInterface subtract(FractionInterface fraction2);

   /**
    * This Multiplies Two Fractions .
    * 
    * @param fraction2 Is The 2nd Fraction.
    * @return a 3rd Fraction The Is The Product
    */
   FractionInterface multiply(FractionInterface fraction2);

   /**
    * This Divides Two Fractions .
    * 
    * @param fraction2 Is The 2nd Fraction.
    * @return a 3rd Fraction The Is The Quotient
    */
   FractionInterface divide(FractionInterface fraction2);

   /** This method reduces a fraction to its lowest terms. */


   /**
    * This Is An "Accessor" Method - Used To Get A Data Field.
    * 
    * @return the numerator
    */
   Integer getNumerator();

   /**
    * This Is An "Accessor" Method - Used To Get A Data Field.
    * 
    * @return the denominator
    */
   Integer getDenominator();

   /**
    * This Is A "Mutator" Method - Used To Set A Data Field.
    * 
    * @param newNumerator is the first name.
    */
   void setNumerator(Integer newNumerator);

   /**
    * This Is A "Mutator" Method - Used To Set A Data Field.
    * 
    * @param newDenominator is the denominator.
    * @exception IllegalFractionException if the denominator is zero
    */
   void setDenominator(Integer newDenominator) throws IllegalFractionException;

} // End of interface.

