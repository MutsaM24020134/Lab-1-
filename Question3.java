import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for the user's name and age
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Calculate the age five years from now
        int futureAge = age + 5;

        // Print a personalised greeting using both values
        System.out.println("Hello " + name + "! In five years, you will be " + futureAge + " years old.");

        scanner.close();
    }
}