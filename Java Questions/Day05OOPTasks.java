import java.util.Scanner;
class ATM {
    private double balance;
    public ATM(double initialBalance) {
        this.balance = initialBalance;
    }
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Transaction Successful");
        } else {
            System.out.println("Insufficient Balance");
        }
    }
}
class ShoppingCart {
    public void applyDiscount(double purchaseAmount) {
        double discount = 0;
        if (purchaseAmount >= 5000) {
            discount = 0.20 * purchaseAmount;
        } else if (purchaseAmount >= 2000) {
            discount = 0.10 * purchaseAmount;
        }
        double finalAmount = purchaseAmount - discount;
        System.out.println("Discount Applied: ₹" + discount);
        System.out.println("Final Amount to Pay: ₹" + finalAmount);
    }
}
class TrafficSignal {
    public void showSignal(String color) {
        switch (color.toLowerCase()) {
            case "red":
                System.out.println("Stop");
                break;
            case "yellow":
                System.out.println("Get Ready");
                break;
            case "green":
                System.out.println("Go");
                break;
            default:
                System.out.println("Invalid Signal Color");
        }
    }
}
public class Day05OOPTasks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ATM atm = new ATM(10000.0); 
        System.out.print("Enter withdrawal amount: ");
        double withdrawAmount = sc.nextDouble();
        atm.withdraw(withdrawAmount);
        System.out.println(); 
        ShoppingCart cart = new ShoppingCart();
        System.out.print("Enter total purchase amount: ");
        double purchaseAmount = sc.nextDouble();
        cart.applyDiscount(purchaseAmount);
        System.out.println(); 
        TrafficSignal signal = new TrafficSignal();
        System.out.print("Enter signal color (Red/Yellow/Green): ");
        String color = sc.next();
        signal.showSignal(color);
        sc.close();
    }
}
