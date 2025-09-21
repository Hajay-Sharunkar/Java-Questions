import java.util.Scanner;
public class TrafficSignal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter signal number (1/2/3): ");
        int signal = sc.nextInt();
        switch (signal) {
            case 1: System.out.println("Stop"); break;
            case 2: System.out.println("Ready"); break;
            case 3: System.out.println("Go"); break;
            default: System.out.println("Invalid Signal");
        }
        sc.close();
    }
}