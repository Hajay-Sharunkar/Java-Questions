import java.util.Arrays;
public class LibraryBookSorter {
    public static void main(String[] args) {
        int[] bookIds = {42, 7, 19, 7, 3, 99};

        System.out.println("Before sorting: " + Arrays.toString(bookIds));

        int n = bookIds.length;
        int passes =0;
        int swaps =0;

        for (int i = 0; i< n -1; i++) {
            boolean swapped = false;
            passes++;

            for (int j= 0; j < n-1; j++){
                if (bookIds[j] > bookIds[j +1]){
                    int temp = bookIds[j];
                    bookIds[j]=bookIds[j+1];
                    bookIds[j+1] = temp;
                    swaps++;
                    swapped =true;   
                }
            }
            if (!swapped){
                break;
            }
        }
        System.out.println("After sorting: "+ Arrays.toString(bookIds));
        System.out.println("Passes: " + passes+ ", swaps: "+ swaps);
    }
}
