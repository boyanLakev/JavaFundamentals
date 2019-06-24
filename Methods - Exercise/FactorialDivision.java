import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        double result = factorialDivision(firstNum, secondNum);
        System.out.printf("%.2f", result);
    }

    private static double factorialDivision(int firstNum, int secondNum) {
        double division= factorial(firstNum)/factorial(secondNum);

        return division;
    }

    private static double factorial(int number) {
        double factorial = 1;
        for (int i = 1 + 1; i <= number; i++) {
            factorial *= i;

        }
        return factorial;
    }
}
