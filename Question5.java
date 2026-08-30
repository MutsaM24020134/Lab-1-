import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read both numbers as doubles so the quotient keeps its decimal places
        System.out.print("Enter the first number: ");
        double firstNumber = Double.parseDouble(scanner.next());

        System.out.print("Enter the second number: ");
        double secondNumber = Double.parseDouble(scanner.next());

        // Perform the calculations
        double sum = firstNumber + secondNumber;
        double difference = firstNumber - secondNumber;
        double product = firstNumber * secondNumber;
        double quotient = firstNumber / secondNumber;
        double remainder = firstNumber % secondNumber;

        // Print each result on its own labelled line
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

        scanner.close();
    }
}