import java.util.Arrays;

public class Main {



    public static void main(String[] args) {

        int[] list = arr;

        int pointOfPlus = 0;
        int pointOfMinus = 0;
        int pointOfZero = 0;
        int totalCount = list.length;

        for(int k : list) {
            if (k > 0) {
                pointOfPlus++;
            } else if (k < 0) {
                pointOfMinus++;
            } else {
                pointOfZero++;
            }
        }

        System.out.println(String.format("%.6f", (double)pointOfPlus / (double)totalCount));
        System.out.println(String.format("%.6f", (double)pointOfMinus / (double)totalCount));
        System.out.println(String.format("%.6f", (double)pointOfZero / (double)totalCount));

    }
}
