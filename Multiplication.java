import java.util.Scanner;

public class Multiplication{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int N = sc.nextInt();
        sc.close();
        
        for (int i = 1; i <= 10; System.out.println(N + " x " + i + " = " + (N * i++)));
        
        int i = 1;
        while (i <= 10) System.out.println(N + " x " + i + " = " + (N * i++));
        
        i = 1;
        do System.out.println(N + " x " + i + " = " + (N * i++)); while (i <= 10);
    }
}
