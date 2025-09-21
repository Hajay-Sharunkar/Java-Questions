import java.util.Scanner;
public class LibraryAccess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter membership type (Premium/Standard): ");
        String membershipType = sc.nextLine().trim().toLowerCase();
        System.out.print("Enter number of pending books: ");
        int pendingBooks = sc.nextInt();
        System.out.print("Enter behavior score (0–100): ");
        int behaviorScore = sc.nextInt();
        String accessStatus;
        if (pendingBooks > 5) {
            accessStatus = "Blocked";
        } else if (behaviorScore < 50) {
            accessStatus = "Counsel Required";
        } else if (membershipType.equals("premium") && pendingBooks == 0 && behaviorScore >= 90) {
            accessStatus = "Full Access";
        } else if (membershipType.equals("standard") && pendingBooks <= 2 && behaviorScore >= 70) {
            accessStatus = "Limited Access";
        } else {
            accessStatus = "Access Pending";
        }
        System.out.println("Library Access Status: " + accessStatus);
        sc.close();
    }
}