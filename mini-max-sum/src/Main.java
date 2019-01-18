import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] arr = new int[5];

        arr[0] = 256741038;
        arr[1] = 623958417;
        arr[2] = 467905213;
        arr[3] = 714532089;
        arr[4] = 938071625;

        miniMaxSum(arr);
    }

    static void miniMaxSum(int[] arr) {

        long sum = 0;

        for (int anArr : arr) {
            sum = sum + anArr;
        }

        Arrays.sort(arr);
        
        System.out.println((sum - arr[arr.length-1]) + " " + (sum - arr[0]));
    }
}
