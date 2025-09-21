import java.util.Scanner;

public class OddProductCalculator {
    public static int calculateProduct(int M, int N) {
        if (M > N) {
            System.out.println("Invalid Range");
            return 1;
        }

        if (M == N && M % 2 != 0) {
            return M;
        }

        int product = 1;
        boolean foundOdd = false;

        for (int i = M; i <= N; i++) {
            if (i % 2 != 0 && i % 5 != 0) {
                product *= i;
                foundOdd = true;
                if (product > 100000) {
                    System.out.println("Product too large");
                    return -1;
                }
            }
        }

        if (!foundOdd) {
            return 0;
        }

        return product;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter M: ");
        int M = sc.nextInt();
        System.out.print("Enter N: ");
        int N = sc.nextInt();

        int result = calculateProduct(M, N);
        if (result != -1 && !(M > N)) {
            System.out.println(result);
        }
    }
}
