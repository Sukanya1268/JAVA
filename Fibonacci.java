import java.util.Scanner;

public class Fibonacci{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number ");
        int n = sc.nextInt();
        int a = 0, b = 1, temp= 0;
        System.out.print("Fibonacci Series: " + a + " " + b);
        
        do {
            int next = a + b;
            System.out.print(" " + next);
            a = b;
            b = temp;
            temp ++;
        } while (temp < n - 2);
    }
}
