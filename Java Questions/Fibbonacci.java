import java.util.*;
public class Fibbonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int firstNumber= 0;
        int secondnumber =1;

        for (int i =1; i <=a; i ++){
            System.out.println(firstNumber);
            int thirdnumber = firstNumber + secondnumber;
            firstNumber = secondnumber;
            secondnumber= thirdnumber;
        }
    }    
}
