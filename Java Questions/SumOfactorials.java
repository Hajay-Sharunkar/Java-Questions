import java.util.Scanner;
public class SumOfactorials {
    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter M: ");
        int M = sc.nextInt();
        System.out.print("Enter N: ");
        int N = sc.nextInt();
        if (M > N) {
            System.out.println("0");
        } else {
            int sum = 0;
            for (int i = M; i <= N; i++) {
                sum += factorial(i);
            }
            System.out.println(sum);
        }
        sc.close();
    }
}