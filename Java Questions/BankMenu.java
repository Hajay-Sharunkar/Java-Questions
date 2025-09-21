import java.util.Scanner;
public class BankMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bank Menu:");
        System.out.println("1 → Check Balance");
        System.out.println("2 → Deposit");
        System.out.println("3 → Withdraw");
        System.out.println("4 → Exit");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1: System.out.println("Check Balance"); break;
            case 2: System.out.println("Deposit"); break;
            case 3: System.out.println("Withdraw"); break;
            case 4: System.out.println("Exit"); break;
            default: System.out.println("Invalid Option");
        }
        sc.close();
    }
}