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
		// ...existing code...
