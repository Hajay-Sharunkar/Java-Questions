import java.util.Scanner;
public class FoodOrderingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the food item: ");
        String item = sc.nextLine().trim().toLowerCase();
        switch (item) {
            case "pizza":
                System.out.print("Enter the size (Small/Medium/Large): ");
                String size = sc.nextLine().trim().toLowerCase();
                switch (size) {
                    case "small":
                        System.out.println("Your Pizza costs ₹150");
                        break;
                    case "medium":
                        System.out.println("Your Pizza costs ₹250");
                        break;
                    case "large":
                        System.out.println("Your Pizza costs ₹350");
                        break;
                    default:
                        System.out.println("Invalid size for Pizza!");
                }
                break;
            case "burger":
                System.out.print("Enter the type (Veg/Chicken): ");
                String type = sc.nextLine().trim().toLowerCase();
                switch (type) {
                    case "veg":
                        System.out.println("Your Burger costs ₹120");
                        break;
                    case "chicken":
                        System.out.println("Your Burger costs ₹180");
                        break;
                    default:
                        System.out.println("Invalid type for Burger!");
                }
                break;
            case "pasta":
                System.out.print("Enter the flavor (White Sauce/Red Sauce): ");
                String flavor = sc.nextLine().trim().toLowerCase();
                switch (flavor) {
                    case "white sauce":
                        System.out.println("Your Pasta costs ₹200");
                        break;
                    case "red sauce":
                        System.out.println("Your Pasta costs ₹220");
                        break;
                    default:
                        System.out.println("Invalid flavor for Pasta!");
                }
                break;
            case "salad":
                System.out.println("Your Salad costs ₹100");
                break;
            default:
                System.out.println("Sorry, item not available!");
        }
        sc.close();
    }
}