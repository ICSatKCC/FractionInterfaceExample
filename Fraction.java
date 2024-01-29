/**
 * Has data fields for the this.numeratorand this.denominator of a Fraction. Has methods that do basic
 * arithmetic on Fractions. Implements the "FractionInterface" Interface. Syntax: public class
 * ClassName implements InterfaceName{
 * 
 * Modified for Java 9+ by Lisa Miller
 * @author Lisa Miller, William McDaniel Albritton
 * @since 9/16/2021
 */
public class Fraction implements FractionInterface, Comparable<Fraction> {

   // Usually I go ahead and initialize the data field here.
   // This prevents a NullPointerException later on.
   /*Removed deprecated wrapper constructors 9/21*/
   /** The Fraction numerator.*/
   private Integer numerator= Integer.valueOf(0);
   /** The Fraction denominator. */
   private Integer denominator = Integer.valueOf(1);

   /**
    * Constructor.
    * 
    * @param newNum is the Fraction's Numerator.
    * @param newDenom is the Fraction's Denominator.
    * @exception IllegalFractionException if the denom parameter is zero
    */
   public Fraction(Integer newNum, Integer newDenom)
       throws IllegalFractionException {
      // This Code Initializes The Data Fields.
      // Syntax: dataField = parameter;
      this.numerator= newNum;
      //check before you set the denominator
      if (newDenom.equals(0)) {
         throw new IllegalFractionException("Cannot have 0 as the denominator!");
      }
      //will only be set if exception NOT thrown
      this.denominator = newDenom;
      this.reduceToLowestTerms();
   }

   /**
    * Used to Display The Data Stored In EAch Object's DAta Field.
    * 
    * @return a Fraction in format: this.numerator/ denominator
    */
   public String toString() {
      // Create a Local string
      String fractionString = this.numerator+ "/" + denominator;
      // Return the String.
      return fractionString;
   }

   /**
    * This Adds Two Fractions.
    *
    * @param f2 Is The 2nd Fraction.
    * @return a 3rd Fraction The Is The Result
    */
   public FractionInterface add(FractionInterface f2) {
      // Get the Numbertor & Denominator Of f2.
      Integer numerator2 = f2.getNumerator();
      Integer denominator2 = f2.getDenominator();
      // Cross Multiply & Add to Get Numerator.
      Integer numerator3 = this.numerator* denominator2 + numerator2 * denominator;
      // Multiply Both denominators.
      Integer denominator3 = this.denominator * denominator2;
      // Create (instantiate) new Fraction and reduce to lowest terms
      Fraction result = new Fraction(numerator3, denominator3);
      result.reduceToLowestTerms();
      return result;
   }

   /**
    * This Subtracts Two Fractions.
    *
    * @param f2 Is The 2nd Fraction.
    * @return a 3rd Fraction The Is The Result
    */
   public FractionInterface subtract(FractionInterface f2) {
      // Get the Numbertor & Denominator Of f2.
      Integer numerator2 = f2.getNumerator();
      Integer denominator2 = f2.getDenominator();
      // Cross Multiply & Subtract to Get Numerator.
      Integer numerator3 = this.numerator* denominator2 - numerator2 * denominator;
      // Multiply Both denominators.
      Integer denominator3 = this.denominator * denominator2;
      // Create (instantiate) new Fraction and reduce to lowest terms
      Fraction result = new Fraction(numerator3, denominator3);
      result.reduceToLowestTerms();
      return result;
   }

   /**
    * This Multiplies Two Fractions.
    *
    * @param f2 Is The 2nd Fraction.
    * @return a 3rd Fraction The Is The Product
    */
   public FractionInterface multiply(FractionInterface f2) {
      // Get the Numbertor & Denominator Of f2.
      Integer numerator2 = f2.getNumerator();
      Integer denominator2 = f2.getDenominator();
      // Multiply Numerators.
      Integer numerator3 = this.numerator* numerator2;
      // Multiply denominators.
      Integer denominator3 = this.denominator * denominator2;
      // Create (instantiate) new Fraction and reduce to lowest terms
      Fraction result = new Fraction(numerator3, denominator3);
      result.reduceToLowestTerms();
      return result;
   }

