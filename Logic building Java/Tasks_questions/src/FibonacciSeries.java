import java.util.Scanner;
public class FibonacciSeries {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the number of terms: ");
            int numTerms = scanner.nextInt();

            int firstTerm = 0, secondTerm = 1;

            System.out.println("Fibonacci Sequence:");

            for (int i = 0; i < numTerms; i++) {
                System.out.print(firstTerm + " ");

                int nextTerm = firstTerm + secondTerm;
                firstTerm = secondTerm;
                secondTerm = nextTerm;
            }
        }

}
