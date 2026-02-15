import java.util.Scanner;

public class calc {
 public static void main(String[] args) {
   
  Scanner input = new Scanner(System.in);
  String answer = "Yes";
  while (answer.equalsIgnoreCase("yes")) {
  System.out.print("Enter your first number: ");
  double num1 = input.nextDouble();

  System.out.print("Enter your second number: ");
  double num2 = input.nextDouble();
  System.out.println("--Menu--");
  System.out.println("1. Addition");
  System.out.println("2. Subtraction");
  System.out.println("3. Multiplication");
  System.out.println("4. Division");
  System.out.println("Pick your operation from the menu: ");
  int choice = input.nextInt();

 if(choice==1) {
   double sum = num1 + num2;
   System.out.println("Your sum is: " + sum);
   } else if (choice==2) {
       double difference = num1 - num2;
       System.out.println("Your difference is: " + difference);
   } else if (choice==3) {
       double product = num1 * num2;
       System.out.println("Your Product is: " + product);
   } else if (choice==4) {
       double quotient = num1/num2;
       System.out.println("Your quotient is: " + quotient);
   } else {
       System.out.println("You have chosen an invalid option!");
   }
   System.out.println("Do you want to do another calculation? (Yes/No)");
   answer = input.next();
 }
    input.close();  
}
}
  