import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read a full sentence from the user
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // Inspect and transform the sentence using String methods
        int length = sentence.length();
        String upperCase = sentence.toUpperCase();
        String lowerCase = sentence.toLowerCase();
        boolean containsJava = sentence.contains("Java");

        System.out.println("Length: " + length);
        System.out.println("Upper case: " + upperCase);
        System.out.println("Lower case: " + lowerCase);
        System.out.println("Contains \"Java\": " + containsJava);

        scanner.close();
    }
}