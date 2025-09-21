import java.util.Scanner;
public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt(), count = 0;
        do{
            count++;
            n /= 10;
        } while(n > 0);
        System.out.println("Number of digits = " + count);
    }
}
