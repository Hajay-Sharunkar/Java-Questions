public class RangeProductCalculator {
    public static void main(String[] args) {
        calculateProduct(2, 6);
        calculateProduct(9, 3);
    }
    public static void calculateProduct(int M, int N) {
        if (M > N) {
            System.out.println("Invalid range: M is greater than N. Returning 1.");
            System.out.println("Output: 1\n");
            return;
        }
        int product = 1;
        for (int i = M; i <= N; i++) {
            product *= i;
        }
        System.out.println("Product of integers from " + M + " to " + N + " is: " + product + "\n");
    }
}