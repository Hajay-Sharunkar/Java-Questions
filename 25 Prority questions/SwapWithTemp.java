import java.util.Scanner;
public class SwapWithTemp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt(), b = sc.nextInt();
        int temp = a; a = b; b = temp;
        System.out.println("After Swap: a=" + a + " b=" + b);
    }
}
