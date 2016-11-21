import java.util.Scanner;

public class RudeQuestions {
  public static void main(String[] args) {
    String name;
    int age;
    double weight, income;

    Scanner keyboard = new Scanner(System.in);
    System.out.print("Hello, What is your name? ");
    name = keyboard.next();

    System.out.print("Hi, " + name + "! How old are you? ");
    age = keyboard.nextInt();

    System.out.println("So you're " + age + ", eh? That's not very old.");
    System.out.print("How much do you weigh, " + name + "? ");
    weight = keyboard.nextDouble();

    System.out.println(weight + "! I Better keep that quiet!!");
    System.out.print("Finally, what's your income, " + name + "? ");
    income = keyboard.nextDouble();

    System.out.print("Hopefully that is " + income + " per hour");
    System.out.println(" and not per year!");

    System.out.print("Well, thanks for answering my rude questions, ");
    System.out.println(name + ".");

    String mamaInsult;
    System.out.print("How fat is your mama? ");
    mamaInsult = keyboard.next();
    System.out.println("Dear " + name + "'s mama: " + name +
                       "says you are \"" + mamaInsult + "\" fat.");

  }
}

// The program will not blow up if a integer is entered when a
//   double is expected. An integer can easily be converted to
//   a double

// The program will not blow up if a number is entered when a
//   string is expected. A string can contain numeric characters

// Non-numeric values will blow the program up when ints or
//    doubles are expected
// An EOF (ctrl-D) will cause a blow up when strings are expected
