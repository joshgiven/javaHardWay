import java.util.Scanner;

public class BMICalculator {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    double m, kg, bmi;
    double ft, inches, lbs;

    System.out.print("Your height (feet only): ");
    ft = keyboard.nextDouble();
    System.out.print("Your height (inches only): ");
    inches = keyboard.nextDouble();
    m = (ft*12 + inches) * 0.0254;

    System.out.print("Your Weight in pounds: ");
    lbs = keyboard.nextDouble();
    kg = lbs * 0.453592;

    bmi = kg/(m*m);

    System.out.println("Your BMI is " + bmi);
  }
}
