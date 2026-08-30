import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the temperature in Celsius
        System.out.print("Enter the temperature in Celsius: ");
        double celsius = Double.parseDouble(scanner.next());

        // Convert to Fahrenheit using the standard formula
        double fahrenheit = celsius * 9.0 / 5 + 32;

        System.out.println(celsius + " degrees Celsius is " + fahrenheit + " degrees Fahrenheit.");

        scanner.close();
    }
}