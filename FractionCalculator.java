//displays mini-windows
import javax.swing.JOptionPane;

/**
 * Ask user for numerator & denominator of two Fractions. Output fraction addition, subtraction,
 * multiplication, and division using the Fraction class
 * 
 * @author William McDaniel Albritton
 */
public class FractionCalculator {

  /**
   * main() method: begins program
   * 
   * @param arguments is not used
   */
  public static void main(String[] arguments) {

    // Create two Default Fraction object
    // If A Class Implements an Interface,
    // Then We Can Use The Interface To Declare A Variable.
    // Syntax: InterfaceName variableName = new Constructor(parameters);
    FractionInterface fraction1 = new Fraction(0, 1);
    FractionInterface fraction2 = new Fraction(0, 1);
    FractionInterface fraction3 = new Fraction(0, 1);
    // get user input
    String number1 = JOptionPane.showInputDialog("Please enter the numerator");
    String number2 = JOptionPane.showInputDialog("Please enter the denominator");
    String number3 = JOptionPane.showInputDialog("Please enter the 2nd numerator");
    String number4 = JOptionPane.showInputDialog("Please enter the 2nd denominator");
    try {
      // Convert String To Integer.
      Integer numerator = Integer.parseInt(number1);
      Integer denominator = Integer.parseInt(number2);
      // Set first Fraction object
      fraction1.setNumerator(numerator);
      fraction1.setDenominator(denominator);
      // Convert String To Integer.
      numerator = Integer.parseInt(number3);
      denominator = Integer.parseInt(number4);
      // Set second Fraction object
      fraction2.setNumerator(numerator);
      fraction2.setDenominator(denominator);
      // calculate addition
      fraction3 = fraction1.add(fraction2);
      String message = fraction1.toString() + " + " + fraction2.toString() + " = "
          + fraction3.toString();
      // calculate subtraction
      fraction3 = fraction1.subtract(fraction2);
      message = message + "\n" + fraction1.toString() + " - " + fraction2.toString() + " = "
          + fraction3.toString();
      // multiply
      fraction3 = fraction1.multiply(fraction2);
      message = message + "\n" + fraction1.toString() + " * " + fraction2.toString() + " = "
          + fraction3.toString();
      // divide
      fraction3 = fraction1.divide(fraction2);
      message = message + "\n" + fraction1.toString() + " / " + fraction2.toString() + " = "
          + fraction3.toString();
      JOptionPane.showMessageDialog(null, message);
    }
    // if user does not enter an integer
    catch (NumberFormatException exception1) {
      JOptionPane.showMessageDialog(null, "Please enter a whole number.");
    }// end of catch
    // if user enters 0 for the denominator
    catch (IllegalFractionException exception2) {
      String message = exception2.toString();
      JOptionPane.showMessageDialog(null, message);
    }// end of catch

    // will not compile because method greatestCommonDivisor() is "private"
    // Fraction f = new Fraction(1,2);
    // f.greatestCommonDivisor(1,2);

  }// End of Main.

}// End of Class.

