import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt(), temp = n, sum = 0;
        while(temp > 0){
            int d = temp % 10;
            sum += d*d*d;  // for 3-digit numbers
            temp /= 10;
        }
        System.out.println(n == sum ? "Armstrong" : "Not Armstrong");
    }
}
