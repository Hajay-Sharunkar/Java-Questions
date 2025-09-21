import java.util.Scanner;
public class ElectricityBilling {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter Area (Rural/Urban):");
        String area  = sc.nextLine().trim().toLowerCase();

        System.out.println("Enter Units Consume:");
        int units = sc.nextInt();

        boolean isRural = area.equals("Rural");
        boolean isUrban = area.equals("urban");

        boolean getsSubsidy =isRural && units < 100;
        boolean paysSurcharge = isUrban || units > 500;

        if (getsSubsidy) {
            System.out.println("Customer is eligible for subsody. ");
        }
        else {
            System.out.println("Customer is not eligible for subsidy.");
        }
        if (paysSurcharge) {
            System.out.println("Customer has to pay SURCHARGE.");
        } else {
            System.out.println("NO surcharge.");
        }
        sc.close();
    }
    
}
