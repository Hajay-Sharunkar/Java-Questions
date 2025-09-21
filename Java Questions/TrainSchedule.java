import java.util.Scanner;

public class TrainSchedule {
    public static void findNextTrain(int[] departures, int passengerTime) {
        int low = 0;
        int high = departures.length - 1;
        int nextTrainIndex = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (departures[mid] == passengerTime) {
                System.out.println("Train departs exactly at " + passengerTime);
                return;
            } else if (departures[mid] > passengerTime) {
                nextTrainIndex = mid; // potential next train
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        if (nextTrainIndex != -1) {
            System.out.println("Next available train is at " + departures[nextTrainIndex]);
        } else {
            System.out.println("No trains available today");
        }
    }

    public static void main(String[] args) {
        int[] departures = {600, 945, 1130, 1345, 1530, 1900, 2130};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter passenger time: ");
        int passengerTime = scanner.nextInt();

        findNextTrain(departures, passengerTime);
    }
}
