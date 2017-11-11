
        import java.util.Scanner;
public class ssd{
    public static void main(String [] args) {
        Scanner read = new Scanner(System.in);
        int n;
        n = read.nextInt();
        int[] arr;
        arr = new int[n];
        int i, j;
        for (i = 0; i < arr.length; i++) {
            arr[i] = read.nextInt(); //
        }
        fun(arr);
    }
    private static void
    fun(int[] array) {
        int j, k, t;
        t = 0;
        for (j = 0; j < array.length - 1; j++) {
            for (k = 0; k < array.length - 1 - j; k++) {
                if (array[k] < array[k + 1]) {
                    t = array[k];
                    array[k] = array[k + 1];
                    array[k + 1] = t;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}