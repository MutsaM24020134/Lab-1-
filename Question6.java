import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read three test scores on one line, separated by spaces
        System.out.print("Enter three scores: ");
        double score1 = Double.parseDouble(scanner.next());
        double score2 = Double.parseDouble(scanner.next());
        double score3 = Double.parseDouble(scanner.next());

        // Calculate the average, keeping full decimal precision
        double average = (score1 + score2 + score3) / 3;

        System.out.println("Average: " + average);

        scanner.close();
    }
}