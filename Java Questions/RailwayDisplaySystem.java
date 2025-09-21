import java.util.Scanner;

public class RailwayDisplaySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Railway Station Display Options:");
        System.out.println("1 → Train Timings");
        System.out.println("2 → Train Fare Details");
        System.out.println("3 → Seat Availability");
        System.out.println("4 → Platform Number");
        System.out.println("5 → Exit");
        System.out.print("Enter your option: ");
        int option = sc.nextInt();
        switch (option) {
            case 1:
                System.out.println("Train Timings: Train departs at 10:30 AM and arrives at 5:00 PM.");
                break;
            case 2:
                System.out.println("Train Fare Details: ₹450 for Sleeper, ₹850 for AC.");
                break;
            case 3:
                System.out.println("Seat Availability: 23 seats available in Sleeper, 5 in AC.");
                break;
            case 4:
                System.out.println("Platform Number: Train will arrive at Platform 3.");
                break;
            case 5:
                System.out.println("Thank you! Have a safe journey.");
                break;
            default:
                System.out.println("Invalid option. Please select between 1 and 5.");
        }
        sc.close();
    }
}
