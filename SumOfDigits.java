import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt(), sum = 0;
        scanner.close();
        
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        
        System.out.println("Sum of digits: " + sum);
    }
}