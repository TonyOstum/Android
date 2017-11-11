import java.util.*;

public class cc {
    public static void main(String[] args) {
        int arr[] = new int[999];
        arr[1] = arr[2] = 1;
        for (int i = 2; i < 999; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int I =1;
        while (I <= n) {
            System.out.println(arr[I]);
I++;
        }
    }
}