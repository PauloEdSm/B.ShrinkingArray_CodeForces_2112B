import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfCases = scanner.nextInt();
        for (int j = 0; j < numberOfCases; j++) {
            int isBeautiful = -1;
            int size = scanner.nextInt();
            if (size == 1) {
                System.out.println(-1);
                scanner.nextInt();
                continue;
            }
            int[] sequence = new int[size];
            for (int k = 0; k < size; k++) {
                sequence[k] = scanner.nextInt();
            }
            for (int k = 1; k < size; k++) {
                if (Math.abs(sequence[k] - sequence[k - 1]) <= 1) {
                    isBeautiful = 0;
                    break;
                }
            }
            if (isBeautiful != 0) {
                for (int k = 2; k < size; k++) {
                    int min = Math.min(sequence[k - 2], sequence[k - 1]);
                    int max = Math.max(sequence[k - 2], sequence[k - 1]);
                    if (Math.abs(min - sequence[k]) <= 1 || Math.abs(max - sequence[k]) <= 1 ||
                            (min <= sequence[k] && sequence[k] <= max)) {
                        isBeautiful = 1;
                        break;
                    }
                }
                if (isBeautiful != 1 && size > 2) {
                    int min = Math.min(sequence[0], sequence[1]);
                    int max = Math.max(sequence[0], sequence[1]);
                    if (Math.abs(min - sequence[2]) <= 1 || Math.abs(max - sequence[2]) <= 1 ||
                            (min <= sequence[2] && sequence[2] <= max)) {
                    }
                }
            }
            System.out.println(isBeautiful);
        }
    }
}