import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the full name as one line
        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();

        // Find the space that separates first name and surname
        int spaceIndex = fullName.indexOf(' ');
        String firstName = fullName.substring(0, spaceIndex);
        String surname = fullName.substring(spaceIndex + 1);

        // Build the initials from the first letter of each part
        String initials = Character.toUpperCase(firstName.charAt(0)) + "." 
                         + Character.toUpperCase(surname.charAt(0)) + ".";

        System.out.println("First name: " + firstName);
        System.out.println("Surname: " + surname);
        System.out.println("Initials: " + initials);

        scanner.close();
    }
}