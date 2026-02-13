import java.util.Scanner;

public class calc {
 public static void main(String[] args) {
   
  Scanner input = new Scanner(System.in);
  
  System.out.print("Enter your first number: ");
  double num1 = input.nextDouble();

  System.out.print("Enter your second number: ");
  double num2 = input.nextDouble();

  System.out.println("--Menue--");
  System.out.println("1. Addition");
  System.out.println("2. Subtraction");
  System.out.println("3. Multiplication");
  System.out.println("4. Division");
  System.out.println("Pick your operation from the menue: ");
  int choice = input.nextInt();

 if(choice==1) {
   double sum = num1 + num2;
   System.out.print("Your sum is: " + sum);
   } else if (choice==2) {
       double difference = num1 - num2;
       System.out.print("Your difference is: " + difference);
   } else if (choice==3) {
       double product = num1 * num2;
       System.out.print("Your Product is: " + product);
   } else if (choice==4) {
       double quotient = num1/num2;
       System.out.print("Your quotient is: " + quotient);
   }
     
  input.close();
 }
}
  