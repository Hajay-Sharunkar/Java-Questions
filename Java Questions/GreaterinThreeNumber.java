import java.util.*;
public class GreaterinThreeNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first value:  ");
        int a = sc.nextInt();

        System.out.println("Enter your secong value: ");

        int b = sc.nextInt();

        System.out.println("Enter the third value:");
        int c = sc.nextInt();

        if (a >= b && a>=c){
            System.out.println("A is Greater :" + a);
        }
        else if(b >= a && b>c){
            System.out.println("B is greater: "+ b);
        }
        else{
            System.out.println("C is greater:" + c);
        }

    }
}