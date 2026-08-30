import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the rectangle's dimensions
        System.out.print("Enter the length: ");
        double length = Double.parseDouble(scanner.next());

        System.out.print("Enter the width: ");
        double width = Double.parseDouble(scanner.next());

        // Calculate area and perimeter
        double area = length * width;
        double perimeter = 2 * (length + width);

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);

        scanner.close();
    }
}