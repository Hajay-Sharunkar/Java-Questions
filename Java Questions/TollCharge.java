import java.util.Scanner;
public class TollCharge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter vehicle type (Car/Bus/Truck): ");
        String vehicle = sc.nextLine().trim().toLowerCase();
        System.out.print("Enter number of axles: ");
        int axles = sc.nextInt();
        int charge = 0;
        switch (vehicle) {
            case "car": charge = 100; break;
            case "bus": charge = 200; break;
            case "truck": charge = 300; break;
            default: System.out.println("Invalid vehicle type"); return;
        }
        if (axles > 3) {
            charge += 50;
        }
        System.out.println("Toll Charge: ₹" + charge);
        sc.close();
    }
}
