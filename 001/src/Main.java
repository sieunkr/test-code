import java.io.*;
import java.util.*;

public class Main {

    // Complete the diagonalDifference function below.
    static int diagonalDifference(int[][] arr) {

        int a = 0;
        int b = 0;

        for(int i = 0; i < arr.length; i++){
            a += arr[i][i];
            b += arr[i][arr.length -1 - i];
        }

        return Math.abs(b-a);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < n; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = diagonalDifference(arr);
        scanner.close();
    }
}
