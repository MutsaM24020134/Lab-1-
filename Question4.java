import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read a whole number
        System.out.print("Enter a whole number: ");
        int number = scanner.nextInt();

        // Read the decimal as text first, then convert it manually
        System.out.print("Enter a decimal number: ");
        String decimalText = scanner.next();
        double decimal = Double.parseDouble(decimalText);

        // Read a single word
        System.out.print("Enter a single word: ");
        String word = scanner.next();

        // Print all three values back in one sentence
        System.out.println("You entered " + number + ", " + decimal + ", and the word \"" + word + "\".");

        scanner.close();
    }
}