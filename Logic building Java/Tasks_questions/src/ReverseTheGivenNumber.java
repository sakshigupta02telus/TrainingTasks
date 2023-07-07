import java.util.Scanner;
public class ReverseTheGivenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int reversedNumber = reverseNumber(number);
        System.out.println("Reversed number: " + reversedNumber);
    }

    public static int reverseNumber(int number) {
        int reversedNumber = 0;

        while (number != 0) {
            int remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number /= 10;
        }

        return reversedNumber;
    }

}