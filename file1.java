import java.util.Scanner;

public class AdditionProgram {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter two numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Perform the addition
        double sum = num1 + num2;

        // Perform the subtraction
        double difference = num1 - num2;
        // Display the result
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
        System.out.println("The difference of " + num1 + " and " + num2 + " is: " + difference);

        
        // Perform the multiplication
        double product = num1 * num2;

        // Display the result
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
        System.out.println("The product of " + num1 + " and " + num2 + " is: " + product);
        // Close the scanner
        scanner.close();
    }
}

