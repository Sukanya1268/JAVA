import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter balance: ");
        double balance = sc.nextDouble();
        System.out.print("Enter withdrawal amount: ");
        double amount = sc.nextDouble();
        
        
        String result = (amount > 0 && amount <= balance) ? "Withdrawal successful. Remaining balance: " + (balance - amount) : "Insufficient funds or invalid amount.";
        System.out.println(result);
    }
}