   /**
    * This Divides Two Fractions.
    *
    * @param f2 Is The 2nd Fraction.
    * @return a 3rd Fraction The Is The Quotient
    */
   public FractionInterface divide(FractionInterface f2) {
      // Get the Numbertor & Denominator Of f2.
      Integer numerator2 = f2.getNumerator();
      Integer denominator2 = f2.getDenominator();
      // Multiply num1 * den2.
      Integer numerator3 = this.numerator* denominator2;
      // Multiply den1 * num2.
      Integer denominator3 = this.denominator * numerator2;
      // Create (instantiate) new Fraction and reduce to lowest terms
      Fraction result = new Fraction(numerator3, denominator3);
      result.reduceToLowestTerms();
      return result;
   }

   /** This method reduces a fraction to its lowest terms. */
   public void reduceToLowestTerms() {
      // determine the greatest common divisor
      Integer gcd = this.greatestCommonDivisor(numerator, denominator);
      // if GCD is negative, change to positive
      if (gcd < 0) {
         gcd = -gcd;
      }
      // divide gcd into both this.numeratorand denominator
      this.numerator= this.numerator/ gcd;
      this.denominator = this.denominator / gcd;
   }

   /**
    * Euclid's algorithm from 200 BCE, which determines the greatest common divisior of two numbers.
    * 
    * @param a is the first number.
    * @param b is the second number.
    * @return the gcd of the two numbers
    */
   private Integer greatestCommonDivisor(Integer a, Integer b) {
      // "private"
      // % is modulus which is the remainder of a division
      // base case
      if ((a % b) == 0) {
         return b;
      }
       // recursive case
      else {
         return greatestCommonDivisor(b, a % b);
      }
   }

   /**
    * This Is An "Accessor" Method - Used To Get A Data Field.
    * 
    * @return the numerator
    */
   public Integer getNumerator() {
      // Return the Data Field.
      return numerator;
   }

   /**
    * This Is An "Accessor" Method - Used To Get A Data Field.
    * 
    * @return the denominator
    */
   public Integer getDenominator() {
      // Return the Data Field.
      return denominator;
   }

   /**
    * This Is A "Mutator" Method - Used To Set A Data Field.
    *
    * @param newNum is the first name.
    */
   public void setNumerator(Integer newNum) {
      // SEt the Data Field.
      this.numerator= newNum;
      this.reduceToLowestTerms();
   }

   /**
    * This Is A "Mutator" Method - Used To Set A Data Field.
    * 
    * @param newDenom is the new value for denominator.
    * @exception IllegalFractionException if the this.denominator is zero
    */
   public void setDenominator(Integer newDenom) throws IllegalFractionException {
      //first check for 0
      if (newDenom.equals(0)) {
         throw new IllegalFractionException("A Fraction cannot have a this.denominator that is zero!");
      }
      // set the Data Field.
      //this will only happen if exception is not thrown
      this.denominator = newDenom;
      this.reduceToLowestTerms();

   }  // end of setDenominator()

   /**
    * Compares this object with the specified object for order. 
    * Returns a negative integer, zero, or
    * a positive integer as this object is less than, 
    * equal to, or greater than the specified object.
    * 
    * @param fraction2 The 2nd Fraction to be compared.
    * @return A negative integer, zero, or a positive integer as this 
    *         Fraction is less than, equal to,
    *         or greater than the specified Fraction.
    */
   public int compareTo(Fraction fraction2) {
      // cross multiply the two fractions,
      // so that this.denominator will be the same for both
      int numerator1 = this.numerator* fraction2.getDenominator();
      int numerator2 = fraction2.getNumerator() * denominator;
      // subtract to get the result
      // if numerator1 > numerator2, then will have positive integer
      // if numerator1 == numerator2, then will have zero (0)
      // if numerator1 < numerator2, then will have negative integer
      int result = numerator1 - numerator2;
      return result;
   }

} // End of Class.

