package aboutt;

import java.util.Arrays;
import java.util.Scanner;

public class massivs3o1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arr[] = new int[3];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }
}
