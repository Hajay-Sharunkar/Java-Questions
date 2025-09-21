public class LargestNumber {
    public static void main(String[] args) {
        int firstNumber = 25;
        int secondNumber = 40;
        if (firstNumber > secondNumber) {
            System.out.println("The largest number is: " + firstNumber);
        } else if (secondNumber > firstNumber) {
            System.out.println("The largest number is: " + secondNumber);
        } else {
            System.out.println("Both numbers are equal.");
        }
    }
}
