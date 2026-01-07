import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfCases = scanner.nextInt();
        for (int j = 0; j < numberOfCases; j++) {
            int isBeautiful = -1;
            int size = scanner.nextInt();
            int[] sequence = new int[size];
            for (int k = 0; k < size; k++) {
                sequence[k] = scanner.nextInt();
                if (k > 0 && isBeautiful != 1 || k > 0 && isBeautiful != 0) {
                    isBeautiful = (sequence[k] - sequence[k - 1] <= 1) ? 0 : 1;
                } else if (k > 1 && isBeautiful != -1 || k > 0 && isBeautiful != 0) {
                    isBeautiful = (sequence[k] - sequence[k - 2] <= 1) ? 1 : isBeautiful;
                }
            }
            System.out.println(isBeautiful);
        }
    }
}
