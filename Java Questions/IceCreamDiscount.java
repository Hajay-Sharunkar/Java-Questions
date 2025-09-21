import java.util.Scanner;
public class IceCreamDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter flavor (V/C/S/M): ");
        String flavor = sc.nextLine().trim().toUpperCase();

        System.out.println("Enter price: ");
        double price = sc.nextDouble();
        double discount = 0;

        if (flavor.equals("v")){
            discount=0.10;
        }else if (flavor.equals("c")){
            discount=0.15;
        } else if (flavor.equals("S")){
            discount= 0.20;
        } else if (flavor.equals("M")){
            discount=0.05;
        } else{
            discount= 0.0;
        }

        double finalPrice = price -(price * discount);

        System.out.println("Final price:" + (int)finalPrice);
    
    }
    
    
}
