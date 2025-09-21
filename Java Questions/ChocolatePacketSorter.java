import java.util.Scanner;
public class ChocolatePacketSorter {
    public static void pushZerosToEnd(int[] arr, int n){
        int index = 0;

        for (int i=0; i< n; i++){
            if (arr[i] != 0){
                arr[index++]= arr[i];
            }
        }
        while (index < n){
            arr[index++]=0;
        }

        for (int num: arr){
            System.out.println(num +" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr =new int[N];

        for (int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        pushZerosToEnd(arr, N);
    }
}
