import java.util.Scanner;

public class Calc2 {
  public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     String answer = "yes";

     while (answer.equalsIgnoreCase("Yes")) {
     
        double num1 = getNumber(input , "Enter your first number: ");
        double num2 = getNumber(input , "Enter your second number: ");

        printMenu();
        int choice = input.nextInt();

        performOperation(num1, num2, choice);

        answer = getAnswer(input , "Do you want to do another calculation? (Yes/No)");
     }
  input.close();
  }
  
  public static double getNumber (Scanner input, String prompt) {
     System.out.print(prompt);
     return input.nextDouble();
  }

  public static void printMenu() {
    System.out.println("--Menu--");
    System.out.println("1. Addition");
    System.out.println("2. Subtraction");
    System.out.println("3. Multiplication");
    System.out.println("4. Division");
    System.out.println("Choose an operation from the menu");
  }
  
  public static void performOperation(double num1, double num2, int choice) {
    double result;
    switch (choice) {
      case 1: 
         result = num1 + num2;
         System.out.println("Your sum is: " + result);
         break;
      case 2:
         result = num1 - num2;
         System.out.println("Your difference is: " + result);
         break;
      case 3:
         result = num1 * num2;
         System.out.println("Your product is: " + result);
         break;
      case 4:
         result = num1 / num2;
         System.out.println("Your quotient is: " + result);
         break;
      default: 
         System.out.print("You have selected an invalid option!"); 
    }
  }
  
  public static String getAnswer(Scanner input, String prompt){
      System.out.println("Do you want to carry out another calculation? (Yes/No)");
      return input.next();
  }
}