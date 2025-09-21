import java.util.Scanner;
public class LargestofTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number: ");
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println("Largest= " + (a>b ? a:b));
    }
}
