import java.util.Scanner;

public class PrimeRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        System.out.print("Prime numbers: ");
        for(int i=2; i<=n; i++){
            boolean prime = true;
            for(int j=2; j<=i/2; j++){
                if(i % j == 0){ prime = false; break; }
            }
            if(prime) System.out.print(i + " ");
        }
    }
}
