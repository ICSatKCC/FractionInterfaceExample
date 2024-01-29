import java.util.Scanner;
/**
 * Ask user for numerator & denominator of two Fractions. 
 * Output fraction addition, subtraction,
 * multiplication, and division using the Fraction class
 * 
 * @author Lisa Miller, from William Albritton
 * @since 1/28/24
 */
public class FractionCalculator {

   /**
    * main() method: begins program.
    * 
    * @param arguments is not used
    */
   public static void main(String[] arguments) {
      Scanner scan = new Scanner(System.in);
      String s1, s2, s3, s4;
   
      // Create three Fractions
      // If A Class Implements an Interface,
      // Then We Can Use The Interface To Declare A Variable.
      // Syntax: InterfaceName variableName = new Constructor(parameters);
      FractionInterface fraction1 = new Fraction(0, 1);
      FractionInterface fraction2 = new Fraction(0, 1);
      FractionInterface fraction3 = new Fraction(0, 1);
      // get user input
      System.out.println("Please enter a numerator");
      s1 = scan.nextLine();
      System.out.println("Please enter a denominator");
      s2 = scan.nextLine();
      System.out.println("Please enter a 2nd numerator");
      s3 = scan.nextLine();
      System.out.println("Please enter a 2nd denominator");
      s4 = scan.nextLine();
      try {
         // Convert String To Integer.
         Integer numerator = Integer.parseInt(s1);
         Integer denominator = Integer.parseInt(s2);
         // Set first Fraction object
         fraction1.setNumerator(numerator);
         fraction1.setDenominator(denominator);
         // Convert String To Integer.
         numerator = Integer.parseInt(s3);
         denominator = Integer.parseInt(s4);
         // Set second Fraction object
         fraction2.setNumerator(numerator);
         fraction2.setDenominator(denominator);
         // calculate addition
         fraction3 = fraction1.add(fraction2);
         String message = fraction1.toString() + " + " + fraction2.toString();
         message += " = " + fraction3.toString();
         // calculate subtraction
         fraction3 = fraction1.subtract(fraction2);
         message = message + "\n" + fraction1.toString();
         message +=  " - " + fraction2.toString();
         message += " = " + fraction3.toString();
         // multiply
         fraction3 = fraction1.multiply(fraction2);
         message = message + "\n" + fraction1.toString();
         message += " * " + fraction2.toString();
         message += " = " + fraction3.toString();
         // divide
         fraction3 = fraction1.divide(fraction2);
         message = message + "\n" + fraction1.toString();
         message += " / " + fraction2.toString();
         message += " = " + fraction3.toString();
         System.out.println(message);
      }
       // if user does not enter an integer
      catch (NumberFormatException exception1) {
         System.out.println("Please enter a whole number.");
      } // end of catch
       // if user enters 0 for the denominator
      catch (IllegalFractionException exception2) {
         System.out.println(exception2.getMessage());
      } // end of catch
   
      // will not compile because method greatestCommonDivisor() is "private"
      // Fraction f = new Fraction(1,2);
      // f.greatestCommonDivisor(1,2);
   
   } // End of Main.

} // End of Class.

