import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i < n; i++) {
            if (isTopNumber(i)) {
                System.out.println(i);
            }

        }
    }

    private static boolean isTopNumber(int number) {
        if (divideBy8(number) && contentOdd(number)) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean contentOdd(int number) {
        boolean result = false;
        while (number > 0) {
            if (number % 2 != 0) {
                result = true;
            }
            number /= 10;
        }
        return result;
    }

    private static boolean divideBy8(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        if (sum % 8 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
