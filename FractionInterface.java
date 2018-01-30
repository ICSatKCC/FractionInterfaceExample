/**
 * Interface is a list of method prototypes that other classes must implement (like a contract)
 * 
 * @author William McDaniel Albritton
 */
public interface FractionInterface {

  /**
   * This Adds Two Fractions Together.
   * 
   * @param fraction2 Is The 2nd Fraction.
   * @return a 3rd Fraction The Is The Result
   */
  public FractionInterface add(FractionInterface fraction2);

  /**
   * This Subtracts Two Fractions Together.
   * 
   * @param fraction2 Is The 2nd Fraction.
   * @return a 3rd Fraction The Is The Result
   */
  public FractionInterface subtract(FractionInterface fraction2);

  /**
   * This Multiplies Two Fractions .
   * 
   * @param fraction2 Is The 2nd Fraction.
   * @return a 3rd Fraction The Is The Product
   */
  public FractionInterface multiply(FractionInterface fraction2);

  /**
   * This Divides Two Fractions .
   * 
   * @param fraction2 Is The 2nd Fraction.
   * @return a 3rd Fraction The Is The Quotient
   */
  public FractionInterface divide(FractionInterface fraction2);

  /** This method reduces a fraction to its lowest terms. */
  public void reduceToLowestTerms();

  /**
   * This Is An "Accessor" Method - Used To Get A Data Field.
   * 
   * @return the numerator
   */
  public Integer getNumerator();

  /**
   * This Is An "Accessor" Method - Used To Get A Data Field.
   * 
   * @return the denominator
   */
  public Integer getDenominator();

  /**
   * This Is A "Mutator" Method - Used To Set A Data Field.
   * 
   * @param numeratorParameter is the first name.
   */
  public void setNumerator(Integer numeratorParameter);

  /**
   * This Is A "Mutator" Method - Used To Set A Data Field.
   * 
   * @param lastNameParameter is the last name.
   * @exception IllegalFractionException if the denominator is zero
   */
  public void setDenominator(Integer denominatorParameter) throws IllegalFractionException;

}// End of interface.

